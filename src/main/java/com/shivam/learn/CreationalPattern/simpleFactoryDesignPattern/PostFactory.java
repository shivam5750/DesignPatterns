package com.shivam.learn.CreationalPattern.simpleFactoryDesignPattern;


/*
 * The Main Core Class which will Instantiate the Object
 */
public class PostFactory {
 
    public static Post createPost(String type) {
        switch (type) {
            case "blog":
                return new BlogPost();
            case "news":
                return new NewsPost();
            case "product":
                return new ProductPost();
            default:
                throw new IllegalArgumentException("Post type is Invalid");
        
        }
    }
}
