package com.epam.javacollections.maintask.flower.type;

/**
 * Created by Mekan on 15.12.2019.
 */
public class RoseFlower extends HothouseFlower{

    public RoseFlower(int freshness, int bodyLength, int price) {
        super(freshness, bodyLength, price);
    }

    public RoseFlower() {
        super(4,(int)(15 + (Math.random() * 9)),3);
    }

    @Override
    public String toString() {
        String day = " day";
        if (getFreshness() > 1){
            day = " day";
        }
        return "This ROSE freshness is " + getFreshness() + day + ", stem length is " + getLeafStalkLength() + " cm., " +
                "price:" + " $" + getPrice() + ". \n";
    }
}
