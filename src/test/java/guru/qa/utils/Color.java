package guru.qa.utils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
public @Data class Color {
    private Integer id;
    private String color;
    private String name;
    @JsonProperty("pantone_value")
    private String pantoneValue;
}
