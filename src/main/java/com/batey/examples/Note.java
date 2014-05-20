package com.batey.examples;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Note {
    private long id;
    private String author;
    private String text;

    public Note() {
    }

    public Note(long id, String author, String text) {
        this.id = id;
        this.author = author;
        this.text = text;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getAuthor() {
        return author;
    }

    @JsonProperty
    public String getText() {
        return text;
    }
}
