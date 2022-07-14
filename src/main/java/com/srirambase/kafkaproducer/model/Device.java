package com.srirambase.kafkaproducer.model;

import java.util.Date;

public class Device {
    private String id;
    private String name;
    private String location;
    private String family;
    private String ipAddress;
    private String macAddress;
    private Date lastPingTime;

    public Device(String id, String name, String location, String family, String ipAddress, String macAddress, Date lastPingTime) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.family = family;
        this.ipAddress = ipAddress;
        this.macAddress = macAddress;
        this.lastPingTime = lastPingTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public Date getLastPingTime() {
        return lastPingTime;
    }

    public void setLastPingTime(Date lastPingTime) {
        this.lastPingTime = lastPingTime;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", family='" + family + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", macAddress='" + macAddress + '\'' +
                ", lastPingTime=" + lastPingTime +
                '}';
    }
}
