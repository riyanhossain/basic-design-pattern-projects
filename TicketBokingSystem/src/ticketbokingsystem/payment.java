/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketbokingsystem;

/**
 *
 * @author Asus
 * Strategy
 */
interface SearchStrategy {

    public void doExecute();
}

class cash implements SearchStrategy {

    public void doExecute() {
        System.out.println("payment By Cash");
    }
}

class bkash implements SearchStrategy {

    public void doExecute() {
        System.out.println("payment By bkash");
    }
}

class paypal implements SearchStrategy {

    public void doExecute() {
        System.out.println("payment By paypal");
    }
}
class Context {

    SearchStrategy strategy;

    public void setStrategy(SearchStrategy s) {
        this.strategy = s;
    }

    public void execute() {
        strategy.doExecute();
    }
}
public class payment {
    
}
