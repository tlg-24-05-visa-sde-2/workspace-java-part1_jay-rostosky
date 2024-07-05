class Movie {
    // fields or instance variables
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;

    // constructors - these get called when the client says "new"
    public Movie(String title) {
        setTitle(title);
    }

    public Movie(String title, Genre genre) {
        this(title);
        setGenre(genre);
    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
        this(title, genre);           // delegate to 2-arg ctor above me for title, genre
        setReleaseYear(releaseYear);  // handle the rest of them myself,
        setRevenue(revenue);          // by delegating to their respective setters
        setRating(rating);
    }

    // business or "action" methods
    // play(), pause(), rewind(), fastForward(), stop(), goTo()

    // accessor methods - provide "controlled" access to the object's (private) fields
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {
        // if revenue is null, use %s, otherwise use %,.2f
        String revenueFormat = (getRevenue() == null) ? "%s" : "$%,.2f";

        return String.format("Movie: title=%s, releaseYear=%s, revenue=" + revenueFormat + ", rating=%s, genre=%s",
                getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());

//        return "Movie: title=" + getTitle() + ", releaseYear=" + getReleaseYear() +
//                ", revenue=" + getRevenue() + ", rating=" + getRating() + ", genre=" + getGenre();
    }
}