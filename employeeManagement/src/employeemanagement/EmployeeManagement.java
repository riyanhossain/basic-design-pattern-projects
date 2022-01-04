/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;

/**
 *
 * @author Asus
 */
public class EmployeeManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmployeeManager manager = new EmployeeManager();
        manager.makeReport(1);
        manager.makeReport(2);
        manager.makeReport(3);
        
        EmployeeServer server = new EmployeeServer();
        EmployeeWithNotification e1 = new EmployeeWithNotification();
        server.addEmployee(e1);
        server.businessLogic();
    }
    
}
