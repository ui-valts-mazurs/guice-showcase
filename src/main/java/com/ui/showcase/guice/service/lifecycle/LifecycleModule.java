package com.ui.showcase.guice.service.lifecycle;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import com.ui.showcase.guice.service.device.DeviceValidator;

public class LifecycleModule extends AbstractModule {
    @Override
    protected void configure() {
        validatorBinder().addBinding().to(DeviceLifecycleValidator.class);
    }

    private Multibinder<DeviceValidator> validatorBinder() {
        return Multibinder.newSetBinder(binder(), DeviceValidator.class);
    }
}
