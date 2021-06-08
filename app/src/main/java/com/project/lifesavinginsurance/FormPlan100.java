package com.project.lifesavinginsurance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;


public class FormPlan100 extends AppCompatActivity {

    private Toolbar formplan_toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_plan100);


        formplan_toolbar = findViewById(R.id.formplan_toolbar);

        formplan_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), AsuransiTradisional.class);
                startActivity(intent);
                finish();
            }
        });
    }
}