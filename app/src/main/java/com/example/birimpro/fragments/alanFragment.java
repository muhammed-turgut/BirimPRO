package com.example.birimpro.fragments;

import static android.widget.Toast.*;

import android.app.Activity;
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

import com.example.birimpro.hasmaps.UnitConverterAlan;
import com.example.birimpro.myfunction.ConversionFunctions;
import com.example.birimpro.myfunction.OnNumberClickListener;
import com.example.birimpro.R;
import com.example.birimpro.myfunction.SearchAlgorithm;
import com.example.birimpro.view.MainActivity;

import java.util.ArrayList;
import java.util.List;

public class alanFragment extends Fragment implements OnNumberClickListener {

    TextView girisBirim, cikisBirim, TextGiris, TextCikis;
    Spinner spinnerGiris, spinnerCikis;
    List<String> itemsGiris, itemsCikis;

    //Boolen yukarida=true ,asagida=false.
   public boolean nerde = true;

    //Burda String Builder Olarak kullandığım nesne stringlerde sondan karakter çıkaram işine yarıyor.
    StringBuilder sb = new StringBuilder();

    //Bu değişken spinner içerisinden alınan degeri convertionFuncition götüren yapi.
    public String positionUnitGiris="ac",positionUnitCikis="ac";
    ConversionFunctions conversionFunctions;
    SearchAlgorithm searchAlgorithm;
    public double girisSonuc = 0.0,cikisSonuc=0.0;
    public  int noktaKullanimi=0;
    UnitConverterAlan unitConverterAlan;
    MainActivity activityMain;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Fragment'ın layout'unu şişiriyoruz
        View view = inflater.inflate(R.layout.fragment_alan, container, false);

        conversionFunctions = new ConversionFunctions();
        searchAlgorithm = new SearchAlgorithm();
        unitConverterAlan=new UnitConverterAlan();
        activityMain=new MainActivity();

        // Giriş Spinner'ı tanımlama
        spinnerGiris = view.findViewById(R.id.spinnerGiriş);

        // Çıkış Spinner'ı tanımlama
        spinnerCikis = view.findViewById(R.id.spinnerÇıkış);


        // Veri giriş yerlerinin birimlerin textleri
        girisBirim = view.findViewById(R.id.girisBirim);
        cikisBirim = view.findViewById(R.id.cikisBirim);

        // Veri giriş yerleri
        TextGiris = view.findViewById(R.id.TextGiriş);
        TextCikis = view.findViewById(R.id.TextÇıkış);



        itemsGiris = new ArrayList<>();
        // Giriş öğelerini ekleme
        itemsGiris.add("Akre (ac)");
        itemsGiris.add("Ar (a)");
        itemsGiris.add("Hektar (ha)");
        itemsGiris.add("Santimetre (cm²)");
        itemsGiris.add("Fit Kare (ft²)");
        itemsGiris.add("Inçkare (in²)");
        itemsGiris.add("Metrekare (m²)");


