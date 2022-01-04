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
import java.util.ArrayList;
class EmployeeServer {

    ArrayList<Employee> subs;
    boolean noticeUploaded = false;

    public EmployeeServer() {
        subs = new ArrayList<Employee>();
    }

    public void addEmployee(Employee s) {
        subs.add(s);
    }

    public void removeEmployee(Employee s) {
        subs.remove(s);
    }

    public void notifyEmployees() {
        for (Employee e : subs) {
            e.doNotify();
        }
    }

    public void businessLogic() {
        noticeUploaded = true;
        if (noticeUploaded) {
            notifyEmployees();
        }

    }
}

interface Employee {

    public void doNotify();
}

class EmployeeWithNotification implements Employee {

    public void doNotify() {
        System.out.println("notice");
    }
}

public class notification {
    
}
