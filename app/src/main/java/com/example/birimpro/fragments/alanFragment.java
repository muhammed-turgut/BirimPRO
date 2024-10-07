package com.example.birimpro.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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

public class alanFragment extends Fragment {

    TextView girisBirim,cikisBirim,TextGiris,TextCikis;

    Spinner spinnerGiris, spinnerCikis;
    List<String> itemsGiris, itemsCikis;

    private OnButtonClickListener buttonClickListener;

    // Interface tanımla ve buton ID'sini parametre olarak al
    public interface OnButtonClickListener {
        void onButtonClicked(int buttonId);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            buttonClickListener = (OnButtonClickListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement OnButtonClickListener");
        }
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Fragment'ın layout'unu şişiriyoruz
        View view = inflater.inflate(R.layout.fragment_alan, container, false);

        // Giriş Spinner'ı tanımlama
        spinnerGiris = view.findViewById(R.id.spinnerGiriş);
        itemsGiris = new ArrayList<>();

        // Giriş öğelerini ekleme
        itemsGiris.add("Akre(ac)");
        itemsGiris.add("Ar(a)");
        itemsGiris.add("Hektar(ha)");
        itemsGiris.add("Santimetre(cm²)");
        itemsGiris.add("Fit Kare(ft²)");
        itemsGiris.add("Inçkare (in²)");
        itemsGiris.add("Metrekare "+" (m²)");

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
        itemsCikis.add("Akre (ac)");
        itemsCikis.add("Ar (a)");
        itemsCikis.add("Hektar (ha)");
        itemsCikis.add("Santimetre (cm²)");
        itemsCikis.add("Fit Kare (ft²)");
        itemsCikis.add("Inçkare (in²)");
        itemsCikis.add("Metrekare (m²)");

        // ArrayAdapter ile spinnerCikis'e veri bağlama
        ArrayAdapter<String> adapterCikis = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, itemsCikis);
        adapterCikis.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCikis.setAdapter(adapterCikis);

        // Oluşturduğumuz view'i döndür
        return view;






        }

    }

