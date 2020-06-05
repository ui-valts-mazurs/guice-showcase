package com.ui.showcase.guice.service.wifi;

import com.ui.showcase.guice.service.device.Device;

import java.util.List;

public interface WifiService {
    List<Device> getAccessPoints();
}
