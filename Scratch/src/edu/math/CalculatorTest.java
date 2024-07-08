package edu.math;

class CalculatorTest {

    public static void main(String[] args) {
        boolean isCorrect = true;

        // call randomInt() 100_000_000 times and check the result each time
        // if it is < 5 or > 16, we know it's not right, so break the loop and show the result
        int min = 5;
        int max = 16;

        for (int i = 0; i < 100_000_000; i++) {
            int random = Calculator.randomInt(min, max);  // min: 5, max: 16

            if (random < min || random > max) {           // Houston, we have a problem...
                isCorrect = false;
                break;
            }
        }

        // ternary expression: assign one thing or another to a variable, depending on condition
        String msg = (isCorrect) ? "IT WORKS!" : "IT's BROKE!";
        System.out.println(msg);

        /*
        if (isCorrect) {
            System.out.println("IT WORKS!");
        }
        else {
            System.out.println("IT's BROKE!");
        }
        */
    }
}