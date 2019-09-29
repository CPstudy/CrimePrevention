package com.kang.crimeprevention;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SettingActivity extends AppCompatActivity {

    EditText edtID;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        edtID = findViewById(R.id.edtIP);
        btnNext = findViewById(R.id.btnNext);

        SharedPreferences sf = getSharedPreferences("sFile", MODE_PRIVATE);
        edtID.setText(sf.getString("IP", "218.152.155.209:5000"));

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sf = getSharedPreferences("sFile", MODE_PRIVATE);
                SharedPreferences.Editor sfEditor = sf.edit();
                sfEditor.putString("IP", edtID.getText().toString());
                sfEditor.apply();
                sfEditor.commit();
                finish();
            }
        });

    }
}
