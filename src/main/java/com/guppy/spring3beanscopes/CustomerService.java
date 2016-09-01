
package com.guppy.spring3beanscopes;

/**
 *
 * @author kemalsamikaraca
 */
public class CustomerService {
    
    private String message;

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    public void printMessage(){
        System.out.println("Message : " + this.message);
    }
    
}
