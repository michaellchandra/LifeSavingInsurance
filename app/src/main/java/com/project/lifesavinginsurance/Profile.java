package com.project.lifesavinginsurance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import Account.User;

public class Profile extends AppCompatActivity {

    private Button profile_button_logout;
    private TextView profile_textView_noTelp, profile_textView_umur, profile_textView_ttl,  profile_textView_nama, profile_textView_email ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        profile_button_logout = findViewById(R.id.profile_button_logout);

        profile_textView_umur = findViewById(R.id.profile_textView_umur);
        profile_textView_ttl = findViewById(R.id.profile_textView_ttl);
        profile_textView_noTelp = findViewById(R.id.profile_textView_noTelp);
        profile_textView_nama = findViewById(R.id.profile_textView_nama);
        profile_textView_email = findViewById(R.id.profile_textView_email);

        Intent intent = new Intent();
        intent = getIntent();

        User user = intent.getParcelableExtra("IDnama");

        profile_textView_nama.setText(user.getNama());

        profile_button_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), LoginMenu.class);
                startActivity(intent);
                finish();
            }
        });



    }
}