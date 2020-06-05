package com.ui.showcase.guice.service.lifecycle;

import com.ui.showcase.guice.service.device.Device;
import com.ui.showcase.guice.service.device.DeviceValidator;

class DeviceLifecycleValidator implements DeviceValidator {

    @Override
    public void validate(Device device) {
        System.out.println("DeviceLifecycleValidator is validating device '" + device.name() + "'");
    }
}
