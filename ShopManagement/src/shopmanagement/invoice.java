/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopmanagement;

/**
 *
 * @author Asus
 */
import java.util.ArrayList;

//publisher
class invoiceServer {

    ArrayList<customer> subs;
    boolean invoiceUploaded = false;

    public invoiceServer() {
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
        invoiceUploaded = true;
        if (invoiceUploaded) {
            notifyCustomers();
        }

    }
}

interface customer {

    public void doNotify();
}

class CustomerWithNotification implements customer {

    public void doNotify() {
        System.out.println("Invoice");
    }
}
public class invoice {

}
