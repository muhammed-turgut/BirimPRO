package com.example.birimpro.hasmaps;

import java.util.HashMap;
import java.util.Map;

public class UnitConverterSicaklik {

    // Her birim için sabit dönüşüm oranları
    private static Map<String, Map<String, Double>> conversionRates = new HashMap<>();

    // Dönüşüm oranlarını tanımlama
    static {
        // Milimetre için dönüşüm oranları
        Map<String, Double> santigrantConversions = new HashMap<>();

        santigrantConversions.put("°C", 1.0); // 1 Santigrant = 1.0 Santigrant
        santigrantConversions.put("°F", 33.8); // 1 Santigrant = 40.468564224 Fahrenayt
        santigrantConversions.put("K", 274.15); // 1 Santigrant = 0.4046856422 Kelvin


        // Santimetre için dönüşüm oranları
        Map<String, Double> fahrenaytConversions = new HashMap<>();
        fahrenaytConversions.put("°C", -17.2222222222); // 1 Fahrenayt = 0.0247105381 Santigrant
        fahrenaytConversions.put("°F", 1.0); // 1 Fahrenayt = 1.0 Fahrenayt
        fahrenaytConversions.put("K", 255.9277777778); // 1 Fahrenayt = 0.01 Kelvin


        // Metre için dönüşüm oranları
        Map<String, Double> kelvinConversions = new HashMap<>();
        kelvinConversions.put("°C", -272.15); // 1 Kelvin = 1.0 Santigrant
        kelvinConversions.put("°F", -457.87); // 1 Kelvin = 0.1 Fahrenayt
        kelvinConversions.put("K", 1.0); // 1 Kelvin = 1.0 Kelvin



        // Milimetreyi haritaya ekle
        conversionRates.put("°C", santigrantConversions);
        conversionRates.put("°F", fahrenaytConversions);
        conversionRates.put("K", kelvinConversions);

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
