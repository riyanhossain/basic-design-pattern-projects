/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketbokingsystem;

/**
 *
 * @author Asus
 */
public class TicketBokingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ticket ca = new magura();
        Ticket ba = new gopalpur();
        Visitor employee1 = new ShoppingVisitor();
        ca.accept(employee1);
        ba.accept(employee1);
        System.out.println("total price:"+ca.accept(employee1));
        
        SearchStrategy b = new bkash();
        Context c = new Context();
        c.setStrategy(b);
        c.execute();
        
        NotificationServer server = new NotificationServer();
        C s = new Notification1();
        server.addUser(s);
        server.businessLogic();
    }
    
}
