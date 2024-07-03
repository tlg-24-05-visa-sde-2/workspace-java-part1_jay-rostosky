class WrappersTest {

    public static void main(String[] args) {
        String ageInput = "57";
        int age = Integer.parseInt(ageInput);            // returns int 57 from string "57"
        Integer ageInteger = Integer.valueOf(ageInput);  // returns Integer(57) from "57"

        String populationInput = "8000000000";
        long population = Long.parseLong(populationInput);
        Long populationLong = Long.valueOf(populationInput);

        String priceInput = "12.49";
        double price = Double.parseDouble(priceInput);
        Double priceDouble = Double.valueOf(priceInput);

        String isSunnyInput = "true";
        boolean isSunny = Boolean.parseBoolean(isSunnyInput);
        Boolean isSunnyBoolean = Boolean.valueOf(isSunnyInput);
    }
}