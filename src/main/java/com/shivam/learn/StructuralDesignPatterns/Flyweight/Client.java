package com.shivam.learn.StructuralDesignPatterns.Flyweight;

import com.shivam.learn.StructuralDesignPatterns.Flyweight.ErrorMessageFactory.ErrorType;

public class Client {
    
    public static void main(String[] args) {
        SystemErrorMessage msg1 = ErrorMessageFactory.getInstance().getError(ErrorType.GenericSystemError);
        System.out.println(msg1.getText("4056"));

        UserBannedErrorMessage msg2 = ErrorMessageFactory.getInstance().getUserBannedErrorMessage("1256");
        System.out.println(msg2.getText("1056"));
    }
}
