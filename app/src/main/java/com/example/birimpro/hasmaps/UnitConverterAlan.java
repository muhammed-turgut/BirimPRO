package com.example.birimpro.hasmaps;

import java.util.HashMap;
import java.util.Map;

public class UnitConverterAlan {

    // Her birim için sabit dönüşüm oranları
    private static Map<String, Map<String, Double>> conversionRates = new HashMap<>();

    // Dönüşüm oranlarını tanımlama
    static {
        // Milimetre için dönüşüm oranları
        Map<String, Double> AkreConversions = new HashMap<>();

        AkreConversions.put("ac", 1.0); // 1 Akre = 1.0 Akre
        AkreConversions.put("a", 40.468564224); // 1 Akre = 40.468564224 Ar
        AkreConversions.put("ha", 0.4046856422); // 1 Akre = 0.4046856422 Hektar
        AkreConversions.put("cm²", 40468564.224); // 1 Akre = 43.560 Santimetre Kare
        AkreConversions.put("ft²", 43.560); // 1 Akre = 0.0393700787 Fit Kare
        AkreConversions.put("in²", 6272640.0); // 1 Akre = 6272640.0 Inçkare
        AkreConversions.put("m²", 4046.8564224); // 1 Akre = 4046.8564224 Metrekare



        // Santimetre için dönüşüm oranları
        Map<String, Double> ArConversions = new HashMap<>();
        ArConversions.put("ac", 0.0247105381); // 1 Ar = 0.0247105381 Akre
        ArConversions.put("a", 1.0); // 1 Ar = 1.0 Ar
        ArConversions.put("ha", 0.01); // 1 Ar = 0.01 Hektar
        ArConversions.put("cm²", 1000000.0); // 1 Ar = 1000000.0 Santimetre Kare
        ArConversions.put("ft²", 1076.391041671); // 1 Ar = 1076.391041671 Fit Kare
        ArConversions.put("in²", 155000.31000062); // 1 Ar = 155000.31000062 Inçkare
        ArConversions.put("m²", 100.0); // 1 Ar = 100.0 Metrekare


        // Metre için dönüşüm oranları
        Map<String, Double> hektarConversions = new HashMap<>();
        hektarConversions.put("ac", 1.0); // 1 Hektar = 1.0 Akre
        hektarConversions.put("a", 0.1); // 1 Hektar = 0.1 Ar
        hektarConversions.put("ha", 0.001); // 1 Hektar = 0.001 Hektar
        hektarConversions.put("cm²", 0.000001); // 1 Hektar = 0.000001 Santimetre Kare
        hektarConversions.put("ft²", 0.0393700787); // 1 Hektar = 0.0393700787 Fit Kare
        hektarConversions.put("in²", 0.0010936133); // 1 Hektar = 0.0010936133 Inçkare
        hektarConversions.put("m²", 6.21371192E-7); // 1 Hektar = 0.000000621371192 Metrekare


        // Kilometre için dönüşüm oranları
        Map<String, Double> santimetreKareConversions = new HashMap<>();
        santimetreKareConversions.put("ac", 4.4710538147); // 1 SantimetreKare = 1.0 Akre
        santimetreKareConversions.put("a", 100.0); // 1 SantimetreKare = 0.1 Ar
        santimetreKareConversions.put("ha", 1.0); // 1 SantimetreKare = 0.001 Hektar
        santimetreKareConversions.put("cm²", 100000000.0); // 1 SantimetreKare = 0.000001 Santimetre Kare
        santimetreKareConversions.put("ft²", 107639.1041671); // 1 SantimetreKare = 0.0393700787 Fit Kare
        santimetreKareConversions.put("in²", 15500031.000062); // 1 SantimetreKare = 0.0010936133 Inçkare
        santimetreKareConversions.put("m²", 10000.0); // 1 SantimetreKare = 0.000000621371192 Metrekare


        // İnç için dönüşüm oranları
        Map<String, Double> fitKareConversions = new HashMap<>();
        fitKareConversions.put("ac", 0.0000229568); // 1 FitKare = 1.0 Akre
        fitKareConversions.put("a", 0.0009290304); // 1 FitKare = 0.1 Ar
        fitKareConversions.put("ha", 0.000092903); // 1 FitKare = 0.001 Hektar
        fitKareConversions.put("cm²", 929.0304); // 1 FitKare = 0.000001 Santimetre Kare
        fitKareConversions.put("ft²", 1.0); // 1 FitKare = 0.0393700787 Fit Kare
        fitKareConversions.put("in²", 144.0); // 1 FitKare = 0.0010936133 Inçkare
        fitKareConversions.put("m²", 0.09290304); // 1 FitKare = 0.000000621371192 Metrekare


        // Feet için dönüşüm oranları
        Map<String, Double> inckareConversions = new HashMap<>();
        inckareConversions.put("ac", 1.59422508E-7); // 1 Inçkare = 1.0 Akre
        inckareConversions.put("a", 0.0000064516); // 1 Inçkare = 0.1 Ar
        inckareConversions.put("ha", 6.45160000E-8); // 1 Inçkare = 0.001 Hektar
        inckareConversions.put("cm²", 6.4516); // 1 Inçkare = 0.000001 Santimetre Kare
        inckareConversions.put("ft²", 0.0069444444); // 1 Inçkare = 0.0393700787 Fit Kare
        inckareConversions.put("in²", 1.0); // 1 Inçkare = 0.0010936133 Inçkare
        inckareConversions.put("m²", 0.00064516); // 1 Inçkare = 0.000000621371192 Metrekare


        // Yarda için dönüşüm oranları
        Map<String, Double> metreKareConversions = new HashMap<>();
        metreKareConversions.put("ac", 0.0002471054); // 1 Metrekare = 1.0 Akre
        metreKareConversions.put("a", 0.01); // 1 Metrekare = 0.1 Ar
        metreKareConversions.put("ha", 0.0001); // 1 Metrekare = 0.001 Hektar
        metreKareConversions.put("cm²", 10000.0); // 1 Metrekare = 0.000001 Santimetre Kare
        metreKareConversions.put("ft²", 10.7639104167); // 1 Metrekare = 0.0393700787 Fit Kare
        metreKareConversions.put("in²", 1550.0031000062); // 1 Metrekare = 0.0010936133 Inçkare
        metreKareConversions.put("m²", 1.0); // 1 Metrekare = 0.000000621371192 Metrekare



        // Milimetreyi haritaya ekle
        conversionRates.put("ac", AkreConversions);
        conversionRates.put("a", ArConversions);
        conversionRates.put("ha", hektarConversions);
        conversionRates.put("cm²", santimetreKareConversions);
        conversionRates.put("ft²", fitKareConversions);
        conversionRates.put("in²", inckareConversions);
        conversionRates.put("m²", metreKareConversions);
    }

    // Dönüşüm fonksiyonu
    public static double convert(String fromUnit, String toUnit, double value) {
        if (conversionRates.containsKey(fromUnit) && conversionRates.get(fromUnit).containsKey(toUnit)) {
            // Dönüşüm oranını al ve değeri çarp
            double conversionFactor = conversionRates.get(fromUnit).get(toUnit);
            return value * conversionFactor;
        } else {
            throw new IllegalArgumentException("Geçersiz birim dönüşümü.");
        }
    }
}
