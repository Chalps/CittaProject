package com.example.cittaapi.model;

public class Vehicles {
    private String plate;
    private String prefix;
    private Boolean wheelChair;
    private Boolean climatized;
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
    public Boolean getWheelChair() {
        return wheelChair;
    }
    public void setWheelChair(Boolean wheelChair) {
        this.wheelChair = wheelChair;
    }
    public Boolean getClimatized() {
        return climatized;
    }
    public void setClimatized(Boolean climatized) {
        this.climatized = climatized;
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
