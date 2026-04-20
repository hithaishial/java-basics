package com.thinkworks.methods.external;

public class BioChip {
    private String chipId;
    private double temperature;
    private double glucoseLevel;
    private double oxygenLevel;
    private String status;

    public BioChip(String chipId, double temperature, double glucoseLevel, double oxygenLevel, String status) {
        this.chipId = chipId;
        this.temperature = temperature;
        this.glucoseLevel = glucoseLevel;
        this.oxygenLevel = oxygenLevel;
        this.status = status;
    }

    public void scanVitals() {
        System.out.println("Vitals - Temp: " + temperature + "°C, Glucose: " + glucoseLevel + " mg/dL, Oxygen: " + oxygenLevel + "%");
    }

    public void calibrate() {
        System.out.println("BioChip " + chipId + " calibrated successfully.");
    }

    public void transmitData() {
        System.out.println("Transmitting data for BioChip " + chipId + "...");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BioChip) {
            BioChip other = (BioChip) obj;
            if (this.chipId.equals(other.chipId)) {
                if (this.status.equals(other.status)) {
                    return true;
                }
            }
        } else return false;
        return false;
    }

    @Override
    public String toString() {
        return "BioChip [ID=" + chipId + ", Temp=" + temperature + ", Glucose=" + glucoseLevel +
                ", Oxygen=" + oxygenLevel + ", Status=" + status + "]";
    }
}
