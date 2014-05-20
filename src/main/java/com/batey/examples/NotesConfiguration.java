package com.batey.examples;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class NotesConfiguration extends Configuration {
    @Min(1)
    @Max(10000)
    @JsonProperty
    private int numberToStore;

    public void setNumberToStore(int numberToStore) {
        this.numberToStore = numberToStore;
    }
}
