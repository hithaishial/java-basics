public class MainRunner {
    public static void main(String[] args) {

        Museum museum = new Museum();
        museum.setMuseumName("National Art Gallery");
        museum.setLocation("Delhi");
        museum.setEstablishedYear(1950);
        museum.setCollectionSize(5000);
        museum.setFamousExhibit("Ancient Sculpture");
        museum.setVisitorCapacity(2000);
        museum.setTicketPrice(150.0);

        
        SportsTeam team = new SportsTeam();
        team.setTeamName("Warriors");
        team.setSportType("Basketball");
        team.setCoachName("John Smith");
        team.setHomeGround("City Arena");
        team.setFoundedYear(1990);
        team.setNumberOfPlayers(12);
        team.setCaptainName("Alex Johnson");
        team.setTeamRanking(3);
        team.setSponsorName("Nike");

        Hospital hospital = new Hospital();
        hospital.setHospitalName("CityCare Hospital");
        hospital.setLocation("Bengaluru");
        hospital.setEstablishedYear(1985);
        hospital.setNumberOfBeds(500);
        hospital.setSpecialization("Cardiology");
        hospital.setChiefDoctor("Dr. Mehta");
        hospital.setEmergencyContact("1800-123-456");
        hospital.setRating(4.5);
        hospital.setOwnershipType("Private");

        Festival festival = new Festival();
        festival.setFestivalName("Spring Fest");
        festival.setLocation("Goa");
        festival.setStartDate("2026-03-20");
        festival.setEndDate("2026-03-25");
        festival.setMainEvent("Music Carnival");
        festival.setOrganizerName("EventCorp");
        festival.setTicketPrice(500.0);
        festival.setExpectedAudience(10000);
        festival.setTheme("Colors of Culture");

        
        Concert concert = new Concert();
        concert.setConcertName("Rock Night");
        concert.setArtistName("The SoundWaves");
        concert.setVenue("Stadium Arena");
        concert.setDate("2026-04-10");
        concert.setTicketPrice(1200.0);
        concert.setDuration("3 hours");
        concert.setGenre("Rock");
        concert.setOrganizerName("LiveNation");
        concert.setAudienceCapacity(15000);

     
    }
}