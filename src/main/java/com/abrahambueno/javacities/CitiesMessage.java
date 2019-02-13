package com.abrahambueno.javacities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class CitiesMessage implements Serializable {
    //Text, priority, and whether it is secret or not
    private final String text;
    private final int priority;
    private final boolean secret;

    public CitiesMessage(@JsonProperty("Text") String text, @JsonProperty("priority") int priority, @JsonProperty("secret") boolean secret) {
        this.text = text;
        this.priority = priority;
        this.secret = secret;
    }
}
