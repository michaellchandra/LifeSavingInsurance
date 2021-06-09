package com.project.lifesavinginsurance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class AsuransiKesehatan extends AppCompatActivity {
    private RadioGroup kesehatan_radiogroup_kelas, kesehatan_radiogroup_jeniskelamin;
    private RadioButton kesehatan_radiogroup_plan0, kesehatan_radiogroup_plan1, kesehatan_radiogroup_plan2, kesehatan_radiogroup_plan3, kesehatan_radiogroup_pria, kesehatan_radiogroup_wanita;
    private TextInputLayout kesehatan_textInput_usia;
    private TextView kesehatan_textview_usia, kesehatan_textview_premi;
    private Button kesehatan_button;
    private ImageView kesehatan_button_back;
    String jeniskelamin="";
    String kelas="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asuransi_kesehatan);
        kesehatan_radiogroup_kelas = findViewById(R.id.kesehatan_radiogroup_kelas);
        kesehatan_radiogroup_jeniskelamin = findViewById(R.id.kesehatan_radiogroup_jeniskelamin);
        kesehatan_radiogroup_plan0 = findViewById(R.id.kesehatan_radiogroup_plan0);
        kesehatan_radiogroup_plan1 = findViewById(R.id.kesehatan_radiogroup_plan1);
        kesehatan_radiogroup_plan2 = findViewById(R.id.kesehatan_radiogroup_plan2);
        kesehatan_radiogroup_plan3 = findViewById(R.id.kesehatan_radiogroup_plan3);
        kesehatan_radiogroup_pria = findViewById(R.id.kesehatan_radiogroup_pria);
        kesehatan_radiogroup_wanita = findViewById(R.id.kesehatan_radiogroup_wanita);
        kesehatan_textInput_usia = findViewById(R.id.kesehatan_textInput_usia);
        kesehatan_textview_usia = findViewById(R.id.kesehatan_textview_usia);
        kesehatan_textview_premi = findViewById(R.id.kesehatan_textview_premi);
        kesehatan_button_back = findViewById(R.id.kesehatan_button_back);
        kesehatan_button = findViewById(R.id.kesehatan_button);

        kesehatan_button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), HomeMenu.class);
                startActivity(intent);

            }
        });

        kesehatan_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkId = kesehatan_radiogroup_kelas.getCheckedRadioButtonId();
                int checkid = kesehatan_radiogroup_jeniskelamin.getCheckedRadioButtonId();
                int usia = Integer.parseInt(kesehatan_textInput_usia.getEditText().getText().toString().trim());
                long premi = 0;
                findRadioButton(checkId);
                findRadiojeniskelamin(checkid);
                if(kelas=="kelas0"){
                    if(jeniskelamin=="pria"){
                        if(usia>=0&&usia<=5){
                            premi = 11290000;
                        }else if(usia>=6&&usia<=18){
                            premi = 4910000;
                        }else if(usia>=19&&usia<=25){
                            premi = 6150000;
                        }else if(usia>=26&&usia<=30){
                            premi = 6360000;
                        }else if(usia>=31&&usia<=35){
                            premi = 6680000;
                        }else if(usia>=36&&usia<=40){
                            premi = 8190000;
                        }else if(usia>=41&&usia<=45){
                            premi = 10160000;
                        }else if(usia>=46&&usia<=50){
                            premi = 13700000;
                        }else if(usia>=51&&usia<=55){
                            premi = 19310000;
                        }else if(usia>=56&&usia<=60){
                            premi = 27400000;
                        }else if(usia>=61&&usia<=65){
                            premi = 38000000;
                        }else if(usia>=66&&usia<=70){
                            premi = 48860000;
                        }else if(usia>=71&&usia<=75){
                            premi = 60680000;
                        }else if(usia>=76&&usia<=80){
                            premi = 73250000;
                        }else if(usia>=81&&usia<=85){
                            premi = 87940000;
                        }else if(usia>=86&&usia<=90){
                            premi = 97140000;
                        }else if(usia>=91&&usia<=95){
                            premi = 116470000;
                        }else if(usia>=96&&usia<=100){
                            premi = 139640000;
                        }
                    }else if(jeniskelamin == "wanita"){
                        if(usia>=0&&usia<=5){
                            premi = 11290000;
                        }else if(usia>=6&&usia<=18){
                            premi = 4290000;
                        }else if(usia>=19&&usia<=25){
                            premi = 6320000;
                        }else if(usia>=26&&usia<=30){
                            premi = 6660000;
                        }else if(usia>=31&&usia<=35){
                            premi = 7340000;
                        }else if(usia>=36&&usia<=40){
                            premi = 9050000;
                        }else if(usia>=41&&usia<=45){
                            premi = 10950000;
                        }else if(usia>=46&&usia<=50){
                            premi = 14430000;
                        }else if(usia>=51&&usia<=55){
                            premi = 19700000;
                        }else if(usia>=56&&usia<=60){
                            premi = 26270000;
                        }else if(usia>=61&&usia<=65){
                            premi = 35020000;
                        }else if(usia>=66&&usia<=70){
                            premi = 43510000;
                        }else if(usia>=71&&usia<=75){
                            premi = 52840000;
                        }else if(usia>=76&&usia<=80){
                            premi = 63050000;
                        }else if(usia>=81&&usia<=85){
                            premi = 74290000;
                        }else if(usia>=86&&usia<=90){
                            premi = 79130000;
                        }else if(usia>=91&&usia<=95){
                            premi = 92940000;
                        }else if(usia>=96&&usia<=100){
                            premi = 109160000;
                        }
                    }
                }else if(kelas=="kelas1"){
                    if(jeniskelamin=="pria"){
                        if(usia>=0&&usia<=5){
                            premi = 20220000;
                        }else if(usia>=6&&usia<=18){
                            premi = 11640000;
                        }else if(usia>=19&&usia<=25){
                            premi = 12640000;
                        }else if(usia>=26&&usia<=30){
                            premi = 13230000;
                        }else if(usia>=31&&usia<=35){
                            premi = 14210000;
                        }else if(usia>=36&&usia<=40){
                            premi = 17170000;
                        }else if(usia>=41&&usia<=45){
                            premi = 20640000;
                        }else if(usia>=46&&usia<=50){
                            premi = 27330000;
                        }else if(usia>=51&&usia<=55){
                            premi = 36350000;
                        }else if(usia>=56&&usia<=60){
                            premi = 49440000;
                        }else if(usia>=61&&usia<=65){
                            premi = 66050000;
                        }else if(usia>=66&&usia<=70){
                            premi = 85140000;
                        }else if(usia>=71&&usia<=75){
                            premi = 113170000;
                        }else if(usia>=76&&usia<=80){
                            premi = 144580000;
                        }else if(usia>=81&&usia<=85){
                            premi = 170210000;
                        }else if(usia>=86&&usia<=90){
                            premi = 182970000;
                        }else if(usia>=91&&usia<=95){
                            premi = 198740000;
                        }else if(usia>=96&&usia<=100){
                            premi = 214430000;
                        }
                    }else if(jeniskelamin == "wanita"){
                        if(usia>=0&&usia<=5){
                            premi = 20220000;
                        }else if(usia>=6&&usia<=18){
                            premi = 11640000;
                        }else if(usia>=19&&usia<=25){
                            premi = 12640000;
                        }else if(usia>=26&&usia<=30){
                            premi = 13230000;
                        }else if(usia>=31&&usia<=35){
                            premi = 14210000;
                        }else if(usia>=36&&usia<=40){
                            premi = 17170000;
                        }else if(usia>=41&&usia<=45){
                            premi = 20640000;
                        }else if(usia>=46&&usia<=50){
                            premi = 27330000;
                        }else if(usia>=51&&usia<=55){
                            premi = 36350000;
                        }else if(usia>=56&&usia<=60){
                            premi = 49440000;
                        }else if(usia>=61&&usia<=65){
                            premi = 66050000;
                        }else if(usia>=66&&usia<=70){
                            premi = 85140000;
                        }else if(usia>=71&&usia<=75){
                            premi = 113170000;
                        }else if(usia>=76&&usia<=80){
                            premi = 144580000;
                        }else if(usia>=81&&usia<=85){
                            premi = 170210000;
                        }else if(usia>=86&&usia<=90){
                            premi = 182970000;
                        }else if(usia>=91&&usia<=95){
                            premi = 198740000;
                        }else if(usia>=96&&usia<=100){
                            premi = 214430000;
                        }
                    }
                }else if(kelas == "kelas2"){
                    if(jeniskelamin=="pria"){
                        if(usia>=0&&usia<=5){
                            premi = 25750000;
                        }else if(usia>=6&&usia<=18){
                            premi = 16060000;
                        }else if(usia>=19&&usia<=25){
                            premi = 18180000;
                        }else if(usia>=26&&usia<=30){
                            premi = 19350000;
                        }else if(usia>=31&&usia<=35){
                            premi = 20720000;
                        }else if(usia>=36&&usia<=40){
                            premi = 22250000;
                        }else if(usia>=41&&usia<=45){
                            premi = 27210000;
                        }else if(usia>=46&&usia<=50){
                            premi = 34980000;
                        }else if(usia>=51&&usia<=55){
                            premi = 46580000;
                        }else if(usia>=56&&usia<=60){
                            premi = 65430000;
                        }else if(usia>=61&&usia<=65){
                            premi = 87490000;
                        }else if(usia>=66&&usia<=70){
                            premi = 112830000;
                        }else if(usia>=71&&usia<=75){
                            premi = 150380000;
                        }else if(usia>=76&&usia<=80){
                            premi = 185920000;
                        }else if(usia>=81&&usia<=85){
                            premi = 226560000;
                        }else if(usia>=86&&usia<=90){
                            premi = 252260000;
                        }else if(usia>=91&&usia<=95){
                            premi = 274430000;
                        }else if(usia>=96&&usia<=100){
                            premi = 296110000;
                        }
                    }else if(jeniskelamin == "wanita"){
                        if(usia>=0&&usia<=5){
                            premi = 25750000;
                        }else if(usia>=6&&usia<=18){
                            premi = 16060000;
                        }else if(usia>=19&&usia<=25){
                            premi = 18180000;
                        }else if(usia>=26&&usia<=30){
                            premi = 19350000;
                        }else if(usia>=31&&usia<=35){
                            premi = 20720000;
                        }else if(usia>=36&&usia<=40){
                            premi = 22250000;
                        }else if(usia>=41&&usia<=45){
                            premi = 27210000;
                        }else if(usia>=46&&usia<=50){
                            premi = 34980000;
                        }else if(usia>=51&&usia<=55){
                            premi = 46580000;
                        }else if(usia>=56&&usia<=60){
                            premi = 65430000;
                        }else if(usia>=61&&usia<=65){
                            premi = 87490000;
                        }else if(usia>=66&&usia<=70){
                            premi = 112830000;
                        }else if(usia>=71&&usia<=75){
                            premi = 150380000;
                        }else if(usia>=76&&usia<=80){
                            premi = 185920000;
                        }else if(usia>=81&&usia<=85){
                            premi = 226560000;
                        }else if(usia>=86&&usia<=90){
                            premi = 252260000;
                        }else if(usia>=91&&usia<=95){
                            premi = 274430000;
                        }else if(usia>=96&&usia<=100){
                            premi = 296110000;
                        }
                    }
                }else if(kelas == "kelas3"){
                    if(jeniskelamin=="pria"){
                        if(usia>=0&&usia<=5){
                            premi = 33550000;
                        }else if(usia>=6&&usia<=18){
                            premi = 19830000;
                        }else if(usia>=19&&usia<=25){
                            premi = 24300000;
                        }else if(usia>=26&&usia<=30){
                            premi = 25870000;
                        }else if(usia>=31&&usia<=35){
                            premi = 27630000;
                        }else if(usia>=36&&usia<=40){
                            premi = 29930000;
                        }else if(usia>=41&&usia<=45){
                            premi = 34340000;
                        }else if(usia>=46&&usia<=50){
                            premi = 44860000;
                        }else if(usia>=51&&usia<=55){
                            premi = 57010000;
                        }else if(usia>=56&&usia<=60){
                            premi = 80080000;
                        }else if(usia>=61&&usia<=65){
                            premi = 107090000;
                        }else if(usia>=66&&usia<=70){
                            premi = 138110000;
                        }else if(usia>=71&&usia<=75){
                            premi = 180730000;
                        }else if(usia>=76&&usia<=80){
                            premi = 226970000;
                        }else if(usia>=81&&usia<=85){
                            premi = 281190000;
                        }else if(usia>=86&&usia<=90){
                            premi = 313030000;
                        }else if(usia>=91&&usia<=95){
                            premi = 344300000;
                        }else if(usia>=96&&usia<=100){
                            premi = 374960000;
                        }
                    }else if(jeniskelamin == "wanita"){
                        if(usia>=0&&usia<=5){
                            premi = 33550000;
                        }else if(usia>=6&&usia<=18){
                            premi = 19830000;
                        }else if(usia>=19&&usia<=25){
                            premi = 24300000;
                        }else if(usia>=26&&usia<=30){
                            premi = 25870000;
                        }else if(usia>=31&&usia<=35){
                            premi = 27630000;
                        }else if(usia>=36&&usia<=40){
                            premi = 29930000;
                        }else if(usia>=41&&usia<=45){
                            premi = 34340000;
                        }else if(usia>=46&&usia<=50){
                            premi = 44860000;
                        }else if(usia>=51&&usia<=55){
                            premi = 57010000;
                        }else if(usia>=56&&usia<=60){
                            premi = 80080000;
                        }else if(usia>=61&&usia<=65){
                            premi = 107090000;
                        }else if(usia>=66&&usia<=70){
                            premi = 138110000;
                        }else if(usia>=71&&usia<=75){
                            premi = 180730000;
                        }else if(usia>=76&&usia<=80){
                            premi = 226970000;
                        }else if(usia>=81&&usia<=85){
                            premi = 281190000;
                        }else if(usia>=86&&usia<=90){
                            premi = 313030000;
                        }else if(usia>=91&&usia<=95){
                            premi = 344300000;
                        }else if(usia>=96&&usia<=100){
                            premi = 374960000;
                        }
                    }
                }
                kesehatan_textview_usia.setText(String.valueOf(usia));
                kesehatan_textview_premi.setText(String.valueOf(premi));


            }

        });

        }

    private void findRadiojeniskelamin(int checkid) {
        switch (checkid){
            case R.id.kesehatan_radiogroup_pria:
                jeniskelamin = "pria";
                break;
            case R.id.kesehatan_radiogroup_wanita:
                jeniskelamin = "wanita";
        }
    }

    private void findRadioButton(int checkId) {
            switch(checkId){
                case R.id.kesehatan_radiogroup_plan0:
                    kelas="kelas0";
                    break;
                case R.id.kesehatan_radiogroup_plan1:
                    kelas="kelas1";
                    break;
                case R.id.kesehatan_radiogroup_plan2:
                    kelas ="kelas2";
                    break;
                case R.id.kesehatan_radiogroup_plan3:
                    kelas = "kelas3";
            }
    }
}
