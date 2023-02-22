package guru.qa.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import guru.qa.utils.Color;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
public @Data class LombokColorData {
    @JsonProperty("data")
    private Color color;
}
