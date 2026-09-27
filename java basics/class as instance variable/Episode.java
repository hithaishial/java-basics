class Episode {
    String episodeTitle;
    int duration;
    

    Episode(String episodeTitle, int duration) {
        this.episodeTitle = episodeTitle;
        this.duration = duration;
        
    }

    void display() {
        System.out.println("Episode: " + episodeTitle + ",   Duration: " + duration + " mins");
       
    }
}