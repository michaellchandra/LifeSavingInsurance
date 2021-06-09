package com.project.lifesavinginsurance;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import Account.DataPemegangPolis;

public class FragmentFinance extends Fragment {
    private Button finance_button;
    View v;
    public FragmentFinance() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_finance, container, false);
        finance_button = v.findViewById(R.id.finance_button);
        finance_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ListAsuransi.class);
                startActivity(intent);
            }
        });
        return v;
    }

}
