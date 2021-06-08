package com.project.lifesavinginsurance;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.Locale;

import Deposit.DataDeposit;
import Deposit.Transfer;

public class Payment extends AppCompatActivity {


    private CountDownTimer countDownTimer;
    private Button payment_button_confirm, transfer_button_pembayaran ;
    private ImageView payment_imageView_back;
    private TextInputLayout transfer_textInputLayout_jumlahTransfer;
    private TextView payment_textView_jamOperasional, payment_textView_butuhBantuan, payment_textView_countdown, payment_textView_totalDeposit;
    Dialog popup_operasional;
    private boolean TimerRunning;
    private ArrayList<DataDeposit> nominal;

//    private long TimeLeftinMillis = START_TIME_IN_MILLIS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        payment_button_confirm = findViewById(R.id.payment_button_confirm);
        payment_textView_jamOperasional = findViewById(R.id.payment_textView_jamOperasional);
        payment_textView_butuhBantuan = findViewById(R.id.payment_textView_butuhBantuan);
        transfer_button_pembayaran = findViewById(R.id.transfer_button_pembayaran);
        payment_imageView_back = findViewById(R.id.payment_imageView_back);
        payment_textView_totalDeposit = findViewById(R.id.payment_textView_totalDeposit);
        payment_button_confirm = findViewById(R.id.payment_button_confirm);
        transfer_textInputLayout_jumlahTransfer = findViewById(R.id.transfer_textInputLayout_jumlahTransfer);

        popup_operasional = new Dialog(this);

        Intent intent = getIntent();
        String saldoDeposit = intent.getStringExtra("totalDeposit");

        payment_textView_totalDeposit.setText(saldoDeposit);

//        countDownTimer = new CountDownTimer(TimeLeftinMillis,1000) {
//            @Override
//            public void onTick(long millisUntilFinished) {
//                TimeLeftinMillis = millisUntilFinished;
//            }
//
//            @Override
//            public void onFinish() {
//
//            }
//        }.start();
//        TimerRunning = true;
//        Data= new ArrayList<JumlahDeposit>();
//        for(int i = 0; i <Data.size(); i++) {
//        JumlahDeposit data= Data.get(i);



        payment_button_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                long deposit = Long.parseLong(transfer_textInputLayout_jumlahTransfer.getEditText().getText().toString().trim());
                nominal = new ArrayList<>();
                nominal.add(new DataDeposit(deposit));

                Intent intent = new Intent(getBaseContext(), FragmentHome.class);
                startActivity(intent);
                finish();

                Toast.makeText(Payment.this, "Terima Kasih Pembayaran Terkonfirmasi!", Toast.LENGTH_LONG).show();




            }
        });

        payment_textView_butuhBantuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Support.class);
                startActivity(intent);
            }
        });

        payment_imageView_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getBaseContext(), InputTransfer.class);
                startActivity(intent);
            }
        });


    }



    public void TampilPopUp (View view) {


        Button operasional_button_tutup ;
        popup_operasional.setContentView(R.layout.popup_jam_operasional);

        operasional_button_tutup = popup_operasional.findViewById(R.id.operasional_button_tutup);

        operasional_button_tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup_operasional.dismiss();
            }
        });
        popup_operasional.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popup_operasional.show();
    }
}