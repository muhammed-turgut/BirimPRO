package com.example.birimpro.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.birimpro.myfunction.ConversionFunctions;
import com.example.birimpro.myfunction.OnNumberClickListener;
import com.example.birimpro.R;
import com.example.birimpro.myfunction.SearchAlgorithm;

import java.util.ArrayList;
import java.util.List;


public class HizFragment extends Fragment implements OnNumberClickListener {
    TextView girisBirim,cikisBirim,TextGiris,TextCikis;

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
        View view = inflater.inflate(R.layout.fragment_hiz, container, false);

        searchAlgorithm=new SearchAlgorithm();
        conversionFunctions=new ConversionFunctions();

        // Giriş Spinner'ı tanımlama
        spinnerGiris = view.findViewById(R.id.spinnerGiriş);
        itemsGiris = new ArrayList<>();

        // Çıkış Spinner'ı tanımlama
        spinnerCikis = view.findViewById(R.id.spinnerÇıkış);
        itemsCikis = new ArrayList<>();

        //veri giris yerlerideki birimlerin text leri
        girisBirim=view.findViewById(R.id.girisBirim);
        cikisBirim=view.findViewById(R.id.cikisBirim);

        //Veri giris yerleri
        TextGiris=view.findViewById(R.id.TextGiriş);
        TextCikis=view.findViewById(R.id.TextÇıkış);

        // Giriş öğelerini ekleme
        itemsGiris.add("Metre/saniye (m/s)");
        itemsGiris.add("Metre/saat (m/h)");
        itemsGiris.add("Kilometre/saat (km/s)");
        itemsGiris.add("Kilometre/saat (km/h)");
        itemsGiris.add("İnç/saniye (in/s)");
        itemsGiris.add("İnç/saat (in/h)");
        itemsGiris.add("Fit/saniye (ft/s)");
        itemsGiris.add("Fit/saat (ft/h)");
        itemsGiris.add("Mil/saniye (mi/s)");
        itemsGiris.add("Mil/saniye (mi/h)");
        itemsGiris.add("Knot (kn)");
        itemsGiris.add("Işık Hızı (c)");
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
                        girisBirim.setText("m/s");
                        positionUnitGiris="m/s";
                        break;
                    case 1:
                        girisBirim.setText("m/h");
                        positionUnitGiris="m/h";
                        break;
                    case 2:
                        girisBirim.setText("km/s");
                        positionUnitGiris="km/s";
                        break;
                    case 3:
                        girisBirim.setText("km/h");
                        positionUnitGiris="km/h";
                        break;
                    case 4:
                        girisBirim.setText("in/s");
                        positionUnitGiris="in/s";
                        break;
                    case 5:
                        girisBirim.setText("in/h");
                        positionUnitGiris="in/h";
                        break;
                    case 6:
                        girisBirim.setText("ft/s");
                        positionUnitGiris="ft/s";
                        break;
                    case 7:
                        girisBirim.setText("ft/h");
                        positionUnitGiris="ft/h";
                        break;
                    case 8:
                        girisBirim.setText("mi/s");
                        positionUnitGiris="mi/s";
                        break;
                    case 9:
                        girisBirim.setText("mi/h");
                        positionUnitGiris="mi/h";
                        break;
                    case 10:
                        girisBirim.setText("kn");
                        positionUnitGiris="kn";
                        break;

                    case 11:
                        girisBirim.setText("c");
                        positionUnitGiris="c";


                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        // Çıkış öğelerini ekleme
        itemsCikis.add("Metre/saniye (m/s)");
        itemsCikis.add("Metre/saat (m/h)");
        itemsCikis.add("Kilometre/saat (km/s)");
        itemsCikis.add("Kilometre/saat (km/h)");
        itemsCikis.add("İnç/saniye (in/s)");
        itemsCikis.add("İnç/saat (in/h)");
        itemsCikis.add("Fit/saniye (ft/s)");
        itemsCikis.add("Fit/saat (ft/h)");
        itemsCikis.add("Mil/saniye (mi/s)");
        itemsCikis.add("Mil/saniye (mi/h)");
        itemsCikis.add("Knot (kn)");
        itemsCikis.add("Işık Hızı (c)");
        // ArrayAdapter ile spinnerCikis'e veri bağlama
        ArrayAdapter<String> adapterCikis = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, itemsCikis);
        adapterCikis.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCikis.setAdapter(adapterCikis);
        spinnerCikis.invalidate();
        spinnerCikis.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                nerde=false;
                switch (position){
                    case 0:
                        cikisBirim.setText("m/s");
                        positionUnitCikis="m/s";
                        break;
                    case 1:
                        cikisBirim.setText("m/h");
                        positionUnitCikis="m/h";
                        break;
                    case 2:
                        cikisBirim.setText("km/s");
                        positionUnitCikis="km/s";
                        break;
                    case 3:
                        cikisBirim.setText("km/h");
                        positionUnitCikis="km/h";
                        break;
                    case 4:
                        cikisBirim.setText("in/s");
                        positionUnitCikis="in/s";
                        break;
                    case 5:
                        cikisBirim.setText("in/h");
                        positionUnitCikis="in/h";
                        break;
                    case 6:
                        cikisBirim.setText("ft/s");
                        positionUnitCikis="ft/s";
                        break;
                    case 7:
                        cikisBirim.setText("ft/h");
                        positionUnitCikis="ft/h";
                        break;
                    case 8:
                        cikisBirim.setText("mi/s");
                        positionUnitCikis="mi/s";
                        break;
                    case 9:
                        cikisBirim.setText("mi/h");
                        positionUnitCikis="mi/h";
                        break;
                    case 10:
                        cikisBirim.setText("kn");
                        positionUnitCikis="kn";
                        break;
                    case 11:
                        cikisBirim.setText("c");
                        positionUnitCikis="c";


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        // Oluşturduğumuz view'i döndür
        return view;

    }

    //onNumberClik ile Activity içerisindeki sayı buttonlarını dinliyoruz.
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
                        girisSonuc = conversionFunctions.ConversionFunctions("HizFragment", positionUnitGiris, positionUnitCikis, TextGiris.getText().toString());
                        TextCikis.setText(String.valueOf(girisSonuc));

                    }

                } else if (searchAlgorithm.control(TextCikis.getText().toString())) {
                    if (nerde == false) {
                        TextCikis.setText(TextCikis.getText() + "");
                        girisSonuc = conversionFunctions.ConversionFunctions("HizFragment", positionUnitGiris, positionUnitCikis, TextCikis.getText().toString());
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
                            girisSonuc = conversionFunctions.ConversionFunctions("HizFragment", positionUnitGiris, positionUnitCikis, TextGiris.getText().toString());
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
                            cikisSonuc = conversionFunctions.ConversionFunctions("HizFragment", positionUnitGiris, positionUnitCikis, TextCikis.getText().toString());
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
                            girisSonuc = conversionFunctions.ConversionFunctions("HizFragment", positionUnitGiris, positionUnitCikis, TextGiris.getText().toString());
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
                            girisSonuc = conversionFunctions.ConversionFunctions("HizFragment", positionUnitGiris, positionUnitCikis, TextCikis.getText().toString());
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