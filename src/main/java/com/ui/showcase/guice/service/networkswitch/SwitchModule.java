package com.ui.showcase.guice.service.networkswitch;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;
import com.ui.showcase.guice.service.device.DeviceType;
import com.ui.showcase.guice.service.device.DeviceValidator;

public class SwitchModule extends AbstractModule {
    @Override
    protected void configure() {
        validatorBinder().addBinding(DeviceType.SWITCH).to(SwitchValidator.class);
    }

    private MapBinder<DeviceType, DeviceValidator> validatorBinder() {
        return MapBinder.newMapBinder(binder(), DeviceType.class, DeviceValidator.class);
    }
}
