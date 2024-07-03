/*
 * Application or system class to model the workings of a television.
 * It has properties/attributes, it has business methods, but NO main() method.
 */
class Television {
    // class-level ("static") variables - these live in the "shared area," up "above" the instances
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    private static int instanceCount = 0;

    // this method is also "up there" in the "shared zone," it does not execute inside a Television object
    public static int getInstanceCount() {
        return instanceCount;
    }

    // ----------------------------------------

    // properties or attributes - "fields" or "instance variables"
    private String brand;
    private int volume;
    private DisplayType display = DisplayType.LED;

    private boolean isMuted;  // for muting behavior
    private int oldVolume;    // for muting behavior

    // constructors - these get called when the client says "new"
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();             // delegate to no-arg ctor above for the increment
        setBrand(brand);    // delegate to setter for any validation/conversion it might be doing
    }

    public Television(String brand, int volume) {
        this(brand);        // delegate to neighboring ctor above me for 'brand'
        setVolume(volume);  // handle 'volume' myself, by delegating to its setter
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    // functions or operations - "methods"
    // business or "action" methods
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + " television to volume " + getVolume());
    }

    public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }

    public void mute() {
        if (!isMuted()) {  // not currently muted
            oldVolume = getVolume();
            volume = 0;
            isMuted = true;
        }
        else {             // currently muted
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    // accessor methods - these provided "controlled access" to the object's fields
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        switch (brand) {
            case "Samsung":
            case "LG":
            case "Sony":
            case "Toshiba":
                this.brand = brand;
                break;
            default:
                System.out.println("Invalid brand: " + brand + "." +
                        " Valid brands are: Samsung, LG, Sony, Toshiba.");
        }

        /*
        if (brand.equals("Samsung") ||
            brand.equals("LG")      ||
            brand.equals("Sony")    ||
            brand.equals("Toshiba")) {
            this.brand = brand;
        }
        else {
            System.out.println("Invalid brand: " + brand + "." +
                    " Valid brands are: Samsung, LG, Sony, Toshiba.");
        }
        */
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (MIN_VOLUME <= volume && volume <= MAX_VOLUME) {
            this.volume = volume;
            isMuted = false;  // clear the 'isMuted' flag, in case we were muted
        }
        else {
            System.out.printf("Invalid volume: %s. Valid range is %s to %s (inclusive).\n",
                    volume, MIN_VOLUME, MAX_VOLUME);

//            System.out.println("Invalid volume: " + volume + ". " +
//                    "Valid range is " + MIN_VOLUME + " to " + MAX_VOLUME + " (inclusive).");
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public boolean isMuted() {
        return isMuted;
    }

    private boolean verifyInternetConnection() {
        return true;  // fake implementation
    }

    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());

        return String.format("Television: brand=%s, volume=%s, display=%s",
                getBrand(), volumeString, getDisplay());

//        return "Television: brand=" + getBrand() + ", volume=" + volumeString +
//                ", display=" + getDisplay();
    }
}