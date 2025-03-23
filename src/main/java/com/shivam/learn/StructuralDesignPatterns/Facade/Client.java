package com.shivam.learn.StructuralDesignPatterns.Facade;

// import com.shivam.learn.StructuralDesignPatterns.Facade.email.Email;
import com.shivam.learn.StructuralDesignPatterns.Facade.email.EmailFacade;
// import com.shivam.learn.StructuralDesignPatterns.Facade.email.Mailer;
// import com.shivam.learn.StructuralDesignPatterns.Facade.email.Stationary;
// import com.shivam.learn.StructuralDesignPatterns.Facade.email.StationaryFactory;
// import com.shivam.learn.StructuralDesignPatterns.Facade.email.Template;
// import com.shivam.learn.StructuralDesignPatterns.Facade.email.Template.TemplateType;
// import com.shivam.learn.StructuralDesignPatterns.Facade.email.TemplateFactory;

public class Client {
    
    public static void main(String[] args) {
        Order order = new Order("101", 99.99);

        EmailFacade emailFacade = new EmailFacade();

        boolean result  = emailFacade.sendOrderEmail(order);
		
		// boolean result = sendOrderEmailWithoutFacade(order);
		
		System.out.println("Order Email "+ (result?"sent!":"NOT sent..."));
		
	}

	// private static boolean sendOrderEmailWithoutFacade(Order order) {
	// 	Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
	// 	Stationary stationary = StationaryFactory.createStationary();
	// 	Email email = Email.getBuilder()
	// 				  .withTemplate(template)
	// 				  .withStationary(stationary)
	// 				  .forObject(order)
	// 				  .build();
	// 	Mailer mailer = Mailer.getMailer();
	// 	return mailer.send(email);
	// }
	
}
