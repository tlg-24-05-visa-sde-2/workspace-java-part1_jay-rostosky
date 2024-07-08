package edu.tests;

class PrimitivesTest {

    public static void main(String[] args) {
        int age = 57;
        System.out.println("age is: " + age);

        long population = 8_000_000_000L;
        System.out.println("population is: " + population);

        double price = 799.99;
        System.out.println("price is: " + price);

        boolean isCloudy = true;
        System.out.println("isCloudy: " + isCloudy);

        char size = 'S';
        System.out.println("size is: " + size);

        String grade = "A";
        System.out.println("my grade on the test was: " + grade);

        String quote = "What's up, \"Doc\"?";
        System.out.println("Bugs Bunny says: " + quote);

        String poem = "roses are red\nviolets are blue";
        System.out.println(poem);
        System.out.println();

        int n = 18;
        int m = n;

        n = 19;
        System.out.println("n is: " + n);  // should say 19
        System.out.println("m is: " + m);  // still 18
        System.out.println();

        int kids = 2;
        System.out.println("number of kids: " + ++kids);
    }
}