package com.project.lifesavinginsurance;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

import Account.DataPemegangPolis;

public class ListAsuransi extends AppCompatActivity {
    private RecyclerView list_recyclerview_list;
    private ImageView list_imageview_back;
    private ArrayList<DataPemegangPolis> dataO;
    private FormPlan100Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_asuransi);
        initView();
        setupRecyclerView();
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
                DataPemegangPolis BarangBaru = data.getParcelableExtra("NamaBaru");
                dataO.add(BarangBaru);
                adapter.notifyDataSetChanged();
    }

    private void setupRecyclerView() {
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getBaseContext());
        list_recyclerview_list.setLayoutManager(manager);
        list_recyclerview_list.setAdapter(adapter);
    }

    private void initView() {
        list_recyclerview_list = findViewById(R.id.list_recyclerview_list);
        dataO = new ArrayList<DataPemegangPolis>();
        adapter = new FormPlan100Adapter(dataO);
    }
}