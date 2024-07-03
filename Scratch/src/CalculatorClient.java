class CalculatorClient {

    public static void main(String[] args) {
        double sum = Calculator.add(1, 3);  // passing ints where doubles are expected (implicit upcast)
        System.out.println("sum is: " + sum);

        System.out.println("difference is: " + Calculator.subtract(1.1, 3.1));  // here we pass doubles

        System.out.println("10 is even? " + Calculator.isEven(10));

        System.out.println();

        System.out.println("winner is: " + Calculator.randomInt(5, 16));  // "min-max" version
    }
}