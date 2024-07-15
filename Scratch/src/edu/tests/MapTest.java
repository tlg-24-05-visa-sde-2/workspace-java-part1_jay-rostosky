package edu.tests;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class MapTest {

    public static void main(String[] args) {
        Map<String,Double> gpaMap = new HashMap<>();    // K: String, V: Double

        gpaMap.put("kea",    4.0);
        gpaMap.put("jasmin", 3.6);
        gpaMap.put("kelvin", 1.7);
        gpaMap.put("deshon", 2.5);
        gpaMap.put("sherie", 3.84);
        gpaMap.put("tyler",  1.9);

        Double jasminGpa = gpaMap.get("jasmin");
        System.out.println("Jasmin's GPA was: " + jasminGpa);
        System.out.println();

        dump(gpaMap);
        System.out.println();

        // print all gpas that are 3.5 or greater
        Collection<Double> gpas = gpaMap.values();  // returns Collection<V>, i.e., Collection<Double>
        for (Double gpa : gpas) {
            if (gpa >= 3.5) {
                System.out.println(gpa);
            }
        }
        System.out.println();

        // print all names of those with a gpa of 2.5 or greater
        for (var entry : gpaMap.entrySet()) {
            if (entry.getValue() >= 2.5) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println();
    }

    private static void dump(Map<String,Double> gpaMap) {
        for (Map.Entry<String,Double> entry : gpaMap.entrySet()) {  // collection of the "rows"
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
    }
}