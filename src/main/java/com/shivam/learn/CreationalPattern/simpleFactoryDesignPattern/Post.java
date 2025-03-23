package com.shivam.learn.CreationalPattern.simpleFactoryDesignPattern;

import java.time.LocalDateTime;

public abstract class Post {
    
    private Long id;

    private String title;

    private String conteny;

    private LocalDateTime createdOn;

    private LocalDateTime publishedOn;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConteny() {
        return this.conteny;
    }

    public void setConteny(String conteny) {
        this.conteny = conteny;
    }

    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDateTime getPublishedOn() {
        return this.publishedOn;
    }

    public void setPublishedOn(LocalDateTime publishedOn) {
        this.publishedOn = publishedOn;
    }
    
}
