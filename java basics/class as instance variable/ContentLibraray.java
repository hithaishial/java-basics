class ContentLibrary {
    String libraryName;
    int totalTitles;
    Movie movie;

    ContentLibrary(String libraryName, int totalTitles, Movie movie) {
        this.libraryName = libraryName;
        this.totalTitles = totalTitles;
        this.movie = movie;
    }

    void display() {
        System.out.println("Library: " + libraryName + " | Titles: " + totalTitles);
        if (movie != null) {
            movie.display();
        } else {
            System.out.println("please check the value");
        }
    }
}