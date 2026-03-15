package com.thinkworks.smartdevice.service;
import com.thinkworks.smartdevice.dto.SmartDevice;

public class DeviceService {

    public void printDeviceDetails(SmartDevice device){

        SmartDevice smartDevice = new SmartDevice("7384yh", "phone");
        System.out.println("Device ID: " + smartDevice.getDeviceId());
        System.out.println("Device Name: " + smartDevice.getDeviceName());
    }
    public void printControllerDetails(SmartDevice.Controller controller ){

        SmartDevice.Controller control = new SmartDevice.Controller("App");
        System.out.println(control.controlAction());
    }
    public void printSensorDetails(SmartDevice.Sensor sensor ){

        SmartDevice smartDevice = new SmartDevice("7384yh", "phone");
        SmartDevice.Sensor sensor1 = smartDevice.new Sensor("22874ju", "Light", 4567.88);
        sensor1.getSensorId();
        sensor1.getSensorType();
        sensor1.getValue();
    }
    public void runDiagnostics(SmartDevice device){

        SmartDevice device = new SmartDevice("7384yh", "phone");

    }

}
