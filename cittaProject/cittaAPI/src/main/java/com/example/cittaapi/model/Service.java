package com.example.cittaapi.model;

import java.util.List;

public class Service {
    private String routeCode;
    private String routeMnemonic;
    private Integer companyId;
    private Long stopId;
    private Long serviceId;
    private String serviceMnemonic;
    private String predictionType;
    private Integer activeVehicles;
    private Integer scheduledVehicles;
    private List<Messages> messages;
    private List<Vehicles> vehicles;
    private Boolean hasRealTime;


    public List<Messages> getMessages() {
        return messages;
    }
    public void setMessages(List<Messages> messages) {
        this.messages = messages;
    }
    public List<Vehicles> getVehicles() {
        return vehicles;
    }
    public void setVehicles(List<Vehicles> vehicles) {
        this.vehicles = vehicles;
    }
    public Boolean getHasRealTime() {
        return hasRealTime;
    }
    public void setHasRealTime(Boolean hasRealTime) {
        this.hasRealTime = hasRealTime;
    }
    public String getRouteCode() {
        return routeCode;
    }
    public void setRouteCode(String routeCode) {
        this.routeCode = routeCode;
    }
    public String getRouteMnemonic() {
        return routeMnemonic;
    }
    public void setRouteMnemonic(String routeMnemonic) {
        this.routeMnemonic = routeMnemonic;
    }
    public Integer getCompanyId() {
        return companyId;
    }
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
    public Long getStopId() {
        return stopId;
    }
    public void setStopId(Long stopId) {
        this.stopId = stopId;
    }
    public Long getServiceId() {
        return serviceId;
    }
    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }
    public String getServiceMnemonic() {
        return serviceMnemonic;
    }
    public void setServiceMnemonic(String serviceMnemonic) {
        this.serviceMnemonic = serviceMnemonic;
    }
    public String getPredictionType() {
        return predictionType;
    }
    public void setPredictionType(String predictionType) {
        this.predictionType = predictionType;
    }
    public Integer getActiveVehicles() {
        return activeVehicles;
    }
    public void setActiveVehicles(Integer activeVehicles) {
        this.activeVehicles = activeVehicles;
    }
    public Integer getScheduledVehicles() {
        return scheduledVehicles;
    }
    public void setScheduledVehicles(Integer scheduledVehicles) {
        this.scheduledVehicles = scheduledVehicles;
    }

}
