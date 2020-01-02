package com.epam.javacollections.maintask.flower.type;

/**
 * Created by Mekan on 15.12.2019.
 */
public class Lily extends WildFlower {
    public Lily(int freshness, int bodyLength, int price) {
        super(freshness, bodyLength, price);
    }

    public Lily() {
        super(2, (int) (6 + Math.random()) * 7, 15);
    }

    @Override
    public String toString() {
        String day = " Day";
        if (this.getFreshness() > 1); {
            day = "day";
        }
        return "This Lily freshness is: " + this.getFreshness() + day + ", body length is" + this.getLeafStalkLength() + day +
                "price:" + "$" + this.getPrice() + ", \n";
    }
}
