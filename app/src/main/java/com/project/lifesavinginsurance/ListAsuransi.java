package com.project.lifesavinginsurance;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import Account.DataPemegangPolis;

public class ListAsuransi extends AppCompatActivity {
    private RecyclerView list_recyclerview_list;
    private ArrayList<DataPemegangPolis> dataBarang;
    private FormPlan100Adapter adapter;
    private TextView recyclerview_nodata;
    private FloatingActionButton recyclerview_FAB_add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_asuransi);
        initView();
        setupRecyclerView();
        setListener();
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1){
            if(resultCode == 200){
                DataPemegangPolis BarangBaru = data.getParcelableExtra("BarangBaru");
                dataBarang.add(BarangBaru);
                adapter.notifyDataSetChanged();
            }
        }
    }

    private void setListener() {
        recyclerview_FAB_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), FormPlan100.class);
                startActivityForResult(intent, 1);
            }
        });
    }

    private void setupRecyclerView() {
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getBaseContext());
        list_recyclerview_list.setLayoutManager(manager);
        list_recyclerview_list.setAdapter(adapter);
    }

    private void initView() {
        list_recyclerview_list = findViewById(R.id.list_recyclerview_list);
        dataBarang = new ArrayList<DataPemegangPolis>();
        adapter = new FormPlan100Adapter(dataBarang);
        recyclerview_FAB_add = findViewById(R.id.recyclerview_FAB_add);
    }

    private static final int TIME_INTERVAL = 2000;
    private long mBackPressed;

    @Override
    public void onBackPressed()
    {
        if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis())
        {
            super.onBackPressed();
            return;
        }
        else { Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show(); }

        mBackPressed = System.currentTimeMillis();
    }
}