        // ArrayAdapter ile spinnerGiris'e veri bağlama
        ArrayAdapter<String> adapterGiris = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, itemsGiris);
        adapterGiris.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerGiris.setAdapter(adapterGiris);

        //Bu fonkisyonun amacı spinner üzerinde tıklanılan yerin neresi olduğunu anlamk.
         spinnerGiris.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

             @Override
             public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 nerde=true;
                 switch (position){
                     case 0:
                         girisBirim.setText("ac");
                         positionUnitGiris="ac";
                         break;
                     case 1:
                         girisBirim.setText("a");
                         positionUnitGiris="a";
                         break;
                     case 2:
                         girisBirim.setText("ha");
                         positionUnitGiris="ha";
                         break;
                     case 3:
                         girisBirim.setText("cm²");
                         positionUnitGiris="cm²";
                         break;
                     case 4:
                         girisBirim.setText("ft²");
                         positionUnitGiris="ft²";
                         break;
                     case 5:
                         girisBirim.setText("in²");
                         positionUnitGiris="in²";
                         break;
                     case 6:
                         girisBirim.setText("m²");
                         positionUnitGiris="m²";
                         break;
                 }
             }

             @Override
             public void onNothingSelected(AdapterView<?> parent) {

             }
         });



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
        spinnerCikis.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                nerde=false;
                switch (position){
                    case 0:
                        cikisBirim.setText("ac");
                        positionUnitCikis="ac";
                        break;
                    case 1:
                        cikisBirim.setText("a");
                        positionUnitCikis="a";
                        break;
                    case 2:
                        cikisBirim.setText("ha");
                        positionUnitCikis="ha";
                        break;
                    case 3:
                        cikisBirim.setText("cm²");
                        positionUnitCikis="cm²";
                        break;
                    case 4:
                        cikisBirim.setText("ft²");
                        positionUnitCikis="ft²";
                        break;
                    case 5:
                        cikisBirim.setText("in²");
                        positionUnitCikis="in²";
                        break;
                    case 6:
                        cikisBirim.setText("m²");
                        positionUnitCikis="m²";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        return view;
    }

    @Override
    public void onNumberClick(String number) {

            if (searchAlgorithm.characterSize(TextGiris.getText().toString()) && searchAlgorithm.characterSize(TextCikis.getText().toString())){
                if(number=="."){
                if(TextGiris.getText().toString().equals("")){

                    if (nerde){
                        TextGiris.setText(TextGiris.getText()+"0.");
                        TextCikis.setText(TextCikis.getText()+"0.");
                    }
                    else{
                        TextCikis.setText(TextCikis.getText()+"0.");
                        TextGiris.setText(TextGiris.getText()+"0.");
                    }
                }
                else if(searchAlgorithm.control(TextGiris.getText().toString())){
                    if (nerde==true){
                        TextGiris.setText(TextGiris.getText()+"");
                        girisSonuc = conversionFunctions.ConversionFunctions("alanFragment", positionUnitGiris, positionUnitCikis, TextGiris.getText().toString());
                        TextCikis.setText(String.valueOf(girisSonuc));

                    }

                } else if (searchAlgorithm.control(TextCikis.getText().toString())) {
                    if (nerde == false){
                        TextCikis.setText(TextCikis.getText()+"");
                        girisSonuc = conversionFunctions.ConversionFunctions("alanFragment", positionUnitGiris, positionUnitCikis, TextCikis.getText().toString());
                        TextGiris.setText(String.valueOf(girisSonuc));
                    }

                } else {
                    if(nerde){
                        TextGiris.setText(TextGiris.getText()+".");

                    }
                    else{
                        TextCikis.setText(TextCikis.getText()+".");

                    }
                }

            }
            else{
                // Normal sayı girişi
                if (nerde) {
                    TextGiris.setText(TextGiris.getText() + number);
                    // Dönüştürme işlemi
                    if (!TextGiris.getText().toString().isEmpty()) {
                        if (conversionFunctions != null) {
                            girisSonuc = conversionFunctions.ConversionFunctions("alanFragment", positionUnitGiris, positionUnitCikis, TextGiris.getText().toString());
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
                            cikisSonuc = conversionFunctions.ConversionFunctions("alanFragment", positionUnitGiris, positionUnitCikis, TextCikis.getText().toString());
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
            makeText(getActivity(),"En Fazla 15 Karakter", LENGTH_SHORT).show();
        }


    }



    //Burada Activity içerisindeki  işlem buttonlarını dinliyoruz.
    @Override
    public void onProcessClick(String islem, int tipAsagi, int tipYukari) {

            if (islem.equals("reset")) {


                if ((tipYukari == 1)) {
                    noktaKullanimi = 1;
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


                        if (searchAlgorithm.endCharacter(TextGiris.getText().toString())) {
                            TextGiris.setText(TextGiris.getText() + "");

                        } else {
                            if (TextGiris.getText().toString().equals("0")) {
                                sb.deleteCharAt(sb.length() - 1); // Son karakteri sil
                                TextGiris.setText(sb.toString());
                            } else {
                                sb.deleteCharAt(sb.length() - 1); // Son karakteri sil
                                TextGiris.setText(sb.toString());
                                girisSonuc = conversionFunctions.ConversionFunctions("alanFragment", positionUnitGiris, positionUnitCikis, TextGiris.getText().toString());
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

                        if (searchAlgorithm.endCharacter(TextCikis.getText().toString())) {
                            TextCikis.setText(TextCikis.getText() + "");

                        } else {
                            if (TextCikis.getText().toString().equals("0")) {
                                sb.deleteCharAt(sb.length() - 1); // Son karakteri sil
                                TextCikis.setText(sb.toString());
                            } else {
                                sb.deleteCharAt(sb.length() - 1); // Son karakteri sil
                                TextCikis.setText(sb.toString());
                                girisSonuc = conversionFunctions.ConversionFunctions("alanFragment", positionUnitGiris, positionUnitCikis, TextCikis.getText().toString());
                                TextGiris.setText(String.valueOf(girisSonuc));
                            }

                        }
                    }
                }


            } else if (islem.equals("-")) {
                if (nerde) {
                    TextGiris.setText(TextGiris.getText() + "");
                } else {
                    TextCikis.setText(TextCikis.getText() + "");
                }
            } else if (islem.equals("yukari")) {
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
