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


public class KutleFragment extends Fragment {
    TextView girisBirim,cikisBirim,TextGiris,TextCikis;

    Spinner spinnerGiris, spinnerCikis;
    List<String> itemsGiris, itemsCikis;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_alan, container, false);

        // Giriş Spinner'ı tanımlama
        spinnerGiris = view.findViewById(R.id.spinnerGiriş);
        itemsGiris = new ArrayList<>();

        // Giriş öğelerini ekleme
        itemsGiris.add("Ton (t)");
        itemsGiris.add("BK tonu (t)");
        itemsGiris.add("ABD tonu (t)");
        itemsGiris.add("Pound (lb)");
        itemsGiris.add("Ons (oz)");
        itemsGiris.add("Kilogram (kg)");
        itemsGiris.add("Gram (g)");

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
        itemsCikis.add("Ton (t)");
        itemsCikis.add("BK tonu (t)");
        itemsCikis.add("ABD tonu (t)");
        itemsCikis.add("Pound (lb)");
        itemsCikis.add("Ons (oz)");
        itemsCikis.add("Kilogram (kg)");
        itemsCikis.add("Gram (g)");

        // ArrayAdapter ile spinnerCikis'e veri bağlama
        ArrayAdapter<String> adapterCikis = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, itemsCikis);
        adapterCikis.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCikis.setAdapter(adapterCikis);

        // Oluşturduğumuz view'i döndür
        return view;
    }
}