package com.project.lifesavinginsurance;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentSupport extends Fragment {

    private Button support_button_faq, support_button_email, support_button_whatsapp, support_button_aboutus, support_button_privasi;

    View v;
    public FragmentSupport() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_support, container, false);


        support_button_email = v.findViewById(R.id.support_button_email);
        support_button_faq = v.findViewById(R.id.support_button_faq);
        support_button_whatsapp = v.findViewById(R.id.support_button_whatsapp);
        support_button_aboutus = v.findViewById(R.id.support_button_aboutus);
        support_button_privasi = v.findViewById(R.id.support_button_privasi);

        support_button_faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ModalContentFaq modalContentFaq = new ModalContentFaq();
                modalContentFaq.show(getFragmentManager(), "modalMenu");
            }

        });

        support_button_privasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ModalContentPrivacy modalContentPrivacy = new ModalContentPrivacy();
                modalContentPrivacy.show(getFragmentManager(),"modalMenu");
            }
        });

        support_button_aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ModalContentAboutUs modalContentAboutUs = new ModalContentAboutUs();
                modalContentAboutUs.show(getFragmentManager(), "modalMenu");
            }
        });

        support_button_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("mailto:mchandra05@student.ciputra.ac.id"));
                startActivity(intent);
            }
        });

        support_button_whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://wa.me/085155318815?text=Halo%20Tim%20Support%20Life%20Saving%20Insurance"));
                startActivity(intent);

//                https://wa.me/085155318815?text=Halo,%20saya%20ingin%20konfirmasi%20pembayaran%20saya%20pada%20aplikasi%20Live%20Saving%20Insurance
            }
        });

        return v;
    }
}