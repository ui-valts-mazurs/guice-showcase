package com.ui.showcase.guice;

import com.google.inject.AbstractModule;
import com.ui.showcase.guice.service.ServiceModule;

class MainModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Application.class);
        install(new ServiceModule());
    }
}
