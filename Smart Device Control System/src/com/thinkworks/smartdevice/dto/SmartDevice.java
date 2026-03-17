package com.thinkworks.smartdevice.dto;

public class SmartDevice {

    String deviceId;
    String deviceName;

    public SmartDevice(String deviceId, String deviceName){

        this.deviceId = deviceId;
        this.deviceName= deviceName;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public static class Controller{

        String controllerId;
        String type;

        public Controller(String type, String controllerId){

            this.controllerId = controllerId;
            this.type= type;
        }
        public void controlAction(){

            System.out.println("controller " + type + " managing device");
        }
    }

    public class Sensor {

        String sensorId;
        String sensorType;
        double value;

        public Sensor(String sensorId, String sensorType, double value){

            this.sensorId = sensorId;
            this.sensorType = sensorType;
            this.value = value;
        }

        public String getSensorId() {
            return sensorId;
        }

        public String getSensorType() {
            return sensorType;
        }

        public double getValue() {
            return value;
        }

        public void readSensor(){

            System.out.println("Sensor " + sensorType + " reading: " + value);
        }
    }

    public void runDiagnostics(){

        class DiagnosticTool{

            String toolName;

            DiagnosticTool(String toolName){
                this.toolName = toolName;
            }

            public String getToolName() {
                return toolName;
            }

            void performCheck(){

                System.out.println("Running diagnostics with " + toolName);
            }
        }
        DiagnosticTool tool = new DiagnosticTool("bin");
        tool.performCheck();

    }

}
