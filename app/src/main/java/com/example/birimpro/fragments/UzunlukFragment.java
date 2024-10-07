package com.example.birimpro.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.birimpro.R;

import java.util.ArrayList;
import java.util.List;


public class UzunlukFragment extends Fragment {
    TextView girisBirim,cikisBirim,TextGiris,TextCikis;

    Spinner spinnerGiris, spinnerCikis;
    List<String> itemsGiris, itemsCikis;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Fragment'ın layout'unu şişiriyoruz
        View view = inflater.inflate(R.layout.fragment_alan, container, false);

        // Giriş Spinner'ı tanımlama
        spinnerGiris = view.findViewById(R.id.spinnerGiriş);
        itemsGiris = new ArrayList<>();

        // Giriş öğelerini ekleme
        itemsGiris.add("Milimetre (mm)");
        itemsGiris.add("Santimetre (cm)");
        itemsGiris.add("Metre (m)");
        itemsGiris.add("İnç (in)");
        itemsGiris.add("Feet (ft)");
        itemsGiris.add("Yarda (yd)");
        itemsGiris.add("Mil (mi)");
        itemsGiris.add("Deniz mili (NM)");
        itemsGiris.add("Mil (mil)");

        //veri giris yerlerideki birimlerin text leri
        girisBirim=view.findViewById(R.id.girisBirim);
        cikisBirim=view.findViewById(R.id.cikisBirim);

        //Veri giris yerleri
        TextGiris=view.findViewById(R.id.TextGiriş);
        TextCikis=view.findViewById(R.id.TextÇıkış);


        // ArrayAdapter ile spinnerGiris'e veri bağlama
        ArrayAdapter<String> adapterGiris = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, itemsGiris);
        adapterGiris.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerGiris.setAdapter(adapterGiris);

        // Çıkış Spinner'ı tanımlama
        spinnerCikis = view.findViewById(R.id.spinnerÇıkış);
        itemsCikis = new ArrayList<>();

        // Çıkış öğelerini ekleme
        itemsCikis.add("Milimetre (mm)");
        itemsCikis.add("Santimetre (cm)");
        itemsCikis.add("Metre (m)");
        itemsCikis.add("İnç (in)");
        itemsCikis.add("Feet (ft)");
        itemsCikis.add("Yarda (yd)");
        itemsCikis.add("Mil (mi)");
        itemsCikis.add("Deniz mili (NM)");
        itemsCikis.add("Mil (mil)");

        // ArrayAdapter ile spinnerCikis'e veri bağlama
        ArrayAdapter<String> adapterCikis = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, itemsCikis);
        adapterCikis.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCikis.setAdapter(adapterCikis);

        // Oluşturduğumuz view'i döndür
        return view;
    }
}