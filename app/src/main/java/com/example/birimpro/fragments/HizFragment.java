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


public class HizFragment extends Fragment {
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
        itemsGiris.add("Metre/saniye (m/s)");
        itemsGiris.add("Metre/saat (m/h)");
        itemsGiris.add("Kilometre/saat (km/h)");
        itemsGiris.add("İnç/saniye (in/s)");
        itemsGiris.add("İnç/saat (in/h)");
        itemsGiris.add("Fit/saniye (ft/s)");
        itemsGiris.add("İnç/saat (in/h)");
        itemsGiris.add("Fit/saniye (ft/s)");
        itemsGiris.add("Fit/saat (ft/h)");
        itemsGiris.add("Mil/saniye (mi/s)");
        itemsGiris.add("Mil/saniye (mi/s)");
        itemsGiris.add("Mil/saat (mi/h)");
        itemsGiris.add("Knot (kn)");

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
        itemsCikis.add("Metre/saniye (m/s)");
        itemsCikis.add("Metre/saat (m/h)");
        itemsCikis.add("Kilometre/saat (km/h)");
        itemsCikis.add("İnç/saniye (in/s)");
        itemsCikis.add("İnç/saat (in/h)");
        itemsCikis.add("Fit/saniye (ft/s)");
        itemsCikis.add("İnç/saat (in/h)");
        itemsCikis.add("Fit/saniye (ft/s)");
        itemsCikis.add("Fit/saat (ft/h)");
        itemsCikis.add("Mil/saniye (mi/s)");
        itemsCikis.add("Mil/saniye (mi/s)");
        itemsCikis.add("Mil/saat (mi/h)");
        itemsCikis.add("Knot (kn)");

        // ArrayAdapter ile spinnerCikis'e veri bağlama
        ArrayAdapter<String> adapterCikis = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, itemsCikis);
        adapterCikis.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCikis.setAdapter(adapterCikis);

        // Oluşturduğumuz view'i döndür
        return view;

    }
}