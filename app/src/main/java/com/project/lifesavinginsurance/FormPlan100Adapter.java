package com.project.lifesavinginsurance;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import Account.DataPemegangPolis;

public class FormPlan100Adapter extends RecyclerView.Adapter<FormPlan100Adapter.FormPlan100ViewHolder> {

    private ArrayList<DataPemegangPolis> dataP;

    public FormPlan100Adapter(ArrayList<DataPemegangPolis>datap){
        this.dataP = datap;
    }

    @NonNull
    @Override
    public FormPlan100ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.finance_card, parent, false);
        return new FormPlan100ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FormPlan100Adapter.FormPlan100ViewHolder holder, int position) {
        holder.finance_card_namaAsuransi.setText(dataP.get(position).getNamaasuransi());
        holder.finance_card_nama.setText(dataP.get(position).getNamacalon());
        holder.finance_card_umur.setText(dataP.get(position).getUmurcalon());
    }

    @Override
    public int getItemCount() {
        return dataP.size();
    }

    public class FormPlan100ViewHolder extends RecyclerView.ViewHolder {
        private TextView finance_card_namaAsuransi, finance_card_nama, finance_card_umur;
        public FormPlan100ViewHolder(@NonNull View itemView) {
            super(itemView);
            finance_card_namaAsuransi = itemView.findViewById(R.id.finance_card_namaAsuransi);
            finance_card_nama = itemView.findViewById(R.id.finance_card_nama);
            finance_card_umur= itemView.findViewById(R.id.finance_card_umur);
        }
    }
}
