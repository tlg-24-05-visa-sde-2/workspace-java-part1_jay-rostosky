/*
 * Client-side main-class focused only on testing setSnoozeInterval().

 * We will do BVT (Boundary Value Testing):
 *  Any BUGs will be sniffed out on the edges of the valid range.
 *  We test 0,1  and  20,21
 *  We test on each boundary, and just outside it.
 */
class AlarmClockValidationTest {

    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1);     // value should "stick", no error message
        System.out.println(clock);
        System.out.println();

        clock.setSnoozeInterval(20);    // value should "stick", no error message
        System.out.println(clock);
        System.out.println();

        clock.setSnoozeInterval(0);     // error message, value rejected (so it's still 20)
        System.out.println(clock);
        System.out.println();

        clock.setSnoozeInterval(21);    // error message, value rejected (so it's STILL 20)
        System.out.println(clock);
    }
}