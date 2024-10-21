package com.example.birimpro.myfunction;

import android.annotation.SuppressLint;

import androidx.annotation.NonNull;

import com.example.birimpro.hasmaps.UnitConverterAlan;
import com.example.birimpro.hasmaps.UnitConverterHacim;
import com.example.birimpro.hasmaps.UnitConverterHiz;
import com.example.birimpro.hasmaps.UnitConverterKutle;
import com.example.birimpro.hasmaps.UnitConverterSicaklik;
import com.example.birimpro.hasmaps.UnitConverterSure;
import com.example.birimpro.hasmaps.UnitConverterUzunluk;
import com.example.birimpro.hasmaps.UnitConverterVeri;

@SuppressLint("NotConstructor")
public class ConversionFunctions {
    UnitConverterUzunluk unitConverterUzunluk;
    UnitConverterAlan unitConverterAlan;
    UnitConverterSicaklik unitConverterSicaklik;
    UnitConverterHacim unitConverterHacim;
    UnitConverterKutle unitConverterKutle;
    UnitConverterVeri unitConverterVeri;
    UnitConverterHiz unitConverterHiz;
    UnitConverterSure unitConverterSure;

    public double ConversionFunctions(@NonNull String fragmentName, String girisPosition ,String cikisPosition, String sayiStringGiris){
        double sayiGiris=Double.valueOf(sayiStringGiris);



        switch (fragmentName){
            case "alanFragment":
               return  alanHesap(girisPosition,cikisPosition,sayiGiris);



            case "uznulukFragment":
                 return uzunlukHesab(girisPosition,cikisPosition,sayiGiris);



            case "SicaklikFragment":
               return sicaklikHesap(girisPosition,cikisPosition,sayiGiris);



            case "HacimFragment":
               return hacimHesap(girisPosition,cikisPosition,sayiGiris);



            case "KutleFragment":
                return kutleHesap(girisPosition,cikisPosition,sayiGiris);



            case "VeriFragment":
               return veriHesap(girisPosition,cikisPosition,sayiGiris);



            case "HizFragment":
               return hizHesap(girisPosition,cikisPosition,sayiGiris);


            case "SureFragment":
                return sureHesap(girisPosition,cikisPosition,sayiGiris);

            default:
                //Burdaki kullanımın sebebi default değerin gözden kaçan değerleri yakalaması.
                throw new IllegalArgumentException("Geçersiz fragment adı: " + fragmentName);

        }
    }
    public double alanHesap(String girisPosition,String cikisPosition,Double sayiGiris) {

         return (unitConverterAlan.convert(girisPosition,cikisPosition,sayiGiris));


    }

    public double uzunlukHesab(String girisPosition,String cikisPosition,Double sayiGiris){
        return (unitConverterUzunluk.convert(girisPosition,cikisPosition,sayiGiris));

    }

    public double sicaklikHesap(String girisPosition,String cikisPosition,Double sayiGiris){
        return (unitConverterSicaklik.convert(girisPosition,cikisPosition,sayiGiris));

    }

    public double hacimHesap(String girisPosition,String cikisPosition,Double sayiGiris){
        return (unitConverterHacim.convert(girisPosition,cikisPosition,sayiGiris));
    }

    public double kutleHesap(String girisPosition,String cikisPosition,Double sayiGiris ){
        return (unitConverterKutle.convert(girisPosition,cikisPosition,sayiGiris));
    }

    public double veriHesap(String girisPosition,String cikisPosition,Double sayiGiris){
        return (unitConverterVeri.convert(girisPosition,cikisPosition,sayiGiris));
    }

    public double hizHesap(String girisPosition,String cikisPosition,Double sayiGiris){
        return (unitConverterHiz.convert(girisPosition,cikisPosition,sayiGiris));

    }

    public double sureHesap(String girisPosition,String cikisPosition,Double sayiGiris){

        return (unitConverterSure.convert(girisPosition,cikisPosition,sayiGiris));
    }



}
