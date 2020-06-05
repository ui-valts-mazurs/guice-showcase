package com.ui.showcase.guice.service.wifi;

import com.ui.showcase.guice.service.device.Device;
import com.ui.showcase.guice.service.device.DeviceService;
import com.ui.showcase.guice.service.device.DeviceType;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

@Singleton
class WifiCrudService implements WifiService {
    private final DeviceService deviceService;

    @Inject
    WifiCrudService(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @Override
    public List<Device> getAccessPoints() {
        return deviceService.getDevicesByType(DeviceType.WIFI_ACCESS_POINT);
    }
}
