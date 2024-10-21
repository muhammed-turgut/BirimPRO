package com.example.birimpro.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.birimpro.myfunction.ConversionFunctions;
import com.example.birimpro.myfunction.OnNumberClickListener;
import com.example.birimpro.R;
import com.example.birimpro.myfunction.SearchAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class UzunlukFragment extends Fragment implements OnNumberClickListener {
    TextView girisBirim, cikisBirim, TextGiris, TextCikis;
    Button button;

    Spinner spinnerGiris, spinnerCikis;
    List<String> itemsGiris, itemsCikis;

    boolean nerde = true;
    ConversionFunctions conversionFunctions; // global olarak tanımlandı
    SearchAlgorithm searchAlgorithm;

    StringBuilder sb = new StringBuilder();

    public String positionUnitGiris = "mm", positionUnitCikis = "mm", number;
    public double girisSonuc = 0.0,cikisSonuc=0.0;
    public  int noktaKullanimi=0;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Fragment'ın layout'unu şişiriyoruz
        View view = inflater.inflate(R.layout.fragment_uzunluk, container, false);



        // ConversionFunctions nesnesini burada başlatıyoruz
        conversionFunctions = new ConversionFunctions();
        searchAlgorithm = new SearchAlgorithm();

        // TextView ve diğer bileşenlerin tanımlamaları
        girisBirim = view.findViewById(R.id.girisBirim);
        cikisBirim = view.findViewById(R.id.cikisBirim);
        TextGiris = view.findViewById(R.id.TextGiriş);
        TextCikis = view.findViewById(R.id.TextÇıkış);


        //giriş spinner tınmlama
        spinnerGiris = view.findViewById(R.id.spinnerGiriş);
        // Çıkış Spinner'ı tanımlama
        spinnerCikis = view.findViewById(R.id.spinnerÇıkış);


        itemsGiris = new ArrayList<>();
        // Giriş öğelerini ekleme
        itemsGiris.add("Milimetre (mm)");
        itemsGiris.add("Santimetre (cm)");
        itemsGiris.add("Metre (m)");
        itemsGiris.add("Kilometre (km)");
        itemsGiris.add("İnç (in)");
        itemsGiris.add("Feet (ft)");
        itemsGiris.add("Yarda (yd)");
        itemsGiris.add("Mil (mi)");
        itemsGiris.add("Deniz mili (NM)");

        // ArrayAdapter ile spinnerGiris'e veri bağlama
        ArrayAdapter<String> adapterGiris = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, itemsGiris);
        adapterGiris.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerGiris.setAdapter(adapterGiris);
        spinnerGiris.invalidate();
        spinnerGiris.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                nerde=true;
                switch (position){
                    case 0:
                        girisBirim.setText("mm");
                        positionUnitGiris="mm";
                        break;
                    case 1:
                        girisBirim.setText("cm");
                        positionUnitGiris="cm";
                        break;
                    case 2:
                        girisBirim.setText("m");
                        positionUnitGiris="m";
                        break;
                    case 3:
                        girisBirim.setText("km");
                        positionUnitGiris="km";
                        break;
                    case 4:
                        girisBirim.setText("in");
                        positionUnitGiris="in";
                        break;
                    case 5:
                        girisBirim.setText("ft");
                        positionUnitGiris="ft";
                        break;
                    case 6:
                        girisBirim.setText("yd");
                        positionUnitGiris="yd";
                        break;
                    case 7:
                        girisBirim.setText("mi");
                        positionUnitGiris="mi";
                        break;
                    case 8:
                        girisBirim.setText("NM");
                        positionUnitGiris="NM";
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        itemsCikis = new ArrayList<>();
        // Çıkış öğelerini ekleme
        itemsCikis.add("Milimetre (mm)");
        itemsCikis.add("Santimetre (cm)");
        itemsCikis.add("Metre (m)");
        itemsCikis.add("Kilometre (km)");
        itemsCikis.add("İnç (in)");
        itemsCikis.add("Feet (ft)");
        itemsCikis.add("Yarda (yd)");
        itemsCikis.add("Mil (mi)");
        itemsCikis.add("Deniz mili (NM)");


        // ArrayAdapter ile spinnerCikis'e veri bağlama
        ArrayAdapter<String> adapterCikis = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, itemsCikis);
        adapterCikis.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCikis.setAdapter(adapterCikis);
        spinnerCikis.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                nerde=false;
                switch (position){
                    case 0:
                        cikisBirim.setText("mm");
                        positionUnitCikis="mm";
                        break;
                    case 1:
                        cikisBirim.setText("cm");
                        positionUnitCikis="cm";
                        break;
                    case 2:
                        cikisBirim.setText("m");
                        positionUnitCikis="m";
                        break;
                    case 3:
                        cikisBirim.setText("km");
                        positionUnitCikis="km";
                        break;
                    case 4:
                        cikisBirim.setText("in");
                        positionUnitCikis="in";
                        break;
                    case 5:
                        cikisBirim.setText("ft");
                        positionUnitCikis="ft";
                        break;
                    case 6:
                        cikisBirim.setText("yd");
                        positionUnitCikis="yd";
                        break;
                    case 7:
                        cikisBirim.setText("mi");
                        positionUnitCikis="mi";
                        break;
                    case 8:
                        cikisBirim.setText("NM");
                        positionUnitCikis="NM";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        // Oluşturduğumuz view'i döndür
        return view;
    }

    @Override
    public void onNumberClick(String number) {
        if (searchAlgorithm.characterSize(TextGiris.getText().toString()) && searchAlgorithm.characterSize(TextCikis.getText().toString())) {
            if (number == ".") {

                if (TextGiris.getText().toString().equals("")) {

                    if (nerde) {
                        TextGiris.setText(TextGiris.getText() + "0.");
                        TextCikis.setText(TextCikis.getText() + "0.");
                    } else {
                        TextCikis.setText(TextCikis.getText() + "0.");
                        TextGiris.setText(TextGiris.getText() + "0.");
                    }
                } else if (searchAlgorithm.control(TextGiris.getText().toString())) {
                    if (nerde == true) {
                        TextGiris.setText(TextGiris.getText() + "");
                        girisSonuc = conversionFunctions.ConversionFunctions("uznulukFragment", positionUnitGiris, positionUnitCikis, TextGiris.getText().toString());
                        TextCikis.setText(String.valueOf(girisSonuc));

                    }

                } else if (searchAlgorithm.control(TextCikis.getText().toString())) {
                    if (nerde == false) {
                        TextCikis.setText(TextCikis.getText() + "");
                        girisSonuc = conversionFunctions.ConversionFunctions("uznulukFragment", positionUnitGiris, positionUnitCikis, TextCikis.getText().toString());
                        TextGiris.setText(String.valueOf(girisSonuc));
                    }

                } else {
                    if (nerde) {
                        TextGiris.setText(TextGiris.getText() + ".");

                    } else {
                        TextCikis.setText(TextCikis.getText() + ".");

                    }
                }

            } else {
                // Normal sayı girişi
                if (nerde) {
                    TextGiris.setText(TextGiris.getText() + number);
                    // Dönüştürme işlemi
                    if (!TextGiris.getText().toString().isEmpty()) {
                        if (conversionFunctions != null) {
                            girisSonuc = conversionFunctions.ConversionFunctions("uznulukFragment", positionUnitGiris, positionUnitCikis, TextGiris.getText().toString());
                            TextCikis.setText(String.valueOf(girisSonuc)); // Sonucu göster
                        } else {
                            TextCikis.setText("Dönüştürme fonksiyonu başlatılamadı.");
                        }
                    } else {
                        TextCikis.setText("Lütfen Değer Giriniz.");
                    }
                } else {
                    TextCikis.setText(TextCikis.getText() + number);
                    // Dönüştürme işlemi
                    if (!TextCikis.getText().toString().isEmpty()) {
                        if (conversionFunctions != null) {
                            cikisSonuc = conversionFunctions.ConversionFunctions("uznulukFragment", positionUnitGiris, positionUnitCikis, TextCikis.getText().toString());
                            TextGiris.setText(String.valueOf(cikisSonuc)); // Sonucu göster
                        } else {
                            TextGiris.setText("Dönüştürme fonksiyonu başlatılamadı.");
                        }
                    } else {
                        TextGiris.setText("Lütfen Değer Giriniz.");
                    }
                }
            }

        }
        else{
            Toast.makeText(getActivity(),"En Fazla 15 Karakter",Toast.LENGTH_SHORT).show();
        }
    }




    //Burada Activity içerisindeki  işlem buttonlarını dinliyoruz.
    @Override
    public void onProcessClick(String islem, int tipAsagi, int tipYukari) {
        if (islem.equals("reset")) {


            if ((tipYukari == 1)) {
                noktaKullanimi=1;
                TextGiris.setText("");
                TextCikis.setText("");
            } else if (tipAsagi == 1) {
                TextCikis.setText("");
                TextGiris.setText("");
            }

        } else if (islem.equals("clear")) {
            if (nerde) {
                //Sb sıfırlıyoruz bir öncekini yendiden eklemesini engeliyoruz.
                sb.setLength(0);
                sb.append(TextGiris.getText().toString());

                if (sb.length() > 0) {


                    if(searchAlgorithm.endCharacter(TextGiris.getText().toString())){
                        TextGiris.setText(TextGiris.getText()+"");

                    }
                    else {
                        if(TextGiris.getText().toString().equals("0")){
                            sb.deleteCharAt(sb.length() - 1); // Son karakteri sil
                            TextGiris.setText(sb.toString());
                        }
                        else{
                            sb.deleteCharAt(sb.length() - 1); // Son karakteri sil
                            TextGiris.setText(sb.toString());
                            girisSonuc = conversionFunctions.ConversionFunctions("uznulukFragment", positionUnitGiris, positionUnitCikis, TextGiris.getText().toString());
                            TextCikis.setText(String.valueOf(girisSonuc));
                        }

                    }


                    ;// TextView güncelle
                }
            } else {
                //Sb sıfırlıyoruz bir öncekini yendiden eklemesini engeliyoruz.
                sb.setLength(0);
                sb.append(TextCikis.getText().toString());
                if (sb.length() > 0) {

                    if(searchAlgorithm.endCharacter(TextCikis.getText().toString())){
                        TextCikis.setText(TextCikis.getText()+"");

                    }
                    else {
                        if(TextCikis.getText().toString().equals("0")){
                            sb.deleteCharAt(sb.length() - 1); // Son karakteri sil
                            TextCikis.setText(sb.toString());
                        }
                        else{
                            sb.deleteCharAt(sb.length() - 1); // Son karakteri sil
                            TextCikis.setText(sb.toString());
                            girisSonuc = conversionFunctions.ConversionFunctions("uznulukFragment", positionUnitGiris, positionUnitCikis, TextCikis.getText().toString());
                            TextGiris.setText(String.valueOf(girisSonuc));
                        }

                    }
                }
            }


        }
        else if (islem.equals("-")) {
            if (nerde) {
                TextGiris.setText(TextGiris.getText() + "");
            } else {
                TextCikis.setText(TextCikis.getText() + "");
            }
        }

        else if (islem.equals("yukari")) {
            if (tipYukari == 1) {
                nerde = true;
            }

        } else if (islem.equals("asagi")) {
            if (tipAsagi == 1) {
                nerde = false;
            }
        }
    }
}
