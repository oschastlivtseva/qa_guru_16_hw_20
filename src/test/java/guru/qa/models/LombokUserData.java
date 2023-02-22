package guru.qa.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import guru.qa.utils.User;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
public @Data class LombokUserData {
    @JsonProperty("data")
    private User user;
}
