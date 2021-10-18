
package com.rafalstefanski.randomlistgenerator.model.user;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "key_skill"
})
@Generated("jsonschema2pojo")
public class Employment {

    @JsonProperty("title")
    private String title;
    @JsonProperty("key_skill")
    private String keySkill;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("key_skill")
    public String getKeySkill() {
        return keySkill;
    }

    @JsonProperty("key_skill")
    public void setKeySkill(String keySkill) {
        this.keySkill = keySkill;
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
