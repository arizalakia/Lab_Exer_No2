package com.example.lab_exer_no2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class VerifyUAAP extends MainActivity {

    EditText etValidate;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_uaap);
        etValidate = findViewById(R.id.et_validate);
    }

    public void validate(View v) {
        sp=getSharedPreferences("data1", MODE_PRIVATE);
        String school1SP = sp.getString("school1", null);
        String school2SP = sp.getString("school2", null);
        String school3SP = sp.getString("school3", null);
        String school4SP = sp.getString("school4", null);
        String school5SP = sp.getString("school5", null);
        String school6SP = sp.getString("school6", null);
        String school7SP = sp.getString("school7", null);
        String school8SP = sp.getString("school8", null);
        String school = etValidate.getText().toString();

        if(school1SP.equals(school) || school2SP.equals(school) || school3SP.equals(school)|| school4SP.equals(school)|| school5SP.equals(school)||
                school6SP.equals(school) || school7SP.equals(school) || school8SP.equals(school)){
            Toast.makeText(this, "School is competing in UAAP..", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "School is not competing in UAAP..", Toast.LENGTH_LONG).show();
        }



    }
}
