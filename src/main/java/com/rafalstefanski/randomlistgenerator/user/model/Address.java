
package com.rafalstefanski.randomlistgenerator.user.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "city",
    "street_name",
    "street_address",
    "zip_code",
    "state",
    "country",
    "coordinates"
})
@Generated("jsonschema2pojo")
public class Address {

    @JsonProperty("city")
    private String city;
    @JsonProperty("street_name")
    private String streetName;
    @JsonProperty("street_address")
    private String streetAddress;
    @JsonProperty("zip_code")
    private String zipCode;
    @JsonProperty("state")
    private String state;
    @JsonProperty("country")
    private String country;
    @JsonProperty("coordinates")
    private Coordinates coordinates;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("street_name")
    public String getStreetName() {
        return streetName;
    }

    @JsonProperty("street_name")
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @JsonProperty("street_address")
    public String getStreetAddress() {
        return streetAddress;
    }

    @JsonProperty("street_address")
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    @JsonProperty("zip_code")
    public String getZipCode() {
        return zipCode;
    }

    @JsonProperty("zip_code")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("coordinates")
    public Coordinates getCoordinates() {
        return coordinates;
    }

    @JsonProperty("coordinates")
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
