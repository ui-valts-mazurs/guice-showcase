package com.ui.showcase.guice.service.wifi;

import com.ui.showcase.guice.service.device.Device;
import com.ui.showcase.guice.service.device.DeviceValidator;

class AccessPointNameValidator implements DeviceValidator {

    @Override
    public void validate(Device device) {
        System.out.println("AccessPointNameValidator is validating device '" + device.name() + "'");
    }
}
