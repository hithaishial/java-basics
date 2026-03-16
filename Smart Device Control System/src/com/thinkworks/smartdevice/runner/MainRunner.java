package com.thinkworks.smartdevice.runner;
import com.thinkworks.smartdevice.dto.SmartDevice;
import com.thinkworks.smartdevice.service.DeviceService;

public class MainRunner {

    public static void main(String[] args) {

        SmartDevice device = new SmartDevice("3475ij", "remote control");
        SmartDevice.Controller control = new SmartDevice.Controller("light sensor");
        SmartDevice.Sensor sense = device.new Sensor("o8743d", "sound", 3849.34);
        DeviceService service = new DeviceService();
        service.printDeviceDetails(device);
        service.printControllerDetails(control);
        service.printSensorDetails(sense);
        service.runDeviceDiagnostics(device);
    }


}
