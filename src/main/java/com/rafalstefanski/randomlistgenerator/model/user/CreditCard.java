
package com.rafalstefanski.randomlistgenerator.model.user;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cc_number"
})
@Generated("jsonschema2pojo")
public class CreditCard {

    @JsonProperty("cc_number")
    private String ccNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cc_number")
    public String getCcNumber() {
        return ccNumber;
    }

    @JsonProperty("cc_number")
    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
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
