package com.epam.javacollections.maintask.material;

/**
 * Created by Mekan on 15.12.2019.
 */
public class GreetingCard {
    private String greetingCardName;
    private int price;

    public GreetingCard() {
        this.greetingCardName = "Congrats";
        this.price = 20;
    }

    public GreetingCard(String greetingCardName, int price) {
        this.greetingCardName = greetingCardName;
        this.price = price;
    }

    public String getGreetingCardName() {
        return greetingCardName;
    }

    public void setGreetingCardName(String greetingCardName) {
        this.greetingCardName = greetingCardName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "GreetingCard{" +
                "greetingCardName='" + greetingCardName + '\'' +
                ", price=" + price +
                '}';
    }
}
