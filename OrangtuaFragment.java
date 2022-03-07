package com.example.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OrangtuaFragment extends Fragment {
    EditText edtNamaAyah, edtNamaIbu, edtTanggalAyah, edtTanggalIbu, edtAlamatAyah, edtAlamatIbu;
    Button btnFinish;

        @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
    Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_orangtua, container, false);
        edtNamaAyah = view.findViewById(R.id.edt_ayah);
        edtNamaIbu = view.findViewById(R.id.edt_Ibu);
        edtTanggalAyah = view.findViewById(R.id.edt_tanggal_ayah);
            edtTanggalIbu = view.findViewById(R.id.edt_tanggal_ibu);
            edtAlamatAyah = view.findViewById(R.id.edt_alamat_ayah);
            edtAlamatIbu = view.findViewById(R.id.edt_alamat_ibu);

        btnFinish = view.findViewById(R.id.btn_finish);

        btnFinish.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Toast.makeText(getContext(), "Finish", Toast.LENGTH_SHORT).show();
                 }
});

        return view;
        }
}