package edu.tests;

import java.util.Arrays;

class ArraysTest {

    public static void main(String[] args) {
        int[] ages = new int[4];
        ages[0] = 57;
        ages[1] = 51;
        ages[2] = 10;
        ages[3] = 10;
        System.out.println(Arrays.toString(ages));  // nicely formatted, human way of seeing it
        System.out.println();

        double[] temps = { 82.3, 97.2, 130.2, 95.0, 86.0 };
        System.out.println(Arrays.toString(temps));

        for (double temp : temps) {
            System.out.printf("The temperature is: %s\n", temp);
        }
        System.out.println();

        String[] cities = { "Seattle", "Austin", "Atlanta", "DC" };  // slots 0 thru 3
        System.out.println("There are " + cities.length + " cities in the array");
        System.out.println(Arrays.toString(cities));

        for (String city : cities) {
            System.out.println("I live in " + city);
        }
        System.out.println();

        for (int i = 0; i < cities.length; i++) {
            System.out.println("I live in " + cities[i]);
        }
    }
}