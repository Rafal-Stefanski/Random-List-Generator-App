package com.rafalstefanski.randomlistgenerator.model.dog;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "facts",
    "success"
})
@Generated("jsonschema2pojo")
public class DogFact {

    @JsonProperty("facts")
    private List<String> facts = null;

    @JsonProperty("success")
    private Boolean success;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("facts")
    public List<String> getFacts() {
        return (List<String>) getAdditionalProperties();
    }

    @JsonProperty("facts")
    public void setFacts(List<String> facts) {
        this.facts = facts;
    }

    @JsonProperty("success")
    public Boolean getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    private String src;
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    @Override
    public String toString() {
        return "DogFact{" +
                "facts=" + facts +
                ", success=" + success +
                ", additionalProperties=" + additionalProperties +
                ", src='" + src + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
