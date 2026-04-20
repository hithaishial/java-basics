package com.thinkworks.methods.external;


import java.time.LocalDateTime;

public class PulseSensor {
    private String sensorId;
    private int bpm;
    private String status;
    private LocalDateTime lastSync;
    private int battery;

    public PulseSensor(String sensorId, int bpm, String status, LocalDateTime lastSync, int battery) {
        this.sensorId = sensorId;
        this.bpm = bpm;
        this.status = status;
        this.lastSync = lastSync;
        this.battery = battery;
    }

    public void readPulse() {
        System.out.println("Current BPM: " + bpm);
    }

    public void syncData() {
        System.out.println("Data synced at: " + lastSync);
    }

    public void shutdown() {
        System.out.println("PulseSensor " + sensorId + " shutting down.");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PulseSensor) {
            PulseSensor other = (PulseSensor) obj;
            if (this.sensorId.equals(other.sensorId)) {
                if (this.status.equals(other.status)) {
                    return true;
                }
            }
        } else return false;
        return false;
    }

    @Override
    public String toString() {
        return "PulseSensor [ID=" + sensorId + ", BPM=" + bpm + ", Status=" + status +
                ", LastSync=" + lastSync + ", Battery=" + battery + "%]";
    }
}

