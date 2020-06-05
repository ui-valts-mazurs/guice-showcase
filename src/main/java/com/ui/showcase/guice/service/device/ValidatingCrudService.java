package com.ui.showcase.guice.service.device;

import com.google.common.collect.ImmutableList;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Singleton
class ValidatingCrudService implements DeviceService {
    private final Set<DeviceValidator> validatorsForAll;
    private final Map<DeviceType, Set<DeviceValidator>> validatorsByType;

    @Inject
    ValidatingCrudService(Set<DeviceValidator> validatorsForAll,
                                 Map<DeviceType, Set<DeviceValidator>> validatorsByType) {
        this.validatorsForAll = validatorsForAll;
        this.validatorsByType = validatorsByType;
    }

    @Override
    public void saveDevice(Device device) {
        validate(device);
        // then save into database
    }

    @Override
    public List<Device> getDevicesByType(DeviceType type) {
        return ImmutableList.of(ImmutableDevice.builder()
                .name("device name")
                .type(type)
                .description("some description")
                .build());
    }

    private void validate(Device device) {
        validatorsForAll.forEach(validator -> validator.validate(device));
        validatorsByType.getOrDefault(device.type(), Collections.emptySet())
                .forEach(validator -> validator.validate(device));
    }
}
