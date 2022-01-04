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

interface Request {

    public ArrayList<Integer> accept(Visitor v);

    public Integer getAmount();
}

class Mirpur implements Request {

    private Integer amount;

    public Mirpur() {
        this.amount = 100;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public ArrayList<Integer> accept(Visitor v) {
        return v.visit(this);
    }
}
class Dhanmondi implements Request {

    private Integer amount;

    public Dhanmondi() {
        this.amount = 100;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public ArrayList<Integer> accept(Visitor v) {
        return v.visit(this);
    }
}

interface Visitor {

    public ArrayList<Integer> visit(Request p);
}

class RiderVisitor implements Visitor {

    private ArrayList<Integer> amountList;

    public RiderVisitor() {
        amountList = new ArrayList<Integer>();
    }

    public ArrayList<Integer> visit(Request p) {
        amountList.add(p.getAmount());
        return amountList;

    }
}
public class Ride {
    
}
