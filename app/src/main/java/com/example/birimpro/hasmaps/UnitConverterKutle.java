package com.example.birimpro.hasmaps;

import java.util.HashMap;
import java.util.Map;

public class UnitConverterKutle {

    // Her birim için sabit dönüşüm oranları
    private static Map<String, Map<String, Double>> conversionRates = new HashMap<>();

    // Dönüşüm oranlarını tanımlama
    static {
        // Milimetre için dönüşüm oranları
        Map<String, Double> TonConversions = new HashMap<>();

        TonConversions.put("ton", 1.0); // 1 ton = 1.0 ton
        TonConversions.put("BKt", 0.9842065276); // 1 Akre = 40.468564224 Ar
        TonConversions.put("ABDt", 1.1023113109); // 1 Akre = 0.4046856422 Hektar
        TonConversions.put("lb", 2204.6226218488); // 1 Akre = 43.560 Santimetre Kare
        TonConversions.put("oz", 35273.96194958); // 1 Akre = 0.0393700787 Fit Kare
        TonConversions.put("kg", 1000.0); // 1 Akre = 6272640.0 Inçkare
        TonConversions.put("g", 1000000.0); // 1 Akre = 4046.8564224 Metrekare



        // Santimetre için dönüşüm oranları
        Map<String, Double> BKtonConversions = new HashMap<>();
        BKtonConversions.put("ton", 1.0160469088); // 1 Akre = 1.0 Akre
        BKtonConversions.put("BKt", 1.0); // 1 Akre = 40.468564224 Ar
        BKtonConversions.put("ABDt", 1.12); // 1 Akre = 0.4046856422 Hektar
        BKtonConversions.put("lb", 2240.0); // 1 Akre = 43.560 Santimetre Kare
        BKtonConversions.put("oz", 35840.0); // 1 Akre = 0.0393700787 Fit Kare
        BKtonConversions.put("kg", 1016.0469088); // 1 Akre = 6272640.0 Inçkare
        BKtonConversions.put("g", 1016046.9088); // 1 Akre = 4046.8564224 Metrekare



        // Metre için dönüşüm oranları
        Map<String, Double> ABDtConversions = new HashMap<>();
        ABDtConversions.put("ton", 0.90718474); // 1 Akre = 1.0 Akre
        ABDtConversions.put("BKt", 0.8928571429); // 1 Akre = 40.468564224 Ar
        ABDtConversions.put("ABDt", 1.0); // 1 Akre = 0.4046856422 Hektar
        ABDtConversions.put("lb", 2000.0); // 1 Akre = 43.560 Santimetre Kare
        ABDtConversions.put("oz", 32000.0); // 1 Akre = 0.0393700787 Fit Kare
        ABDtConversions.put("kg", 907.18474); // 1 Akre = 6272640.0 Inçkare
        ABDtConversions.put("g", 907184.74); // 1 Akre = 4046.8564224 Metrekare



        // Kilometre için dönüşüm oranları
        Map<String, Double> poundConversions = new HashMap<>();
        poundConversions.put("ton", 0.0004535924); // 1 Akre = 1.0 Akre
        poundConversions.put("BKt", 0.0004464286); // 1 Akre = 40.468564224 Ar
        poundConversions.put("ABDt", 0.0005); // 1 Akre = 0.4046856422 Hektar
        poundConversions.put("lb", 1.0); // 1 Akre = 43.560 Santimetre Kare
        poundConversions.put("oz", 16.0); // 1 Akre = 0.0393700787 Fit Kare
        poundConversions.put("kg", 0.45359237); // 1 Akre = 6272640.0 Inçkare
        poundConversions.put("g", 453.59237); // 1 Akre = 4046.8564224 Metrekare



        // İnç için dönüşüm oranları
        Map<String, Double> OnsConversions = new HashMap<>();
        OnsConversions.put("ton", 0.0000283495); // 1 Akre = 1.0 Akre
        OnsConversions.put("BKt", 0.0000279018); // 1 Akre = 40.468564224 Ar
        OnsConversions.put("ABDt", 0.00003125); // 1 Akre = 0.4046856422 Hektar
        OnsConversions.put("lb", 0.0625); // 1 Akre = 43.560 Santimetre Kare
        OnsConversions.put("oz", 1.0); // 1 Akre = 0.0393700787 Fit Kare
        OnsConversions.put("kg", 0.0283495231); // 1 Akre = 6272640.0 Inçkare
        OnsConversions.put("g", 28.349523125); // 1 Akre = 4046.8564224 Metrekare



        // Feet için dönüşüm oranları
        Map<String, Double> kilogramConversions = new HashMap<>();
        kilogramConversions.put("ton", 0.001); // 1 Akre = 1.0 Akre
        kilogramConversions.put("BKt", 0.0009842065); // 1 Akre = 40.468564224 Ar
        kilogramConversions.put("ABDt", 0.0011023113); // 1 Akre = 0.4046856422 Hektar
        kilogramConversions.put("lb", 2.2046226218); // 1 Akre = 43.560 Santimetre Kare
        kilogramConversions.put("oz", 35.2739619496); // 1 Akre = 0.0393700787 Fit Kare
        kilogramConversions.put("kg", 1.0); // 1 Akre = 6272640.0 Inçkare
        kilogramConversions.put("g", 1000.0); // 1 Akre = 4046.8564224 Metrekare


        // Yarda için dönüşüm oranları
        Map<String, Double> gramConversions = new HashMap<>();
        gramConversions.put("ton", 0.000001); // 1 Akre = 1.0 Akre
        gramConversions.put("BKt", 9.84206528E-7); // 1 Akre = 40.468564224 Ar
        gramConversions.put("ABDt", 0.0000011023); // 1 Akre = 0.4046856422 Hektar
        gramConversions.put("lb", 0.0022046226); // 1 Akre = 43.560 Santimetre Kare
        gramConversions.put("oz", 0.0352739619); // 1 Akre = 0.0393700787 Fit Kare
        gramConversions.put("kg", 0.001); // 1 Akre = 6272640.0 Inçkare
        gramConversions.put("g", 1.0); // 1 Akre = 4046.8564224 Metrekare




        // Milimetreyi haritaya ekle
        conversionRates.put("ton", TonConversions);
        conversionRates.put("BKt", BKtonConversions);
        conversionRates.put("ABDt", ABDtConversions);
        conversionRates.put("lb", poundConversions);
        conversionRates.put("oz", OnsConversions);
        conversionRates.put("kg", kilogramConversions);
        conversionRates.put("g", gramConversions);
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
