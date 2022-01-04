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
import java.util.ArrayList;

//publisher
class ArrivalServer {

    ArrayList<customer> subs;
    boolean RiderArrived = false;

    public ArrivalServer() {
        subs = new ArrayList<customer>();
    }

    public void CustomerList(customer s) {
        subs.add(s);
    }

    public void RemoveCustomer(customer s) {
        subs.remove(s);
    }

    public void notifyCustomers() {
        for (customer c : subs) {
            c.doNotify();
        }
    }

    public void businessLogic() {
        RiderArrived = true;
        if (RiderArrived) {
            notifyCustomers();
        }

    }
}

interface customer {

    public void doNotify();
}

class CustomerWithNotification implements customer {

    public void doNotify() {
        System.out.println("Rider Arrived");
    }
}
public class Notification {
    
}
