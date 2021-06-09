package com.project.lifesavinginsurance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

import Account.User;

public class HomeMenu extends AppCompatActivity {

    private Button home_button_plan100, home_button_isiSaldo;
    private ImageView home_finance;
    private TextView home_textView_paymentHistory, home_textView_jumlahSaldo;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_menu);


        ImageSlider imageSlider = findViewById(R.id.home_imageSlider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://1.bp.blogspot.com/-1ELJlqBAB20/XvVnK6K-hOI/AAAAAAAAAgg/KoJZ5DCntRos0MyvuPbuwm-LdyWT6eAfwCLcBGAsYHQ/s1600/atur-keuangan-pribadi-finsycoid.jpg", "Tips Mengatur Keuangan di Masa Pandemi"));
        slideModels.add(new SlideModel("https://1.bp.blogspot.com/-EJ3_-yuJzio/X65oR2tpDfI/AAAAAAAABoI/EygFEzidwYwU61g_1oHcQdAfil4qV0ohgCLcBGAsYHQ/s1000/353692.jpg","Tips Mengatur Keuangan Anak Rantau"));
        slideModels.add(new SlideModel("https://1.bp.blogspot.com/-BxOQmoUEu10/YCpeZ_QbmDI/AAAAAAAACJU/YqxlfebmCg0Av0MTToUqoffinqITlGnaQCLcBGAsYHQ/s664/664xauto-pentingnya-memberi-nama-sebuah-perusahaan-150710j.jpg","Tips Memilih Perusahaan untuk Bekerja"));



        imageSlider.setImageList(slideModels, true);

        imageSlider.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemSelected(int i) {


                if (i== 0){
                    Uri uri = Uri.parse("https://www.macefs.com/2020/07/tips-mengatur-keuangan-di-masa-pandemi.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }else if (i==1){
                    Uri uri = Uri.parse("https://www.macefs.com/2020/11/cara-mengatur-keuangan-untuk-anak-rantau.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }else if (i==2) {
                    Uri uri = Uri.parse("https://www.macefs.com/2021/02/5-tips-memilih-perusahaan-untuk-bekerja.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }

            }
        });

        home_button_isiSaldo = findViewById(R.id.home_button_isiSaldo);
        home_button_plan100 = findViewById(R.id.home_button_plan100);
        home_textView_jumlahSaldo = findViewById(R.id.home_textView_rupiah);
        home_textView_paymentHistory = findViewById(R.id.home_textView_paymentHistory);
        home_finance = findViewById(R.id.home_finance);
        Intent intent = getIntent();
        user = intent.getParcelableExtra("IDuang");

        Log.d("testtest", user.getNama());

        home_textView_jumlahSaldo.setText(user.getUang());

        home_button_isiSaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), InputTransfer.class);
                intent.putExtra("IDnama", user);
                intent.putExtra("IDuang",user);
                Log.d("testtest", user.getNama());
                startActivity(intent);

            }
        });
        home_finance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getBaseContext(), ListAsuransi.class);
                startActivity(intent1);
            }
        });
        home_button_plan100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), AsuransiTradisional.class);
                startActivity(intent);
            }
        });


    }
}