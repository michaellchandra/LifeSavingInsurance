package com.project.lifesavinginsurance;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.SplittableRandom;

import Account.DataPemegangPolis;

public class FormPlan100Adapter extends RecyclerView.Adapter<FormPlan100Adapter.FormPlan100ViewHolder> {
    Context mContext;
    private ArrayList<DataPemegangPolis> dataP;
    Dialog myDialog;

    public FormPlan100Adapter(Context mContext, ArrayList<DataPemegangPolis> dataP) {
        this.mContext = mContext;
        this.dataP = dataP;
    }

    public FormPlan100Adapter(ArrayList<DataPemegangPolis>datap){
        this.dataP = datap;
    }

    @NonNull
    @Override
    public FormPlan100ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.finance_card, parent, false);
        FormPlan100ViewHolder vHolder = new FormPlan100ViewHolder(view);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FormPlan100Adapter.FormPlan100ViewHolder holder, int position) {
        holder.finance_card_namaAsuransi.setText(dataP.get(position).getNamaasuransi());
        holder.finance_card_nama.setText(dataP.get(position).getNamacalon());
        holder.finance_card_umur.setText(String.valueOf(dataP.get(position).getUmurcalon()));
        holder.item_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final DataPemegangPolis temp = dataP.get(position);
                Intent intent = new Intent(mContext, plan100_info.class);
                intent.putExtra("namac", temp.getNamacalon());
                intent.putExtra("umurc", temp.getUmurcalon());
                intent.putExtra("jeniskelamin", temp.getJeniskelamin());
                intent.putExtra("namap", temp.getNamapemegang());
                intent.putExtra("umurp", temp.getUmurpemegang());
                intent.putExtra("hubungan", temp.getHubungan());
                intent.putExtra("uangp", temp.getUangp());
                intent.putExtra("pembayaran", temp.getUang());
                intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataP.size();
    }

    public class FormPlan100ViewHolder extends RecyclerView.ViewHolder {
        private TextView finance_card_namaAsuransi, finance_card_nama, finance_card_umur;
        private ConstraintLayout item_info;

        public FormPlan100ViewHolder(@NonNull View itemView) {
            super(itemView);
            item_info = itemView.findViewById(R.id.item_info);
            finance_card_namaAsuransi = itemView.findViewById(R.id.finance_card_namaAsuransi);
            finance_card_nama = itemView.findViewById(R.id.finance_card_nama);
            finance_card_umur= itemView.findViewById(R.id.finance_card_umur);
        }
    }
}
