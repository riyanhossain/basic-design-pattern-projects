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
import java.util.Scanner;
public class RideSharingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mirpur m = new Mirpur();
        Visitor rider1 = new RiderVisitor();
        System.out.println("Rider accepted ride with"+m.accept(rider1)+"Taka");
    
    
        ArrivalServer server = new ArrivalServer();
        customer s = new CustomerWithNotification();
        server.CustomerList(s);
        server.businessLogic();
        
        Scanner sc = new Scanner(System.in);
        WindowForm form = new WindowForm();
        ButtonCommand accept = new RequestButtonCommand();
        ButtonCommand deline = new DelineButtonCommand();

        String input = "accept";
        if(input == "accept"){
        form.setCommand(accept);
        }
        else if(input == "deline"){
        form.setCommand(deline);
        }
        System.out.println("Ride finished,Rider is requested for payment!");
        
        
        SearchStrategy b = new bkash();
        Context c = new Context();
        c.setStrategy(b);
        c.execute();
        
    }
    
}
