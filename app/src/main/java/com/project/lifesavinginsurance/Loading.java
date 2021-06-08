package com.project.lifesavinginsurance;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;

public class Loading  {

    private AlertDialog alert;
    private Activity activity;

    Loading(Activity myActivity) {
        activity = myActivity;
    }

    void startLoadingDialog(){
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);

        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.activity_loading, null));
        builder.setCancelable(true);

        alert = builder.create();
        alert.show();
    }

    void dismissDialog(){
        alert.dismiss();
    }




//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_loading);
//
//
//
//    }
}