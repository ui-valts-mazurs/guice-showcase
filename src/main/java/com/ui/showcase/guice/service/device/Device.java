package com.ui.showcase.guice.service.device;

import org.immutables.value.Value;

@Value.Immutable
public interface Device {
    String name();

    DeviceType type();

    String description();
}
