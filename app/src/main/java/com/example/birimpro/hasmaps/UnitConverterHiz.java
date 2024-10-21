package com.example.birimpro.hasmaps;

import java.util.HashMap;
import java.util.Map;

public class UnitConverterHiz {

    // Her birim için sabit dönüşüm oranları
    private static Map<String, Map<String, Double>> conversionRates = new HashMap<>();

    // Dönüşüm oranlarını tanımlama
    static {
        // Metre/saniye (m/s) için dönüşüm oranları
        Map<String, Double> metresaniyeConversions = new HashMap<>();
        metresaniyeConversions.put("m/s", 1.0);
        metresaniyeConversions.put("m/h", 3600.0);
        metresaniyeConversions.put("km/s", 0.001);
        metresaniyeConversions.put("km/h", 3.6);
        metresaniyeConversions.put("in/s", 39.3701);
        metresaniyeConversions.put("in/h", 141732.283);
        metresaniyeConversions.put("ft/s", 3.28084);
        metresaniyeConversions.put("ft/h", 11811.0236);
        metresaniyeConversions.put("mi/s", 0.000621371);
        metresaniyeConversions.put("mi/h", 2.23694);
        metresaniyeConversions.put("kn", 1.94384); // knot (deniz mili/saat)
        metresaniyeConversions.put("c", 0.00000000333564); // Işık hızı

        conversionRates.put("m/s", metresaniyeConversions);

        // Metre/saat (m/h) için dönüşüm oranları
        Map<String, Double> metresaatConversions = new HashMap<>();
        metresaatConversions.put("m/s", 0.000277778);
        metresaatConversions.put("m/h", 1.0);
        metresaatConversions.put("km/s", 2.77778e-7);
        metresaatConversions.put("km/h", 0.001);
        metresaatConversions.put("in/s", 0.0109361);
        metresaatConversions.put("in/h", 39.3701);
        metresaatConversions.put("ft/s", 0.000911344);
        metresaatConversions.put("ft/h", 3.28084);
        metresaatConversions.put("mi/s", 1.72603e-7);
        metresaatConversions.put("mi/h", 0.000621371);
        metresaatConversions.put("kn", 0.000539957);
        metresaatConversions.put("c", 9.26567e-13); // Işık hızı

        conversionRates.put("m/h", metresaatConversions);

        // Kilometre/saniye (km/s) için dönüşüm oranları
        Map<String, Double> kmsaniyeConversions = new HashMap<>();
        kmsaniyeConversions.put("m/s", 1000.0);
        kmsaniyeConversions.put("m/h", 3600000.0);
        kmsaniyeConversions.put("km/s", 1.0);
        kmsaniyeConversions.put("km/h", 3600.0);
        kmsaniyeConversions.put("in/s", 39370.1);
        kmsaniyeConversions.put("in/h", 141732283.0);
        kmsaniyeConversions.put("ft/s", 3280.84);
        kmsaniyeConversions.put("ft/h", 11811023.6);
        kmsaniyeConversions.put("mi/s", 0.621371);
        kmsaniyeConversions.put("mi/h", 2236.94);
        kmsaniyeConversions.put("kn", 1943.84);
        kmsaniyeConversions.put("c", 0.00333564); // Işık hızı

        conversionRates.put("km/s", kmsaniyeConversions);

        // Kilometre/saat (km/h) için dönüşüm oranları
        Map<String, Double> kmsaatConversions = new HashMap<>();
        kmsaatConversions.put("m/s", 0.277778);
        kmsaatConversions.put("m/h", 1000.0);
        kmsaatConversions.put("km/s", 0.000277778);
        kmsaatConversions.put("km/h", 1.0);
        kmsaatConversions.put("in/s", 10.9361);
        kmsaatConversions.put("in/h", 39370.1);
        kmsaatConversions.put("ft/s", 0.911344);
        kmsaatConversions.put("ft/h", 3280.84);
        kmsaatConversions.put("mi/s", 0.000172603);
        kmsaatConversions.put("mi/h", 0.621371);
        kmsaatConversions.put("kn", 0.539957);
        kmsaatConversions.put("c", 9.26567e-10); // Işık hızı

        conversionRates.put("km/h", kmsaatConversions);

        // Knot (deniz mili/saat) için dönüşüm oranları
        Map<String, Double> knotConversions = new HashMap<>();
        knotConversions.put("m/s", 0.514444);
        knotConversions.put("m/h", 1852.0);
        knotConversions.put("km/s", 0.000514444);
        knotConversions.put("km/h", 1.852);
        knotConversions.put("in/s", 20.2537);
        knotConversions.put("in/h", 72913.4);
        knotConversions.put("ft/s", 1.68781);
        knotConversions.put("ft/h", 6076.12);
        knotConversions.put("mi/s", 0.000319661);
        knotConversions.put("mi/h", 1.15078);
        knotConversions.put("kn", 1.0);
        knotConversions.put("c", 0.000000000514444); // Işık hızı

        conversionRates.put("kn", knotConversions);

        // Mil/saniye (mi/s) için dönüşüm oranları
        Map<String, Double> misaniyeConversions = new HashMap<>();
        misaniyeConversions.put("m/s", 1609.34);
        misaniyeConversions.put("m/h", 5793360.0);
        misaniyeConversions.put("km/s", 1.60934);
        misaniyeConversions.put("km/h", 5793.36);
        misaniyeConversions.put("in/s", 63360.0);
        misaniyeConversions.put("in/h", 228960000.0);
        misaniyeConversions.put("ft/s", 5280.0);
        misaniyeConversions.put("ft/h", 19008000.0);
        misaniyeConversions.put("mi/s", 1.0);
        misaniyeConversions.put("mi/h", 3600.0);
        misaniyeConversions.put("kn", 3128.31);
        misaniyeConversions.put("c", 0.00536819); // Işık hızı

        conversionRates.put("mi/s", misaniyeConversions);

        // Mil/saat (mi/h) için dönüşüm oranları
        Map<String, Double> misaatConversions = new HashMap<>();
        misaatConversions.put("m/s", 0.44704);
        misaatConversions.put("m/h", 1609.34);
        misaatConversions.put("km/s", 0.00044704);
        misaatConversions.put("km/h", 1.60934);
        misaatConversions.put("in/s", 17.6);
        misaatConversions.put("in/h", 63360.0);
        misaatConversions.put("ft/s", 1.46667);
        misaatConversions.put("ft/h", 5280.0);
        misaatConversions.put("mi/s", 0.000277778);
        misaatConversions.put("mi/h", 1.0);
        misaatConversions.put("kn", 0.868976);
        misaatConversions.put("c", 1.49116e-9); // Işık hızı

        conversionRates.put("mi/h", misaatConversions);

        // Işık hızı (c) için dönüşüm oranları
        Map<String, Double> lightSpeedConversions = new HashMap<>();
        lightSpeedConversions.put("m/s", 299792458.0);
        lightSpeedConversions.put("m/h", 1.07925e+12);
        lightSpeedConversions.put("km/s", 299792.458);
        lightSpeedConversions.put("km/h", 1.07925e+9);
        lightSpeedConversions.put("in/s", 1.1811e+10);
        lightSpeedConversions.put("in/h", 4.252e+13);
        lightSpeedConversions.put("ft/s", 983571056.0);
        lightSpeedConversions.put("ft/h", 3.544e+12);
        lightSpeedConversions.put("mi/s", 186282.397);
        lightSpeedConversions.put("mi/h", 670616629.0);
        lightSpeedConversions.put("kn", 582749918.0);
        lightSpeedConversions.put("c", 1.0); // Kendisi ile aynı

        conversionRates.put("c", lightSpeedConversions);
    }

    // Dönüşüm yapma metodu
    public static double convert(String fromUnit, String toUnit, double value) {
        if (conversionRates.containsKey(fromUnit)) {
            Map<String, Double> toConversions = conversionRates.get(fromUnit);
            if (toConversions != null && toConversions.containsKey(toUnit)) {
                return value * toConversions.get(toUnit);
            }
        }
        throw new IllegalArgumentException("Geçersiz birim: " + fromUnit + " -> " + toUnit);
    }
}
