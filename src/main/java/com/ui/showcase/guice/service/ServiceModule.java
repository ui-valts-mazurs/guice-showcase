package com.ui.showcase.guice.service;

import com.google.inject.AbstractModule;
import com.ui.showcase.guice.service.device.DeviceModule;
import com.ui.showcase.guice.service.lifecycle.LifecycleModule;
import com.ui.showcase.guice.service.networkswitch.SwitchModule;
import com.ui.showcase.guice.service.wifi.WifiModule;

public class ServiceModule extends AbstractModule {
    @Override
    protected void configure() {
        install(new DeviceModule());
        install(new LifecycleModule());
        install(new SwitchModule());
        install(new WifiModule());
    }
}
