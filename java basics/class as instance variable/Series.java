class Series {
    String seriesTitle;
    int seasons;
    Episode episode;

    Series(String seriesTitle, int seasons, Episode episode) {
        this.seriesTitle = seriesTitle;
        this.seasons = seasons;
        this.episode = episode;
    }

    void display() {
        System.out.println("Series: " + seriesTitle + ",  Seasons: " + seasons);
        if (episode != null) episode.display();
		else System.out.println("please check the value");
    }
}