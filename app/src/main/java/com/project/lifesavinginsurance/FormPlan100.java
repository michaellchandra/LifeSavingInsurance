package com.project.lifesavinginsurance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toolbar;

import com.google.android.material.textfield.TextInputLayout;

import Account.DataPemegangPolis;


public class FormPlan100 extends AppCompatActivity {

    private Toolbar formplan_toolbar;
    private TextInputLayout form_textinput_namacalon,form_textinput_umurcalon, form_textinput_namapemegang, form_textinput_umurpemegang, form_textinput_hubungan, form_textinput_uangpertanggungan, form_textinput_masapembayaran;
    private RadioGroup form_radioGroup;
    private RadioButton form_radioButton1, form_radioButton2;
    private Button form_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_plan100);

        form_textinput_namacalon=findViewById(R.id.form_textinput_namacalon);
        form_textinput_umurcalon=findViewById(R.id.form_textinput_umurcalon);
        form_textinput_namapemegang = findViewById(R.id.form_textinput_namapemegang);
        form_textinput_umurpemegang = findViewById(R.id.form_textinput_umurpemegang);
        form_textinput_hubungan = findViewById(R.id.form_textinput_hubungan);
        form_textinput_uangpertanggungan = findViewById(R.id.form_textinput_uangpertanggungan);
        form_textinput_masapembayaran = findViewById(R.id.form_textinput_masapembayaran);
        form_radioGroup = findViewById(R.id.form_radioGroup);
        form_radioButton1 = findViewById(R.id.form_radioButton1);
        form_radioButton2 = findViewById(R.id.form_radioButton2);
        form_button = findViewById(R.id.form_button);

        form_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namaA= "Plan100";
                String namac =form_textinput_namacalon.getEditText().getText().toString().trim();
                int umurc = Integer.parseInt(form_textinput_umurcalon.getEditText().getText().toString().trim());
                String namap = form_textinput_namapemegang.getEditText().getText().toString().trim();
                int umurp = Integer.parseInt(form_textinput_umurpemegang.getEditText().getText().toString().trim());
                String hubungan = form_textinput_hubungan.getEditText().getText().toString().trim();
                long Uang = Long.parseLong(form_textinput_uangpertanggungan.getEditText().getText().toString().trim());
                int masa = Integer.parseInt(form_textinput_masapembayaran.getEditText().getText().toString().trim());
                DataPemegangPolis polis = new DataPemegangPolis(namaA,namac,namap,hubungan,umurc,umurp,masa,Uang);
                Intent intent = new Intent(getBaseContext(),MenuToolbar.class);
                intent.putExtra("NamaBaru", String.valueOf(polis));
                setResult(200, intent);
                startActivity(intent);
            }
        });


    }
}