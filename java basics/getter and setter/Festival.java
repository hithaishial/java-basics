public class Festival {

    private String festivalName;
    private String location;
    private String startDate;
    private String endDate;
    private String mainEvent;
    private String organizerName;
    private double ticketPrice;
    private int expectedAudience;
    private String theme;

    public void setFestivalName(String festivalName) {
        this.festivalName = festivalName;
    }
    public String getFestivalName() {
        return festivalName;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getStartDate() {
        return startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public String getEndDate() {
        return endDate;
    }

    public void setMainEvent(String mainEvent) {
        this.mainEvent = mainEvent;
    }
    public String getMainEvent() {
        return mainEvent;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }
    public String getOrganizerName() {
        return organizerName;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setExpectedAudience(int expectedAudience) {
        this.expectedAudience = expectedAudience;
    }
    public int getExpectedAudience() {
        return expectedAudience;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
    public String getTheme() {
        return theme;
    }
}