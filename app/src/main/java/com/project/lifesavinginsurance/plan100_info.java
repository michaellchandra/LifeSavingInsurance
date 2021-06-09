package com.project.lifesavinginsurance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class plan100_info extends AppCompatActivity {
    TextView plan100_card_namac, plan100_card_umur,plan100_card_jeniskelamin, plan100_card_namap,plan100_card_umurp, plan100_card_hubungan, plan100_card_uangp,plan100_card_pembayaran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan100_info);
        plan100_card_namac =findViewById(R.id.plan100_card_namac);
        plan100_card_umur = findViewById(R.id.plan100_card_umur);
         plan100_card_jeniskelamin = findViewById(R.id.plan100_card_jeniskelamin);
         plan100_card_namap = findViewById(R.id.plan100_card_namap);
        plan100_card_umurp = findViewById(R.id.plan100_card_umurp);
        plan100_card_hubungan = findViewById(R.id.plan100_card_hubungan);
        plan100_card_uangp = findViewById(R.id.plan100_card_uangp);
        plan100_card_pembayaran = findViewById(R.id.plan100_card_pembayaran);
        plan100_card_namac.setText(getIntent().getStringExtra("namac"));
        plan100_card_umur.setText(getIntent().getStringExtra("umurc"));
        plan100_card_jeniskelamin.setText(getIntent().getStringExtra("jeniskelamin"));

    }
}