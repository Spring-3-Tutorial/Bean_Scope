
package com.guppy.spring3beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author kemalsamikaraca
 */
public class SpringApp {
    
    public static void main(String[] args){
        
        System.out.println("--- --- --- Spring 3 Bean Tutorial--- --- ---");
               
        ApplicationContext context = 
                new ClassPathXmlApplicationContext(new String[]{"Beans.xml"});
        
        // --- Singloton Scope Example --- (Default scope)
        CustomerService customerServiceOne = (CustomerService)context.getBean("singletonBean");        
        customerServiceOne.setMessage("Message by Singleton Object");
        customerServiceOne.printMessage();
        
        CustomerService customerServiceTwo = (CustomerService) context.getBean("singletonBean");
        customerServiceTwo.printMessage();
        
        // --- Prototype Scope Example --- 
        CustomerService customerServiceThree = (CustomerService)context.getBean("prototypeBean");
        customerServiceThree.setMessage("Message by Prototype Object");
        customerServiceThree.printMessage();
        
        CustomerService customerServiceFour = (CustomerService)context.getBean("prototypeBean");
        customerServiceFour.printMessage();
        
    }
    
}



