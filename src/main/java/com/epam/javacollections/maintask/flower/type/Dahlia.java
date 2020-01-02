package com.epam.javacollections.maintask.flower.type;

/**
 * Created by Mekan on 15.12.2019.
 */
public class Dahlia extends HothouseFlower {

    private Dahlia(int freshness, int bodyLength, int price) {
        super(freshness, bodyLength, price);
    }

    public Dahlia(){
        super (1,(int) (2 + Math.random()) * 23, 3);
    }

    @Override
    public String toString() {
        String day = " day";
        if (this.getFreshness() > 1) {
            day = " day";
        }
        return "This Dahlia freshness " + this.getFreshness() + day + ", body length is" + this.getLeafStalkLength() +" cm.,"
                + "price:" + "$" + this.getPrice() + "\n";
    }
}
