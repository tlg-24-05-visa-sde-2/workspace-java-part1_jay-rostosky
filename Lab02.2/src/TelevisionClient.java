/*
 * Application main-class.
 * In the main() method, we will create a few Television objects and give them a basic test-drive.
 */
class TelevisionClient {

    public static void main(String[] args) {

        System.out.println(Television.getInstanceCount() + " instances have been created");
        System.out.println();

        // create an instance of Television and set its properties
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(32);
        tv1.setDisplay(DisplayType.PLASMA);

        // create a second instance of Television using its brand-volume-display ctor
        Television tv2 = new Television("Sony", 50, DisplayType.OLED);

        // create a 3rd Television object, and give it the maximum volume
        Television tv3 = new Television("LG", Television.MAX_VOLUME);  // CRANK IT UP !!!

        // turn them all on
        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();
        System.out.println();

        // turn them all off
        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();
        System.out.println();

        // show their toString() methods in action
        System.out.println(tv1.toString());
        System.out.println(tv2);  // toString() automatically called
        System.out.println(tv3);
        System.out.println();

        System.out.println(Television.getInstanceCount() + " instances have been created");
    }
}