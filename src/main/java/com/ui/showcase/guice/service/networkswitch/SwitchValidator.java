package com.ui.showcase.guice.service.networkswitch;

import com.ui.showcase.guice.service.device.Device;
import com.ui.showcase.guice.service.device.DeviceValidator;

class SwitchValidator implements DeviceValidator {

    @Override
    public void validate(Device device) {
        System.out.println("SwitchValidator is validating device '" + device.name() + "'");
    }
}
