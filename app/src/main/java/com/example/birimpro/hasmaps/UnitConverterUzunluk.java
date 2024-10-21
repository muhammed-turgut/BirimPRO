package com.example.birimpro.hasmaps;

import java.util.HashMap;
import java.util.Map;

public class UnitConverterUzunluk {
    // Her birim için sabit dönüşüm oranları
    private static Map<String, Map<String, Double>> conversionRates = new HashMap<>();

    // Dönüşüm oranlarını tanımlama
    static {
        // Milimetre için dönüşüm oranları
        Map<String, Double> millimeterConversions = new HashMap<>();

        millimeterConversions.put("mm", 1.0); // 1 milimetre = 1.0 milimetre
        millimeterConversions.put("cm", 0.1); // 1 milimetre = 0.1 santimetre
        millimeterConversions.put("m", 0.001); // 1 milimetre = 0.001 metre
        millimeterConversions.put("km", 0.000001); // 1 milimetre = 0.000001 kilometre
        millimeterConversions.put("in", 0.0393700787); // 1 milimetre = 0.0393700787 İnç
        millimeterConversions.put("ft", 0.00328084); // 1 milimetre = 0.00328084 Feet
        millimeterConversions.put("yd", 0.0010936133); // 1 milimetre = 0.0010936133 Yarda
        millimeterConversions.put("mi", 6.21371192E-7); // 1 milimetre = 0.000000621371192 Mil
        millimeterConversions.put("NM", 5.399568E-6); // 1 milimetre = 0.000005399568 Deniz mili


        // Santimetre için dönüşüm oranları
        Map<String, Double> centimeterConversions = new HashMap<>();
        centimeterConversions.put("mm", 10.0); // 1 santimetre = 10 milimetre
        centimeterConversions.put("cm", 1.0); // 1 santimetre = 1.0 santimetre
        centimeterConversions.put("m", 0.01); // 1 santimetre = 0.01 metre
        centimeterConversions.put("km", 0.00001); // 1 santimetre = 0.00001 kilometre
        centimeterConversions.put("in", 0.393700787); // 1 santimetre = 0.393700787 İnç
        centimeterConversions.put("ft", 0.0328084); // 1 santimetre = 0.0328084 Feet
        centimeterConversions.put("yd", 0.01093613); // 1 santimetre = 0.01093613 Yarda
        centimeterConversions.put("mi", 0.00000621371); // 1 santimetre = 0.00000621371 Mil
        centimeterConversions.put("NM", 0.000005399568); // 1 santimetre = 0.000005399568 Deniz mili


        // Metre için dönüşüm oranları
        Map<String, Double> meterConversions = new HashMap<>();
        meterConversions.put("mm", 1000.0); // 1 metre = 1000 milimetre
        meterConversions.put("cm", 100.0); // 1 metre = 100 santimetre
        meterConversions.put("m", 1.0); // 1 metre = 1.0 metre
        meterConversions.put("km", 0.001); // 1 metre = 0.001 kilometre
        meterConversions.put("in", 39.3700787); // 1 metre = 39.3700787 İnç
        meterConversions.put("ft", 3.28084); // 1 metre = 3.28084 Feet
        meterConversions.put("yd", 1.0936133); // 1 metre = 1.0936133 Yarda
        meterConversions.put("mi", 0.000621371192); // 1 metre = 0.000621371192 Mil
        meterConversions.put("NM", 0.0005399568); // 1 metre = 0.0005399568 Deniz mili


        // Kilometre için dönüşüm oranları
        Map<String, Double> kilometerConversions = new HashMap<>();
        kilometerConversions.put("mm", 1000000.0); // 1 kilometre = 1000000 milimetre
        kilometerConversions.put("cm", 100000.0); // 1 kilometre = 100000 santimetre
        kilometerConversions.put("m", 1000.0); // 1 kilometre = 1000 metre
        kilometerConversions.put("km", 1.0); // 1 kilometre = 1.0 kilometre
        kilometerConversions.put("in", 39370.0787); // 1 kilometre = 39370.0787 İnç
        kilometerConversions.put("ft", 3280.84); // 1 kilometre = 3280.84 Feet
        kilometerConversions.put("yd", 1093.6133); // 1 kilometre = 1093.6133 Yarda
        kilometerConversions.put("mi", 0.621371192); // 1 kilometre = 0.621371192 Mil
        kilometerConversions.put("NM", 0.5399568); // 1 kilometre = 0.5399568 Deniz mili


        // İnç için dönüşüm oranları
        Map<String, Double> inchConversions = new HashMap<>();
        inchConversions.put("mm", 25.4); // 1 inç = 25.4 milimetre
        inchConversions.put("cm", 2.54); // 1 inç = 2.54 santimetre
        inchConversions.put("m", 0.0254); // 1 inç = 0.0254 metre
        inchConversions.put("km", 0.0000254); // 1 inç = 0.0000254 kilometre
        inchConversions.put("in", 1.0); // 1 inç = 1.0 İnç
        inchConversions.put("ft", 0.0833333); // 1 inç = 0.0833333 Feet
        inchConversions.put("yd", 0.0277778); // 1 inç = 0.0277778 Yarda
        inchConversions.put("mi", 0.0000157828); // 1 inç = 0.0000157828 Mil
        inchConversions.put("NM", 0.0000134514); // 1 inç = 0.0000134514 Deniz mili


        // Feet için dönüşüm oranları
        Map<String, Double> feetConversions = new HashMap<>();
        feetConversions.put("mm", 304.8); // 1 feet = 304.8 milimetre
        feetConversions.put("cm", 30.48); // 1 feet = 30.48 santimetre
        feetConversions.put("m", 0.3048); // 1 feet = 0.3048 metre
        feetConversions.put("km", 0.0003048); // 1 feet = 0.0003048 kilometre
        feetConversions.put("in", 12.0); // 1 feet = 12.0 İnç
        feetConversions.put("ft", 1.0); // 1 feet = 1.0 Feet
        feetConversions.put("yd", 0.333333); // 1 feet = 0.333333 Yarda
        feetConversions.put("mi", 0.000189394); // 1 feet = 0.000189394 Mil
        feetConversions.put("NM", 0.000164578); // 1 feet = 0.000164578 Deniz mili


        // Yarda için dönüşüm oranları
        Map<String, Double> yardConversions = new HashMap<>();
        yardConversions.put("mm", 914.4); // 1 yarda = 914.4 milimetre
        yardConversions.put("cm", 91.44); // 1 yarda = 91.44 santimetre
        yardConversions.put("m", 0.9144); // 1 yarda = 0.9144 metre
        yardConversions.put("km", 0.0009144); // 1 yarda = 0.0009144 kilometre
        yardConversions.put("in", 36.0); // 1 yarda = 36.0 İnç
        yardConversions.put("ft", 3.0); // 1 yarda = 3.0 Feet
        yardConversions.put("yd", 1.0); // 1 yarda = 1.0 Yarda
        yardConversions.put("mi", 0.000568182); // 1 yarda = 0.000568182 Mil
        yardConversions.put("NM", 0.000493737); // 1 yarda = 0.000493737 Deniz mili


        // Mil için dönüşüm oranları
        Map<String, Double> mileConversions = new HashMap<>();
        mileConversions.put("mm", 1609344.0); // 1 mil = 1609344 milimetre
        mileConversions.put("cm", 160934.4); // 1 mil = 160934.4 santimetre
        mileConversions.put("m", 1609.344); // 1 mil = 1609.344 metre
        mileConversions.put("km", 1.609344); // 1 mil = 1.609344 kilometre
        mileConversions.put("in", 63360.0); // 1 mil = 63360 İnç
        mileConversions.put("ft", 5280.0); // 1 mil = 5280 Feet
        mileConversions.put("yd", 1760.0); // 1 mil = 1760 Yarda
        mileConversions.put("mi", 1.0); // 1 mil = 1.0 Mil
        mileConversions.put("NM", 0.868976); // 1 mil = 0.868976 Deniz mili


        // Deniz mili için dönüşüm oranları
        Map<String, Double> nauticalMileConversions = new HashMap<>();
        nauticalMileConversions.put("mm", 1852000.0); // 1 deniz mili = 1852000 milimetre
        nauticalMileConversions.put("cm", 185200.0); // 1 deniz mili = 185200 santimetre
        nauticalMileConversions.put("m", 1852.0); // 1 deniz mili = 1852 metre
        nauticalMileConversions.put("km", 1.852); // 1 deniz mili = 1.852 kilometre
        nauticalMileConversions.put("in", 72913.3858); // 1 deniz mili = 72913.3858 İnç
        nauticalMileConversions.put("ft", 6076.11549); // 1 deniz mili = 6076.11549 Feet
        nauticalMileConversions.put("yd", 2025.371); // 1 deniz mili = 2025.371 Yarda
        nauticalMileConversions.put("mi", 1.150779); // 1 deniz mili = 1.150779 Mil
        nauticalMileConversions.put("NM", 1.0); // 1 deniz mili = 1.0 Deniz mili




        // Milimetreyi haritaya ekle
        conversionRates.put("mm", millimeterConversions);
        conversionRates.put("cm", centimeterConversions);
        conversionRates.put("m", meterConversions);
        conversionRates.put("km", kilometerConversions);
        conversionRates.put("in", inchConversions);
        conversionRates.put("ft", feetConversions);
        conversionRates.put("yd", yardConversions);
        conversionRates.put("mi", mileConversions);
        conversionRates.put("NM", nauticalMileConversions);
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
