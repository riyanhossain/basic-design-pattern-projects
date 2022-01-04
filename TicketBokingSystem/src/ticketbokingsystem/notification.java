/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketbokingsystem;

/**
 *
 * @author Asus
 * Observer
 */
import java.util.ArrayList;
class NotificationServer {

    ArrayList<C> subs;
    boolean noticationUploaded = false;

    public NotificationServer() {
        subs = new ArrayList<C>();
    }

    public void addUser(C s) {
        subs.add(s);
    }

    public void Remove(C s) {
        subs.remove(s);
    }

    public void notifyUser() {
        for (C e : subs) {
            e.doNotify();
        }
    }

    public void businessLogic() {
        noticationUploaded = true;
        if (noticationUploaded) {
            notifyUser();
        }

    }
}

interface C {

    public void doNotify();
}

class Notification1 implements C {

    public void doNotify() {
        System.out.println("Thanks for buying ticket");
    }
}
public class notification {
    
}
