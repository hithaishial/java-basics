class Movie {
    String movieTitle;
    String genre;
    Series series;

    Movie(String movieTitle, String genre, Series series) {
        this.movieTitle = movieTitle;
        this.genre = genre;
        this.series = series;
    }

    void display() {
        System.out.println("Movie: " + movieTitle + ",  Genre: " + genre);
        if (series != null) series.display();
		else System.out.println("please check the value");
    }
}