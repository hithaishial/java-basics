package com.thinkworks.smartdevice.service;
import com.thinkworks.smartdevice.dto.SmartDevice;

public class DeviceService {

    public void printDeviceDetails(SmartDevice device) {
        if(device!= null) {
            System.out.println("Device ID: " + device.getDeviceId());
            System.out.println("Device Name: " + device.getDeviceName());
        }
        else System.out.println("value is null");
        System.out.println(" ");
    }

    public void printControllerDetails(SmartDevice.Controller controller) {
        if (controller != null) {
            controller.controlAction();
        }
        else System.out.println("value is null");
        System.out.println(" ");
    }

    public void printSensorDetails(SmartDevice.Sensor sensor) {
        if (sensor != null) {
            System.out.println("Sensor ID: " + sensor.getSensorId());
            System.out.println("Sensor Type: " + sensor.getSensorType());
            System.out.println("Sensor Value: " + sensor.getValue());
        }
        else System.out.println("value is null");
        System.out.println(" ");
    }

    public void runDeviceDiagnostics(SmartDevice device) {
        if(device != null) {
            device.runDiagnostics();
        }
        else System.out.println("value is null");
        System.out.println(" ");
    }
}
