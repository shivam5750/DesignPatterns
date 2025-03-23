package com.shivam.learn.BehaviouralDesignPattern.templateMethod;

public class HtmlPrinter extends OrderPrinter {

    @Override
    protected String start() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    @Override
    protected String formatOrderNumber(Order order) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'formatOrderNumber'");
    }

    @Override
    protected String formatItems(Order order) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'formatItems'");
    }

    @Override
    protected String formatTotal(Order order) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'formatTotal'");
    }

    @Override
    protected String end() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'end'");
    }
    
}
