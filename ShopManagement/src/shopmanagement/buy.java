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
import java.util.ArrayList;

interface Product {

    public ArrayList<Integer> accept(Visitor v);

    public Integer getPrice();
}

class Cake implements Product {

    private Integer price;

    public Cake() {
        this.price = 100;
    }

    public Integer getPrice() {
        return this.price;
    }

    public ArrayList<Integer> accept(Visitor v) {
        return v.visit(this);
    }
}

class Biscuit implements Product {

    private Integer price;

    public Biscuit() {
        this.price = 50;
    }

    public Integer getPrice() {
        return this.price;
    }

    public ArrayList<Integer> accept(Visitor v) {
        return v.visit(this);
    }
}

interface Visitor {

    public ArrayList<Integer> visit(Product p);
}

class ShoppingVisitor implements Visitor {

    private ArrayList<Integer> priceList;

    public ShoppingVisitor() {
        priceList = new ArrayList<Integer>();
    }

    public ArrayList<Integer> visit(Product p) {
        priceList.add(p.getPrice());
        return priceList;

    }
}
public class buy {
    
}
