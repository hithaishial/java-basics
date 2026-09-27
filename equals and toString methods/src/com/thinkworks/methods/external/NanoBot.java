package com.thinkworks.methods.external;

public class NanoBot {
    private String botId;
    private String taskType;
    private int energyLevel;
    private String location;
    private boolean isActive;

    public NanoBot(String botId, String taskType, int energyLevel, String location, boolean isActive) {
        this.botId = botId;
        this.taskType = taskType;
        this.energyLevel = energyLevel;
        this.location = location;
        this.isActive = isActive;
    }

    public void startTask() {
        System.out.println("NanoBot " + botId + " started task: " + taskType);
    }

    public void recharge() {
        System.out.println("NanoBot " + botId + " is recharging.");
    }

    public void selfDestruct() {
        System.out.println("NanoBot " + botId + " has self-destructed!");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NanoBot) {
            NanoBot other = (NanoBot) obj;
            if (this.botId.equals(other.botId)) {
                if (this.taskType.equals(other.taskType)) {
                    return true;
                }
            }
        } else return false;
        return false;
    }

    @Override
    public String toString() {
        return "NanoBot [ID=" + botId + ", Task=" + taskType + ", Energy=" + energyLevel +
                ", Location=" + location + ", Active=" + isActive + "]";
    }
}

