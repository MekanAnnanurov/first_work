package com.epam.javacollections.maintask.flower;

/**
 * Created by Mekan on 15.12.2019.
 */
public class Flower {

    private int freshness;
    private int leafStalkLength;
    private int price;

    public Flower(int freshness, int leafStalkLength, int price) {
        this.freshness = freshness;
        this.leafStalkLength = leafStalkLength;
        this.price = price;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public int getLeafStalkLength() {
        return leafStalkLength;
    }

    public void setLeafStalkLength(int leafStalkLength) {
        this.leafStalkLength = leafStalkLength;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "freshness=" + freshness +
                ", leafStalkLength=" + leafStalkLength +
                ", price=" + price +
                '}';
    }
}
