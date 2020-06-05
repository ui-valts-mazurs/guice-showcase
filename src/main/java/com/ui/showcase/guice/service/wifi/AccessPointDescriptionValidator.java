package com.ui.showcase.guice.service.wifi;

import com.ui.showcase.guice.service.device.Device;
import com.ui.showcase.guice.service.device.DeviceValidator;

class AccessPointDescriptionValidator implements DeviceValidator {

    @Override
    public void validate(Device device) {
        System.out.println("AccessPointDescriptionValidator is validating device '" + device.name()
                + "' with description '" + device.description() + "'");
    }
}
