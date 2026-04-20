package com.thinkworks.methods.external;

public class HoloDisplay {
    private String displayId;
    private String resolution;
    private int brightness;
    private String mode;
    private boolean isOn;

    public HoloDisplay(String displayId, String resolution, int brightness, String mode, boolean isOn) {
        this.displayId = displayId;
        this.resolution = resolution;
        this.brightness = brightness;
        this.mode = mode;
        this.isOn = isOn;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("HoloDisplay " + displayId + " is now ON.");
    }

    public void adjustBrightness(int level) {
        brightness = level;
        System.out.println("Brightness set to: " + brightness);
    }

    public void switchMode(String newMode) {
        mode = newMode;
        System.out.println("Switched to mode: " + mode);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HoloDisplay) {
            HoloDisplay other = (HoloDisplay) obj;
            if (this.displayId.equals(other.displayId)) {
                if (this.resolution.equals(other.resolution)) {
                    return true;
                }
            }
        } else return false;
        return false;
    }

    @Override
    public String toString() {
        return "HoloDisplay [ID=" + displayId + ", Resolution=" + resolution +
                ", Brightness=" + brightness + ", Mode=" + mode + ", On=" + isOn + "]";
    }
}
