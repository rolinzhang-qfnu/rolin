package com.rolinzhang.rolin;


import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "rolin")
    public class RolinProperties {

    private long datacenterId;

    private long machineId;

    public long getDatacenterId() {
        return datacenterId;
    }

    public void setDatacenterId(long datacenterId) {
        this.datacenterId = datacenterId;
    }

    public long getMachineId() {
        return machineId;
    }

    public void setMachineId(long machineId) {
        this.machineId = machineId;
    }
}