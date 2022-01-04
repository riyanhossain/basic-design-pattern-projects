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
class Caretaker {

    public void performTask1() {
        System.out.println("Light replaced");

    }
    public void performTask2() {
        System.out.println("AC Fixed");

    }
}

class Gatekepper {

    public void performTask1() {
        System.out.println("gate closed");

    }
    public void performTask2() {
        System.out.println("gate open");

    }
}

class Staff {

    public void performTask1() {
        System.out.println("Clened");

    }
}

class EmployeeManager {

    public void makeReport(int i) {
        switch (i) {
            case 1:
                new Caretaker().performTask1();
                break;
            case 2:
                new Gatekepper().performTask2();
                break;
            case 3:
                new Staff().performTask1();
                break;
        }
    }
}

public class employee {
    
}
