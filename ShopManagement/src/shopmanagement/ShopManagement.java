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

public class ShopManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Product cake = new Cake();
    Product biscuit = new Biscuit();
    Visitor employee1 = new ShoppingVisitor();
    cake.accept(employee1);
    biscuit.accept(employee1);
    System.out.println("total price:"+biscuit.accept(employee1));
    
    
    SearchStrategy b = new bkash();
    Context c = new Context();
    c.setStrategy(b);
    c.execute();
    
    invoiceServer server = new invoiceServer();
    customer s = new CustomerWithNotification();
    server.CustomerList(s);
    server.businessLogic();
    
    
    }
    
}
