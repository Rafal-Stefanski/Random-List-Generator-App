
package com.rafalstefanski.randomlistgenerator.vehicle.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "uid",
    "vin",
    "make_and_model",
    "color",
    "transmission",
    "drive_type",
    "fuel_type",
    "car_type",
    "car_options",
    "specs",
    "doors",
    "mileage",
    "kilometrage",
    "license_plate"
})
@Generated("jsonschema2pojo")
public class VehicleRandom {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("uid")
    private String uid;
    @JsonProperty("vin")
    private String vin;
    @JsonProperty("make_and_model")
    private String makeAndModel;
    @JsonProperty("color")
    private String color;
    @JsonProperty("transmission")
    private String transmission;
    @JsonProperty("drive_type")
    private String driveType;
    @JsonProperty("fuel_type")
    private String fuelType;
    @JsonProperty("car_type")
    private String carType;
    @JsonProperty("car_options")
    private List<String> carOptions = null;
    @JsonProperty("specs")
    private List<String> specs = null;
    @JsonProperty("doors")
    private Integer doors;
    @JsonProperty("mileage")
    private Integer mileage;
    @JsonProperty("kilometrage")
    private Integer kilometrage;
    @JsonProperty("license_plate")
    private String licensePlate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    @JsonProperty("vin")
    public String getVin() {
        return vin;
    }

    @JsonProperty("vin")
    public void setVin(String vin) {
        this.vin = vin;
    }

    @JsonProperty("make_and_model")
    public String getMakeAndModel() {
        return makeAndModel;
    }

    @JsonProperty("make_and_model")
    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    @JsonProperty("transmission")
    public String getTransmission() {
        return transmission;
    }

    @JsonProperty("transmission")
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @JsonProperty("drive_type")
    public String getDriveType() {
        return driveType;
    }

    @JsonProperty("drive_type")
    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    @JsonProperty("fuel_type")
    public String getFuelType() {
        return fuelType;
    }

    @JsonProperty("fuel_type")
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @JsonProperty("car_type")
    public String getCarType() {
        return carType;
    }

    @JsonProperty("car_type")
    public void setCarType(String carType) {
        this.carType = carType;
    }

    @JsonProperty("car_options")
    public List<String> getCarOptions() {
        return carOptions;
    }

    @JsonProperty("car_options")
    public void setCarOptions(List<String> carOptions) {
        this.carOptions = carOptions;
    }

    @JsonProperty("specs")
    public List<String> getSpecs() {
        return specs;
    }

    @JsonProperty("specs")
    public void setSpecs(List<String> specs) {
        this.specs = specs;
    }

    @JsonProperty("doors")
    public Integer getDoors() {
        return doors;
    }

    @JsonProperty("doors")
    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    @JsonProperty("mileage")
    public Integer getMileage() {
        return mileage;
    }

    @JsonProperty("mileage")
    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    @JsonProperty("kilometrage")
    public Integer getKilometrage() {
        return kilometrage;
    }

    @JsonProperty("kilometrage")
    public void setKilometrage(Integer kilometrage) {
        this.kilometrage = kilometrage;
    }

    @JsonProperty("license_plate")
    public String getLicensePlate() {
        return licensePlate;
    }

    @JsonProperty("license_plate")
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "VehicleRandom{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", vin='" + vin + '\'' +
                ", makeAndModel='" + makeAndModel + '\'' +
                ", color='" + color + '\'' +
                ", transmission='" + transmission + '\'' +
                ", driveType='" + driveType + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", carType='" + carType + '\'' +
                ", carOptions=" + carOptions +
                ", specs=" + specs +
                ", doors=" + doors +
                ", mileage=" + mileage +
                ", kilometrage=" + kilometrage +
                ", licensePlate='" + licensePlate + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
