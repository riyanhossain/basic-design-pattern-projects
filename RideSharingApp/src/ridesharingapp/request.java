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


interface ButtonCommand {

    public void execute();
}

class RequestButtonCommand implements ButtonCommand {

    public void execute() {
        System.out.println("Ride finished,Rider is requested for payment!");
    }
}

class DelineButtonCommand implements ButtonCommand {

    public void execute() {
        System.out.println("Ride finished,payment delined!");
    }
}

//invoker
class WindowForm {

     private ButtonCommand command;

    public void setCommand(ButtonCommand bc) {
        this.command = bc;
    }

    public void executeCommand() {
        this.command.execute();
    }
}
public class request {
    
}
