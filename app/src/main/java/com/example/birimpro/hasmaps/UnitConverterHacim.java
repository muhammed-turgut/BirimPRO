package com.example.birimpro.hasmaps;

import java.util.HashMap;
import java.util.Map;

public class UnitConverterHacim {

    // Her birim için sabit dönüşüm oranları
    private static Map<String, Map<String, Double>> conversionRates = new HashMap<>();

    // Dönüşüm oranlarını tanımlama
    static {
        // Milimetre için dönüşüm oranları
        Map<String, Double> BKGalonConversions = new HashMap<>();

        BKGalonConversions.put("Bgal", 1.0); // 1 BKgal = 1.0 Akre
        BKGalonConversions.put("Agal", 1.2009499255); // 1 Akre = 40.468564224 Ar
        BKGalonConversions.put("l", 4.54609); // 1 Akre = 40.468564224 Ar
        BKGalonConversions.put("ml", 5546.09); // 1 Akre = 40.468564224 Ar
        BKGalonConversions.put("cm³", 4546.09); // 1 Akre = 0.4046856422 Hektar
        BKGalonConversions.put("m³", 0.004546609); // 1 Akre = 43.560 Santimetre Kare
        BKGalonConversions.put("in³", 277.4194327916); // 1 Akre = 0.0393700787 Fit Kare
        BKGalonConversions.put("ft³", 0.1605436532); // 1 Akre = 6272640.0 Inçkare




        // Santimetre için dönüşüm oranları
        Map<String, Double> ABDgalConversions = new HashMap<>();
        ABDgalConversions.put("Bgal", 0.8326741846); // 1 Akre = 1.0 Akre
        ABDgalConversions.put("Agal", 1.0); // 1 Akre = 40.468564224 Ar
        ABDgalConversions.put("l", 3.785411784); // 1 Akre = 40.468564224 Ar
        ABDgalConversions.put("ml", 3785.411784); // 1 Akre = 40.468564224 Ar
        ABDgalConversions.put("cm³", 3785.411784); // 1 Akre = 0.4046856422 Hektar
        ABDgalConversions.put("m³", 0.0037854118); // 1 Akre = 43.560 Santimetre Kare
        ABDgalConversions.put("in³", 231.0); // 1 Akre = 0.0393700787 Fit Kare
        ABDgalConversions.put("ft³", 0.1336805556); // 1 Akre = 6272640.0 Inçkare



        // Santimetre için dönüşüm oranları
        Map<String, Double> litreConversions = new HashMap<>();
        litreConversions.put("Bgal", 0.2199692483); // 1 Akre = 1.0 Akre
        litreConversions.put("Agal", 0.2641720524); // 1 Akre = 40.468564224 Ar
        litreConversions.put("l", 1.0); // 1 Akre = 40.468564224 Ar
        litreConversions.put("ml", 1000.0); // 1 Akre = 40.468564224 Ar
        litreConversions.put("cm³", 1000.0); // 1 Akre = 0.4046856422 Hektar
        litreConversions.put("m³", 0.001); // 1 Akre = 43.560 Santimetre Kare
        litreConversions.put("in³", 61.0237440947); // 1 Akre = 0.0393700787 Fit Kare
        litreConversions.put("ft³", 0.0353146667); // 1 Akre = 6272640.0 Inçkare


        // Santimetre için dönüşüm oranları
        Map<String, Double> miliLitreConversions = new HashMap<>();
        miliLitreConversions.put("Bgal", 0.0002199692); // 1 Akre = 1.0 Akre
        miliLitreConversions.put("Agal", 0.0002641721); // 1 Akre = 40.468564224 Ar
        miliLitreConversions.put("l", 0.001); // 1 Akre = 40.468564224 Ar
        miliLitreConversions.put("ml", 1.0); // 1 Akre = 40.468564224 Ar
        miliLitreConversions.put("cm³", 1.0); // 1 Akre = 0.4046856422 Hektar
        miliLitreConversions.put("m³", 0.000001); // 1 Akre = 43.560 Santimetre Kare
        miliLitreConversions.put("in³", 0.0610237441); // 1 Akre = 0.0393700787 Fit Kare
        miliLitreConversions.put("ft³", 0.0000353147); // 1 Akre = 6272640.0 Inçkare



        // Metre için dönüşüm oranları
        Map<String, Double> santimetreKupConversions = new HashMap<>();
        santimetreKupConversions.put("Bgal", 0.0002199692); // 1 Akre = 1.0 Akre
        santimetreKupConversions.put("Agal", 0.0002641721); // 1 Akre = 40.468564224 Ar
        santimetreKupConversions.put("l", 0.001); // 1 Akre = 40.468564224 Ar
        santimetreKupConversions.put("ml", 1.0); // 1 Akre = 40.468564224 Ar
        santimetreKupConversions.put("cm³", 1.0); // 1 Akre = 0.4046856422 Hektar
        santimetreKupConversions.put("m³", 0.000001); // 1 Akre = 43.560 Santimetre Kare
        santimetreKupConversions.put("in³", 0.0610237441); // 1 Akre = 0.0393700787 Fit Kare
        santimetreKupConversions.put("ft³", 0.0000353147); // 1 Akre = 6272640.0 Inçkare


        // Kilometre için dönüşüm oranları
        Map<String, Double> metreKupConversions = new HashMap<>();
        metreKupConversions.put("Bgal", 219.9692482991); // 1 Akre = 1.0 Akre
        metreKupConversions.put("Agal", 264.1720523581); // 1 Akre = 40.468564224 Ar
        metreKupConversions.put("l", 1000.0); // 1 Akre = 40.468564224 Ar
        metreKupConversions.put("ml", 1000000.0); // 1 Akre = 40.468564224 Ar
        metreKupConversions.put("cm³", 1000000.0); // 1 Akre = 0.4046856422 Hektar
        metreKupConversions.put("m³", 1.0); // 1 Akre = 43.560 Santimetre Kare
        metreKupConversions.put("in³", 61023.744094732); // 1 Akre = 0.0393700787 Fit Kare
        metreKupConversions.put("ft³", 35.3146667215); // 1 Akre = 6272640.0 Inçkare


        // İnç için dönüşüm oranları
        Map<String, Double> incKupConversions = new HashMap<>();
        incKupConversions.put("Bgal", 0.0036046501); // 1 Akre = 1.0 Akre
        incKupConversions.put("Agal", 0.0043290043); // 1 Akre = 40.468564224 Ar
        incKupConversions.put("l", 0.016387064); // 1 Akre = 40.468564224 Ar
        incKupConversions.put("ml", 16.387064); // 1 Akre = 40.468564224 Ar
        incKupConversions.put("cm³", 16.387064); // 1 Akre = 0.4046856422 Hektar
        incKupConversions.put("m³", 0.0000163871); // 1 Akre = 43.560 Santimetre Kare
        incKupConversions.put("in³", 1.0); // 1 Akre = 0.0393700787 Fit Kare
        incKupConversions.put("ft³", 0.0005787037); // 1 Akre = 6272640.0 Inçkare


        // Feet için dönüşüm oranları
        Map<String, Double> fitKupConversions = new HashMap<>();
        fitKupConversions.put("Bgal", 6.228835459); // 1 Akre = 1.0 Akre
        fitKupConversions.put("Agal", 7.4805194805); // 1 Akre = 40.468564224 Ar
        fitKupConversions.put("l", 28.316846592); // 1 Akre = 40.468564224 Ar
        fitKupConversions.put("ml", 28316.846592); // 1 Akre = 40.468564224 Ar
        fitKupConversions.put("cm³", 28316.846592); // 1 Akre = 0.4046856422 Hektar
        fitKupConversions.put("m³", 0.0283168466); // 1 Akre = 43.560 Santimetre Kare
        fitKupConversions.put("in³", 1728.0); // 1 Akre = 0.0393700787 Fit Kare
        fitKupConversions.put("ft³", 1.0); // 1 Akre = 6272640.0 Inçkare



        conversionRates.put("Bgal", BKGalonConversions);
        conversionRates.put("Agal", ABDgalConversions);
        conversionRates.put("l", santimetreKupConversions);
        conversionRates.put("ml", miliLitreConversions);
        conversionRates.put("cm³", fitKupConversions);
        conversionRates.put("m³",metreKupConversions);
        conversionRates.put("in³", incKupConversions);
        conversionRates.put("ft³",fitKupConversions);

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
