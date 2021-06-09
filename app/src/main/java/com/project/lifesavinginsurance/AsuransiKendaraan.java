package com.project.lifesavinginsurance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class AsuransiKendaraan extends AppCompatActivity {
    private RadioGroup kendaraan_radiogroup;
    private RadioButton kendaraan_radiobutton1, kendaraan_radiobutton2, kendaraan_radiobutton3;
    private TextInputLayout kendaraan_textinput_harga;
    private Button kendarran_button;
    private ImageView kendaraan_imageview_back;
    private TextView kendaraan_biayapremi, kendaraan_hargamobil, kendaraan_hasil;
    String wilayah="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asuransi_kendaraan);
        kendaraan_radiogroup= findViewById(R.id.kendaraan_radiogroup);
        kendaraan_radiobutton1 = findViewById(R.id.kendaraan_radiobutton1);
        kendaraan_radiobutton2 = findViewById(R.id.kendaraan_radiobutton2);
        kendaraan_radiobutton3 = findViewById(R.id.kendaraan_radiobutton3);
        kendaraan_textinput_harga = findViewById(R.id.kendaraan_textinput_harga);
        kendarran_button = findViewById(R.id.kendarran_button);
        kendaraan_biayapremi = findViewById(R.id.kendaraan_biayapremi);
        kendaraan_hargamobil = findViewById(R.id.kendaraan_hargamobil);
        kendaraan_hasil = findViewById(R.id.kendaraan_hasil);
        kendaraan_imageview_back = findViewById(R.id.kendaraan_imageview_back);

        kendaraan_imageview_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), HomeMenu.class);
            }
        });
        kendarran_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkId = kendaraan_radiogroup.getCheckedRadioButtonId();
                long harga = Long.parseLong(kendaraan_textinput_harga.getEditText().getText().toString().trim());
                findRadioButton(checkId);
                double bunga = 0;
                if(wilayah=="Wilayah1"){
                    if(harga<=125000000){
                        bunga = 3.82;
                    }else if(harga>125000000){
                        bunga = 2.67;
                    }else if(harga>200000000){
                        bunga = 2.18;
                    }else if(harga>400000000){
                        bunga = 1.20;
                    }else if(harga>800000000){
                        bunga = 1.05;
                    }
                }else if(wilayah == "Wilayah2"){
                    if(harga<=125000000){
                        bunga = 3.26;
                    }else if(harga>125000000){
                        bunga = 2.47;
                    }else if(harga>200000000){
                        bunga = 2.08;
                    }else if(harga>400000000){
                        bunga = 1.20;
                    }else if(harga>800000000){
                        bunga = 1.16;
                    }
                }else if(wilayah == "Wilayah3"){
                    if(harga<=125000000){
                        bunga = 2.53;
                    }else if(harga>125000000){
                        bunga = 2.69;
                    }else if(harga>200000000){
                        bunga = 2.79;
                    }else if(harga>400000000){
                        bunga = 1.14;
                    }else if(harga>800000000){
                        bunga = 1.05;
                    }
                }

                kendaraan_biayapremi.setText(String.valueOf(bunga));
                kendaraan_hargamobil.setText(String.valueOf(harga));
                long hasil = (long) ((bunga/100) *harga);
                kendaraan_hasil.setText(String.valueOf(hasil));
            }

            private void findRadioButton(int checkId) {
                switch(checkId){
                    case R.id.kendaraan_radiobutton1:
                        wilayah="Wilayah1";
                        break;
                    case R.id.kendaraan_radiobutton2:
                        wilayah="Wilayah2";
                        break;
                    case R.id.kendaraan_radiobutton3:
                        wilayah ="Wilayah3";
                }
            }
        });
        
        
    }
}