package com.testepagmob.service.controller;

import java.util.ArrayList;
import java.util.List;

class Service{
  private String routeCode;
  private String routeMnemonic;
  private Long companyId;
  private Long stopId;
  private Long serviceId;
  private String serviceMnemonic;
  private String predictionType;
  private Integer activeVehicles;
  private Integer scheduledVehicles;
  private List<Messages> messages;
  private List<Vehicles> vehicles;
  private Boolean hasRealTime;
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
  public Long getCompanyId() {
    return companyId;
  }
  public void setCompanyId(Long companyId) {
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

}

class Messages{
  private String text;
  private Long ts; 
  private Integer companyId;
  private String companyType;
  private String companyName;

  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }
  public Long getTs() {
    return ts;
  }
  public void setTs(Long ts) {
    this.ts = ts;
  }
  public Integer getCompanyId() {
    return companyId;
  }
  public void setCompanyId(Integer companyId) {
    this.companyId = companyId;
  }
  public String getCompanyType() {
    return companyType;
  }
  public void setCompanyType(String companyType) {
    this.companyType = companyType;
  }
  public String getCompanyName() {
    return companyName;
  }
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }
}

class Vehicles{
  private String plate;
  private String prefix;
  private Boolean wheelchair;
  private Boolean climatized;
  private Integer prediction;
  private Integer age;
  private String type;

  public String getPlate() {
    return plate;
  }
  public void setPlate(String plate) {
    this.plate = plate;
  }
  public String getPrefix() {
    return prefix;
  }
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }
  public Boolean getWheelchair() {
    return wheelchair;
  }
  public void setWheelchair(Boolean wheelchair) {
    this.wheelchair = wheelchair;
  }
  public Boolean getClimatized() {
    return climatized;
  }
  public void setClimatized(Boolean climatized) {
    this.climatized = climatized;
  }
  public Integer getPrediction() {
    return prediction;
  }
  public void setPrediction(Integer prediction) {
    this.prediction = prediction;
  }
  public Integer getAge() {
    return age;
  }
  public void setAge(Integer age) {
    this.age = age;
  }
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
}

public class ServicesDTO {
  private List <Service> services;

  public List<Service> getServices() {
    return services;
  }

  public void setServices(List<Service> services) {
    this.services = services;
  }

  public ServicesDTO(){
    services = new ArrayList<>();
  }
}
