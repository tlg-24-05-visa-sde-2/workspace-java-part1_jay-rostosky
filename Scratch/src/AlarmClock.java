/*
 * Application class to model the workings of an AlarmClock.
 * This class will NOT have a main() method, most such classes do not.
 */
class AlarmClock {
    // class ("static") fields - ONE copy, shared among all instances
    // these live up in the "shared zone," up "above" all the instances
    public static final int MIN_INTERVAL = 1;   // class constant (ALL_CAPS)
    public static final int MAX_INTERVAL = 20;

    // everything below here is present in EACH instance of AlarmClock

    // properties or attributes - these are called "instance variables" or "fields" in Java
    private int snoozeInterval = 5;  // default value when client doesn't specify one (instead of 0)

    // constructors
    public AlarmClock() {
        // no-op
    }

    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval);  // delegate to setter for validation/conversion (if any)
    }

    // functions or operations - these are called "methods" in Java
    public void snooze() {
        System.out.println("Snoozing for " + getSnoozeInterval() + " minutes");
    }

    // accessor methods - provide "controlled access" to the object's fields
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    // business data constraint - must be between 1 and 20 (inclusive)
    // if incoming value is "valid," we take it, i.e., assign to the private field
    // otherwise, we reject it with an error message
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {  // valid input
            this.snoozeInterval = snoozeInterval;           // assign to private field
        }
        else {                                              // invalid
            System.out.println("Invalid snooze interval: " + snoozeInterval + ". " +
                    "Must be between " + MIN_INTERVAL + " and " + MAX_INTERVAL + " (inclusive).");
        }
    }

    /*
     * Purpose: return a string (sentence) describing this object.
     */
    public String toString() {
        return "AlarmClock: snoozeInterval=" + getSnoozeInterval();
    }
}