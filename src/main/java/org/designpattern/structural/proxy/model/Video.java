package org.designpattern.structural.proxy.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Video {
    private long ID;
    private String name;
    private LocalDateTime publishedOn;
    private int like;

    public Video(long ID, String name, LocalDateTime publishedOn, int like) {
        this.ID = ID;
        this.name = name;
        this.publishedOn = publishedOn;
        this.like = like;
    }
}
