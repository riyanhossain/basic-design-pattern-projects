/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ridesharingapp;

/**
 *
 * @author Asus
 */
interface SearchStrategy {

    public void doExecute();
}

class bkash implements SearchStrategy {

    public void doExecute() {
        System.out.println("payment successfully done by Bkash");
    }
}

class CreditCard implements SearchStrategy {

    public void doExecute() {
        System.out.println("payment successfully done by CreditCard");
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
