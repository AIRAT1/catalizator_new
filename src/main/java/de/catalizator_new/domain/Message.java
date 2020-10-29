package de.catalizator_new.domain;

import lombok.Data;

@Data
public class Message {
    private Long id;
    private String data;

    public Message(String data) {
        this.data = data;
    }
}
