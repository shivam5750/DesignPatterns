package com.shivam.learn.StructuralDesignPatterns.Facade.email;

import com.shivam.learn.StructuralDesignPatterns.Facade.Order;
import com.shivam.learn.StructuralDesignPatterns.Facade.email.Template.TemplateType;

//Facade provides simple methods for client to use
public class EmailFacade {
    
    public boolean sendOrderEmail(Order order){
        Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
		Stationary stationary = StationaryFactory.createStationary();
		Email email = Email.getBuilder()
					  .withTemplate(template)
					  .withStationary(stationary)
					  .forObject(order)
					  .build();
		Mailer mailer = Mailer.getMailer();
		return mailer.send(email);
    }
}
