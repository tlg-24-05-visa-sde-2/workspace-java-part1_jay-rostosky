package edu.math;

/*
 * This is an "all-static" class, i.e., it has nothing but static methods.
 */
class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    /*
     * Returns the average of the supplied integers.
     */
    // if client supplies these values: 3, 4, 9, 2, 3
    // in here, it's this: // first: 3  rest: 4, 9, 2, 3
    public static double average(int first, int... rest) {
        // inside here, 'rest' is automatically an array of int[]
        int sum = first;

        for (int value : rest) {
            sum = sum + value;   // sum += value
        }
        return (double) sum / (rest.length + 1);
    }

    /*
     * Returns a random integer between 'min' and 'max' (inclusive).
     */
    public static int randomInt(int min, int max) {  // min: 5, max: 16
        int result = 0;

        double rand = Math.random();                      // 0.0000   to   0.9999
        double scaled = (rand * (max - min + 1));         // 0.0000   to  11.9999
        double lifted = scaled + min;                     // 5.0000   to  16.9999
        result = (int) lifted;

        return result;
    }

    /*
     * Returns a random integer between 1 and 'max' (inclusive).
     */
    public static int randomInt(int max) {
        return randomInt(1, max);  // delegate to "min-max" version, passing 1 and 'max'
    }

    /*
     * Returns a random integer between 1 and 11 (inclusive).
     *
     * HINT: see a class called Math (in package java.lang), look for a helpful method here.
     * NOTE: these methods are all "static," which means you call them as follows:
     *   Math.methodName()
     */
    public static int randomInt() {
        return randomInt(1, 11);  // delegate to "min-max" version, passing 1 for min, 11 for max
    }
}