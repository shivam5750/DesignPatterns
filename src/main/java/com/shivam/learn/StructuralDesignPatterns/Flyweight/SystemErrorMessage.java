package com.shivam.learn.StructuralDesignPatterns.Flyweight;

// A concrete Flyweight, instance is shared
public class SystemErrorMessage implements ErrorMessage {

    // Some error messgae $errorcode
    private String messageTemplate;

    // http://somedomain.com/help?error=
    private String helpUrlBase;

    public SystemErrorMessage(String messageTemplate , String helpBaseUrl){
        this.messageTemplate = messageTemplate;
        this.helpUrlBase = helpBaseUrl;
    }

    @Override
    public String getText(String code) {
        // code is extrinsic state
        return messageTemplate.replace("$errorCode", code) +  helpUrlBase +code;
    }
    
}
