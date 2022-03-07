package com.example.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class PribadiFragment extends Fragment {
    EditText edtUsername, edtNpm, edtAlamat, edtJurusan, edtTanggal, edtFakultas, edtAsal;
    Button btnNext;
    CallbackFragment callbackFragment;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pribadi, container, false);
        edtUsername = view.findViewById(R.id.edt_name);
        edtNpm = view.findViewById(R.id.edt_npm);
        edtAlamat = view.findViewById(R.id.edt_alamat);
        edtJurusan = view.findViewById(R.id.edt_jurusan);
        edtTanggal = view.findViewById(R.id.edt_tanggal);
        edtFakultas = view.findViewById(R.id.edt_fakultas);
        edtAsal = view.findViewById(R.id.edt_asal);
        btnNext = view.findViewById(R.id.btn_next);


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (callbackFragment != null) {
                    callbackFragment.changeFragment();
                }
            }
        });

        return view;
    }

    public void setCallbackFragment(CallbackFragment callbackFragment) {
        this.callbackFragment = callbackFragment;
    }
}