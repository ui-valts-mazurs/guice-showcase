package com.ui.showcase.guice.service.device;

import java.util.List;

public interface DeviceService {
    void saveDevice(Device device);

    List<Device> getDevicesByType(DeviceType type);
}
