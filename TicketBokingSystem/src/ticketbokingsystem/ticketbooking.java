/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketbokingsystem;

/**
 *
 * visitor
 * @author Asus
 */
import java.util.ArrayList;

interface  Ticket{

    public ArrayList<Integer> accept(Visitor v);

    public Integer getPrice();
}

class gopalpur implements Ticket {

    private Integer price;

    public gopalpur() {
        this.price = 400;
    }

    public Integer getPrice() {
        return this.price;
    }

    public ArrayList<Integer> accept(Visitor v) {
        return v.visit(this);
    }
}

class magura implements Ticket {

    private Integer price;

    public magura() {
        this.price = 350;
    }

    public Integer getPrice() {
        return this.price;
    }

    public ArrayList<Integer> accept(Visitor v) {
        return v.visit(this);
    }
}

interface Visitor {

    public ArrayList<Integer> visit(Ticket p);
}

class ShoppingVisitor implements Visitor {

    private ArrayList<Integer> priceList;

    public ShoppingVisitor() {
        priceList = new ArrayList<Integer>();
    }

    public ArrayList<Integer> visit(Ticket p) {
        priceList.add(p.getPrice());
        return priceList;

    }
}
public class ticketbooking {
    
}
