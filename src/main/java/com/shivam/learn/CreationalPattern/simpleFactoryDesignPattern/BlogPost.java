package com.shivam.learn.CreationalPattern.simpleFactoryDesignPattern;

public class BlogPost  extends Post{
    
    private String author;

    private String[] tags;

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String[] getTags() {
        return this.tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

}

    
