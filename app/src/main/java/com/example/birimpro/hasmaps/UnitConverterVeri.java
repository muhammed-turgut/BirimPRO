package com.example.birimpro.hasmaps;

import java.util.HashMap;
import java.util.Map;

public class UnitConverterVeri {

    // Her birim için sabit dönüşüm oranları
    private static Map<String, Map<String, Double>> conversionRates = new HashMap<>();

    // Dönüşüm oranlarını tanımlama
    static {
        // Milimetre için dönüşüm oranları
        Map<String, Double> bitConversions = new HashMap<>();

        bitConversions.put("bit", 1.0); // 1 bit = 1.0 bit
        bitConversions.put("B", 0.125); // 1 bayt = 40.468564224 bayt
        bitConversions.put("KB", 0.0001220703); // 1 kilobayt = 0.4046856422 kilobayt
        bitConversions.put("MB", 1.19209290E-7); // 1 megabayt = 43.560 megabayt
        bitConversions.put("GB", 1.16415322E-10); // 1 gigabayt = 0.0393700787 gigabayt
        bitConversions.put("TB", 1.13686838E-17); // 1 terabayt = 6272640.0 terabayt




        // Santimetre için dönüşüm oranları
        Map<String, Double> baytConversions = new HashMap<>();
        baytConversions.put("bit", 8.0); // 1 Akre = 1.0 Akre
        baytConversions.put("B", 1.0); // 1 Akre = 40.468564224 Ar
        baytConversions.put("KB", 0.0009765625); // 1 Akre = 0.4046856422 Hektar
        baytConversions.put("MB", 9.53674316E-7); // 1 Akre = 43.560 Santimetre Kare
        baytConversions.put("GB", 9.31322575E-10); // 1 Akre = 0.0393700787 Fit Kare
        baytConversions.put("TB", 9.0949702E-13); // 1 Akre = 6272640.0 Inçkare


        // Metre için dönüşüm oranları
        Map<String, Double> kilobaytConversions = new HashMap<>();
        kilobaytConversions.put("bit", 8192.0); // 1 Akre = 1.0 Akre
        kilobaytConversions.put("B", 1024.0); // 1 Akre = 40.468564224 Ar
        kilobaytConversions.put("KB", 1.0); // 1 Akre = 0.4046856422 Hektar
        kilobaytConversions.put("MB", 0.0009765625); // 1 Akre = 43.560 Santimetre Kare
        kilobaytConversions.put("GB", 9.53674316E-7); // 1 Akre = 0.0393700787 Fit Kare
        kilobaytConversions.put("TB", 9.31322575E-10); // 1 Akre = 6272640.0 Inçkare


        // Kilometre için dönüşüm oranları
        Map<String, Double> megaBaytConversions = new HashMap<>();
        megaBaytConversions.put("bit", 8388608.0); // 1 Akre = 1.0 Akre
        megaBaytConversions.put("B", 1048576.0); // 1 Akre = 40.468564224 Ar
        megaBaytConversions.put("KB", 1024.0); // 1 Akre = 0.4046856422 Hektar
        megaBaytConversions.put("MB", 1.0); // 1 Akre = 43.560 Santimetre Kare
        megaBaytConversions.put("GB", 0.0009765615); // 1 Akre = 0.0393700787 Fit Kare
        megaBaytConversions.put("TB", 9.53674316E-7); // 1 Akre = 6272640.0 Inçkare


        // İnç için dönüşüm oranları
        Map<String, Double> gigaBaytConversions = new HashMap<>();
        gigaBaytConversions.put("bit", 8589934592.0); // 1 Akre = 1.0 Akre
        gigaBaytConversions.put("B", 1073741824.0); // 1 Akre = 40.468564224 Ar
        gigaBaytConversions.put("KB", 1048576.0); // 1 Akre = 0.4046856422 Hektar
        gigaBaytConversions.put("MB", 1024.0); // 1 Akre = 43.560 Santimetre Kare
        gigaBaytConversions.put("GB", 1.0); // 1 Akre = 0.0393700787 Fit Kare
        gigaBaytConversions.put("TB", 0.0009765625); // 1 Akre = 6272640.0 Inçkare


        // Feet için dönüşüm oranları
        Map<String, Double> teraBaytConversions = new HashMap<>();
        teraBaytConversions.put("bit", 8796093022208.0); // 1 Akre = 1.0 Akre
        teraBaytConversions.put("B", 1099511627776.0); // 1 Akre = 40.468564224 Ar
        teraBaytConversions.put("KB", 1073741824.0); // 1 Akre = 0.4046856422 Hektar
        teraBaytConversions.put("MB", 1048576.0); // 1 Akre = 43.560 Santimetre Kare
        teraBaytConversions.put("GB", 1024.0); // 1 Akre = 0.0393700787 Fit Kare
        teraBaytConversions.put("TB", 1.0); // 1 Akre = 6272640.0 Inçkare



        // Milimetreyi haritaya ekle
        conversionRates.put("bit", bitConversions);
        conversionRates.put("B", baytConversions);
        conversionRates.put("KB", kilobaytConversions);
        conversionRates.put("MB", megaBaytConversions);
        conversionRates.put("GB", gigaBaytConversions);
        conversionRates.put("TB", teraBaytConversions);

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
