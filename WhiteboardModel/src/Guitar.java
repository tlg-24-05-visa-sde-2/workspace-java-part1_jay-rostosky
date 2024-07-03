/*
 * Business class for WhiteboardModel code review assignment.
 */
class Guitar {
    // properties or attributes, we call them "instance variables" or "fields"
    private String brand;
    private String type;      // constraint: ["acoustic", "electric", "classical"]
    private int strings = 6;  // constraint: 6, 12 (default 6)

    // constructors - these get called when the client says "new"
    public Guitar() {
    }

    public Guitar(String brand) {
        setBrand(brand);
    }

    public Guitar(String brand, String type) {
        this(brand);    // delegate to ctor above me for brand
        setType(type);  // handle type myself, be delegating to its setter
    }

    public Guitar(String brand, String type, int strings) {
        this(brand, type);
        setStrings(strings);
    }

    // business or "action" methods
    public void changeStrings() {
        System.out.println("Changing all " + getStrings() + " strings");
    }

    public void tune() {
        System.out.println("Tuning your " + getBrand() + " " + getStrings() + "-string " + getType() + " guitar");
    }

    public void play(String song) {
        System.out.println("Playing '" + song + "'");
    }

    // accessor (get/set) methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        if (strings == 6 || strings == 12) {
            this.strings = strings;
        }
        else {
            System.out.println("Invalid number of strings: " + strings + ". Must be 6 or 12.");
        }
    }

    public String toString() {
        return "Guitar: brand=" + getBrand() + ", type=" + getType() + ", strings=" + getStrings();
    }
}