package com.shivam.learn.CreationalPattern.simpleFactoryDesignPattern;

import java.time.LocalDateTime;
/**
 * News post extending abstract post class
 */

public class NewsPost extends Post {
    
    private String headLine;

    private LocalDateTime newsTime;

    public String getHeadLine() {
        return this.headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public LocalDateTime getNewsTime() {
        return this.newsTime;
    }

    public void setNewsTime(LocalDateTime newsTime) {
        this.newsTime = newsTime;
    }
    
    
}
