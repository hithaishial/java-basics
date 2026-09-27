class Movie {
    String movieId;
    String title;
    String director;
    String genre;
    String language;
    String producer;
    int releaseYear;
    int durationMinutes;
    double rating;
    boolean isReleased;

    static int count = 0;

    Movie(String movieId, String title, String director, String genre, String language, String producer, int releaseYear, int durationMinutes, double rating, boolean isReleased) {
        this(title, director, genre, language, producer, releaseYear, durationMinutes, rating, isReleased);
        this.movieId = movieId;
        System.out.println("Movie ID: " + movieId);
    }

    Movie(String title, String director, String genre, String language, String producer, int releaseYear, int durationMinutes, double rating, boolean isReleased) {
        this(director, genre, language, producer, releaseYear, durationMinutes, rating, isReleased);
        this.title = title;
        System.out.println("Title: " + title);
    }

    Movie(String director, String genre, String language, String producer, int releaseYear, int durationMinutes, double rating, boolean isReleased) {
        this(genre, language, producer, releaseYear, durationMinutes, rating, isReleased);
        this.director = director;
        System.out.println("Director: " + director);
    }

    Movie(String genre, String language, String producer, int releaseYear, int durationMinutes, double rating, boolean isReleased) {
        this(language, producer, releaseYear, durationMinutes, rating, isReleased);
        this.genre = genre;
        System.out.println("Genre: " + genre);
    }

    Movie(String language, String producer, int releaseYear, int durationMinutes, double rating, boolean isReleased) {
        this(producer, releaseYear, durationMinutes, rating, isReleased);
        this.language = language;
        System.out.println("Language: " + language);
    }

    Movie(String producer, int releaseYear, int durationMinutes, double rating, boolean isReleased) {
        this(releaseYear, durationMinutes, rating, isReleased);
        this.producer = producer;
        System.out.println("Producer: " + producer);
    }

    Movie(int releaseYear, int durationMinutes, double rating, boolean isReleased) {
        this(durationMinutes, rating, isReleased);
        this.releaseYear = releaseYear;
        System.out.println("Release Year: " + releaseYear);
    }

    Movie(int durationMinutes, double rating, boolean isReleased) {
        this(rating, isReleased);
        this.durationMinutes = durationMinutes;
        System.out.println("Duration: " + durationMinutes + " minutes");
    }

    Movie(double rating, boolean isReleased) {
        this(isReleased);
        this.rating = rating;
        System.out.println("Rating: " + rating);
    }

    Movie(boolean isReleased) {
        this();
        this.isReleased = isReleased;
        System.out.println("Is Released: " + isReleased);
    }

    Movie() {
        System.out.println("constructor: Movie");
        count++;
    }

    void display() {
        System.out.println("Movie ID: " + movieId);
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Genre: " + genre);
        System.out.println("Language: " + language);
        System.out.println("Producer: " + producer);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Duration: " + durationMinutes + " minutes");
        System.out.println("Rating: " + rating);
        System.out.println("Is Released: " + isReleased);
        System.out.println("Total Movies created: " + count);
    }
}