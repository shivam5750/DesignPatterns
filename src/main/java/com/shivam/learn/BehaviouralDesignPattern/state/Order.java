package com.shivam.learn.BehaviouralDesignPattern.state;

// Context Class
/*
 * We are going to manage the state based on the cancel state on whic state order is
 * if order in new state we can cancel it directly but if in paid state then we need to rollback the transaction 
 * by comunicating with the payment gateway
 */
public class Order {
    
    private OrderState currentState;

    public Order(){
        this.currentState = new New();
    }

    public double cancel(){
        double charge = currentState.handleState();
        currentState = new Cancelled();
        return charge;
    }

    public void paymentSuccessful(){
        currentState = new Paid();
    }

    public void dispatched(){
        currentState = new Intransit();
    }

    public void delivered(){   
        currentState = new Delivered();

    }
}
