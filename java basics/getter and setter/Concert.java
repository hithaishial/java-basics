public class Concert {

    private String concertName;
    private String artistName;
    private String venue;
    private String date;
    private double ticketPrice;
    private String duration;
    private String genre;
    private String organizerName;
    private int audienceCapacity;

    public void setConcertName(String concertName) {
        this.concertName = concertName;
    }
    public String getConcertName() {
        return concertName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
    public String getArtistName() {
        return artistName;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
    public String getVenue() {
        return venue;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return date;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getDuration() {
        return duration;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }
    public String getOrganizerName() {
        return organizerName;
    }

    public void setAudienceCapacity(int audienceCapacity) {
        this.audienceCapacity = audienceCapacity;
    }
    public int getAudienceCapacity() {
        return audienceCapacity;
    }
}