package com.epam.javacollections.maintask.bouquet;

import com.epam.javacollections.maintask.flower.Flower;
import com.epam.javacollections.maintask.flower.type.Dahlia;
import com.epam.javacollections.maintask.flower.type.Lily;
import com.epam.javacollections.maintask.flower.type.RoseFlower;
import com.epam.javacollections.maintask.material.GreetingCard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mekan on 15.12.2019.
 */
public class Bouquet {
    private List<Flower> flowers;
    private List<GreetingCard> greetingCards;

    public Bouquet(int roseFlowerCount, int dahliaCount, int lilyCount, boolean isGreetingCardExist) {
        flowers = new ArrayList<>();
        greetingCards = new ArrayList<>();
        for (int i = 0; i < roseFlowerCount; i++) {
            flowers.add(new RoseFlower());
        }
        for (int i = 0; i < dahliaCount; i++) {
            flowers.add(new Dahlia());
        }
        for (int i = 0; i < lilyCount; i++) {
            flowers.add(new Lily());
        }
        if (isGreetingCardExist) {
            greetingCards.add(new GreetingCard());
        }
    }

    public Bouquet(List<Flower> flowers, List<GreetingCard> greetingCards) {
        this.flowers = flowers;
        this.greetingCards = greetingCards;
    }

    @Override
    public String toString() {
        String result = "MyBouquet: \n";
        for (int i = 0; i < flowers.size(); i++) {
            result += flowers.get(i);
        }
        for (int i = 0; i < greetingCards.size(); i++) {
            result += greetingCards.get(i);
        }
        return result;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public int getPrice() {
        int result = 0;
        for (int i = 0; i < flowers.size(); i++) {
            result += flowers.get(i).getPrice();
        }
        for (int i = 0; i < greetingCards.size(); i++) {
            result += greetingCards.get(i).getPrice();
        }
        return result;
    }

    public List<Flower> sortFlowers() {
        for (int j = flowers.size() - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (flowers.get(i).getFreshness() > flowers.get(i + 1).getFreshness()) {
                    Flower temp = flowers.get(i);
                    flowers.set(i, flowers.get(i + 1));
                    flowers.set(i + 1, temp);
                }
            }
        }
        return flowers;
    }

    public String findLeafStalkLength(int minLength, int maxLength) {
        String result = "Body Length:" + minLength + "-" + maxLength + "cm. \n";
        for (int i = 0; i < flowers.size(); i++) {
            if (flowers.get(i).getLeafStalkLength() >= minLength && flowers.get(i).getLeafStalkLength() <= maxLength) {
                result += flowers.get(i);
            }
        }
        return result;
    }
}
