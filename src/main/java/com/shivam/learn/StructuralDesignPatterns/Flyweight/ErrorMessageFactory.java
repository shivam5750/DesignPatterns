package com.shivam.learn.StructuralDesignPatterns.Flyweight;

import java.util.HashMap;
import java.util.Map;

// Flyweight factory, Returns a shared concrete flyweight based on the key
public class ErrorMessageFactory {

    // This serves as key for getting flyweight object
    public enum ErrorType {GenericSystemError, PageNotFoundError, ServerError};

    private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

    public static ErrorMessageFactory getInstance(){
        return FACTORY;
    }

    private Map<ErrorType, SystemErrorMessage> errorMessages = new HashMap<>();

    private ErrorMessageFactory(){

        errorMessages.put(ErrorType.GenericSystemError,  
        new SystemErrorMessage("A generic error of type $errorCode occured. Please refer to:\n", 
        "www.google.com?q="));
        errorMessages.put(ErrorType.PageNotFoundError, 
        new SystemErrorMessage("A page not found error of type $errorCode. Please refer to :\n", 
        "www.google.com?q="));

    }

    public SystemErrorMessage getError(ErrorType type) {
        return errorMessages.get(type);
    }

    public UserBannedErrorMessage getUserBannedErrorMessage(String caseId){
        return new UserBannedErrorMessage(caseId);
    }
    
}
