package com.ui.showcase.guice.service.device;

import com.google.inject.AbstractModule;

public class DeviceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(DeviceService.class).to(ValidatingCrudService.class);
    }
}
