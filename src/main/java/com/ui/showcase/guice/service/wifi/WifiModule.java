package com.ui.showcase.guice.service.wifi;

import com.google.inject.AbstractModule;
import com.google.inject.Scope;
import com.google.inject.Singleton;
import com.google.inject.multibindings.MapBinder;
import com.ui.showcase.guice.service.device.DeviceType;
import com.ui.showcase.guice.service.device.DeviceValidator;

public class WifiModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(WifiService.class).to(WifiCrudService.class);
        bindValidators();
    }

    private void bindValidators() {
        MapBinder<DeviceType, DeviceValidator> validatorBinder = MapBinder
                .newMapBinder(binder(), DeviceType.class, DeviceValidator.class)
                .permitDuplicates();
        validatorBinder.addBinding(DeviceType.WIFI_ACCESS_POINT).to(AccessPointNameValidator.class);
        validatorBinder.addBinding(DeviceType.WIFI_ACCESS_POINT).to(AccessPointDescriptionValidator.class);
    }
}
