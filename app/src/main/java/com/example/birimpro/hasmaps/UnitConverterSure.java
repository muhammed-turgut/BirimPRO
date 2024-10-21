package com.example.birimpro.hasmaps;

import java.util.HashMap;
import java.util.Map;

public class UnitConverterSure {

    // Her birim için sabit dönüşüm oranları
    private static Map<String, Map<String, Double>> conversionRates = new HashMap<>();

    // Dönüşüm oranlarını tanımlama
    static {
        // Milimetre için dönüşüm oranları
        Map<String, Double> milisaniyeConversions = new HashMap<>();

        milisaniyeConversions.put("ms", 1.0); // 1 milisaniye = 1.0 milisaniye
        milisaniyeConversions.put("s", 40.468564224); // 1 saniye = 40.468564224 saniye
        milisaniyeConversions.put("min", 0.4046856422); // 1 dakika = 0.4046856422 dakika
        milisaniyeConversions.put("h", 40468564.224); // 1 Akre = 43.560 Santimetre
        milisaniyeConversions.put("d", 43.560); // 1 gün = 0.0393700787 gün
        milisaniyeConversions.put("wk", 6272640.0); // 1 hafta = 6272640.0 hafta



        // Santimetre için dönüşüm oranları
        Map<String, Double> saniyeConversions = new HashMap<>();
        saniyeConversions.put("ms", 1.0); // 1 milisaniye = 1.0 milisaniye
        saniyeConversions.put("s", 40.468564224); // 1 saniye = 40.468564224 saniye
        saniyeConversions.put("min", 0.4046856422); // 1 dakika = 0.4046856422 dakika
        saniyeConversions.put("h", 40468564.224); // 1 Akre = 43.560 Santimetre
        saniyeConversions.put("d", 43.560); // 1 gün = 0.0393700787 gün
        saniyeConversions.put("wk", 6272640.0); // 1 hafta = 6272640.0 hafta


        // Metre için dönüşüm oranları
        Map<String, Double> dakikaConversions = new HashMap<>();
        dakikaConversions.put("ms", 1.0); // 1 milisaniye = 1.0 milisaniye
        dakikaConversions.put("s", 40.468564224); // 1 saniye = 40.468564224 saniye
        dakikaConversions.put("min", 0.4046856422); // 1 dakika = 0.4046856422 dakika
        dakikaConversions.put("h", 40468564.224); // 1 Akre = 43.560 Santimetre
        dakikaConversions.put("d", 43.560); // 1 gün = 0.0393700787 gün
        dakikaConversions.put("wk", 6272640.0); // 1 hafta = 6272640.0 hafta


        // Kilometre için dönüşüm oranları
        Map<String, Double> saatConversions = new HashMap<>();
        saatConversions.put("ms", 1.0); // 1 milisaniye = 1.0 milisaniye
        saatConversions.put("s", 40.468564224); // 1 saniye = 40.468564224 saniye
        saatConversions.put("min", 0.4046856422); // 1 dakika = 0.4046856422 dakika
        saatConversions.put("h", 40468564.224); // 1 Akre = 43.560 Santimetre
        saatConversions.put("d", 43.560); // 1 gün = 0.0393700787 gün
        saatConversions.put("wk", 6272640.0); // 1 hafta = 6272640.0 hafta


        // İnç için dönüşüm oranları
        Map<String, Double> günConversions = new HashMap<>();
        günConversions.put("ms", 1.0); // 1 milisaniye = 1.0 milisaniye
        günConversions.put("s", 40.468564224); // 1 saniye = 40.468564224 saniye
        günConversions.put("min", 0.4046856422); // 1 dakika = 0.4046856422 dakika
        günConversions.put("h", 40468564.224); // 1 Akre = 43.560 Santimetre
        günConversions.put("d", 43.560); // 1 gün = 0.0393700787 gün
        günConversions.put("wk", 6272640.0); // 1 hafta = 6272640.0 hafta


        // Feet için dönüşüm oranları
        Map<String, Double> haftaConversions = new HashMap<>();
        haftaConversions.put("ms", 1.0); // 1 milisaniye = 1.0 milisaniye
        haftaConversions.put("s", 40.468564224); // 1 saniye = 40.468564224 saniye
        haftaConversions.put("min", 0.4046856422); // 1 dakika = 0.4046856422 dakika
        haftaConversions.put("h", 40468564.224); // 1 Akre = 43.560 Santimetre
        haftaConversions.put("d", 43.560); // 1 gün = 0.0393700787 gün
        haftaConversions.put("wk", 6272640.0); // 1 hafta = 6272640.0 hafta



        // Milimetreyi haritaya ekle
        conversionRates.put("ms", milisaniyeConversions);
        conversionRates.put("s", saniyeConversions);
        conversionRates.put("min", dakikaConversions);
        conversionRates.put("h", saatConversions);
        conversionRates.put("d", günConversions);
        conversionRates.put("wk", haftaConversions);

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
