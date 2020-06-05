package com.ui.showcase.guice;

import com.ui.showcase.guice.service.device.Device;
import com.ui.showcase.guice.service.device.DeviceService;
import com.ui.showcase.guice.service.device.DeviceType;
import com.ui.showcase.guice.service.device.ImmutableDevice;
import com.ui.showcase.guice.service.wifi.WifiService;

import javax.inject.Inject;
import java.util.List;

class Application {
    private final DeviceService deviceService;
    private final WifiService wifiService;

    @Inject
    Application(DeviceService deviceService, WifiService wifiService) {
        this.deviceService = deviceService;
        this.wifiService = wifiService;
    }

    void demonstrate() {
        demonstrateImplementationInjection();
        demonstrateValidators();
    }

    private void demonstrateImplementationInjection() {
        System.out.println("-- Fetching all access points");
        List<Device> accessPoints = wifiService.getAccessPoints();
        System.out.println("Access points: " + accessPoints);
    }


    private void demonstrateValidators() {
        demonstrateValidatorWithoutType();
        demonstrateSingleNamedValidator();
        demonstrateMultipleNamedValidators();
    }

    private void demonstrateValidatorWithoutType() {
        Device device = ImmutableDevice.builder()
                .name("gateway point name")
                .type(DeviceType.GATEWAY)
                .description("gateway description")
                .build();
        saveDevice(device);
    }

    private void demonstrateSingleNamedValidator() {
        Device device = ImmutableDevice.builder()
                .name("switch name")
                .type(DeviceType.SWITCH)
                .description("switch description")
                .build();
        saveDevice(device);
    }

    private void demonstrateMultipleNamedValidators() {
        Device device = ImmutableDevice.builder()
                .name("access point name")
                .type(DeviceType.WIFI_ACCESS_POINT)
                .description("access point description")
                .build();
        saveDevice(device);
    }

    private void saveDevice(Device device) {
        System.out.println("-- Trying to save device " + device);
        deviceService.saveDevice(device);
    }
}
