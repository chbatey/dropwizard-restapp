package com.batey.examples;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class NotesConfiguration extends Configuration {
    @NotEmpty
    private int numberToStore;

    @JsonProperty
    public void setNumberToStore(int numberToStore) {
        this.numberToStore = numberToStore;
    }
}