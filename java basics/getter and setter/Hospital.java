public class Hospital {

    private String hospitalName;
    private String location;
    private int establishedYear;
    private int numberOfBeds;
    private String specialization;
    private String chiefDoctor;
    private String emergencyContact;
    private double rating;
    private String ownershipType;

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    public String getHospitalName() {
        return hospitalName;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }
    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public String getSpecialization() {
        return specialization;
    }

    public void setChiefDoctor(String chiefDoctor) {
        this.chiefDoctor = chiefDoctor;
    }
    public String getChiefDoctor() {
        return chiefDoctor;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }
    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    public double getRating() {
        return rating;
    }

    public void setOwnershipType(String ownershipType) {
        this.ownershipType = ownershipType;
    }
    public String getOwnershipType() {
        return ownershipType;
    }
}