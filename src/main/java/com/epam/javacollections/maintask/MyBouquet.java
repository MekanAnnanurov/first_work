package com.epam.javacollections.maintask;

import com.epam.javacollections.maintask.bouquet.Bouquet;
import com.epam.javacollections.maintask.flower.Flower;
import com.epam.javacollections.maintask.flower.type.RoseFlower;
import com.epam.javacollections.maintask.material.GreetingCard;


import java.util.Arrays;
import java.util.List;

/**
 * Created by Mekan on 15.12.2019.
 */
public class MyBouquet {
    public static void main(String[] args) {
        System.out.println("Here are some flowers:");

        Flower roseFlower = new RoseFlower();
        System.out.println(roseFlower);

        Flower roseFlowerBlue = new RoseFlower();
        System.out.println(roseFlowerBlue);

        Flower roseFlowerWhite = new RoseFlower(4, 25, 12);
        System.out.println(roseFlowerWhite);

        List<Flower> flowers = Arrays.asList(roseFlower, roseFlowerBlue, roseFlowerWhite);
        List<Flower> flowersWithoutRoseLowerBlue = Arrays.asList(roseFlower, roseFlowerBlue);
        List<GreetingCard> greetingCards = Arrays.asList(new GreetingCard(), new GreetingCard("Happy birthday", 10));
        List<GreetingCard> greetingCard2 = Arrays.asList(new GreetingCard());


        System.out.println("Bouquet with accessory and it's price: ");
        Bouquet myBouquet = new Bouquet(3,4,15, false);
        System.out.println(myBouquet);
        System.out.println("This bouquet price is $" + myBouquet);

        Bouquet bouquet2 = new Bouquet(flowers, greetingCards);
        Bouquet bouquet3 = new Bouquet(flowersWithoutRoseLowerBlue, greetingCard2);
        System.out.println(bouquet2);
        System.out.println(bouquet3);

        System.out.println("Sorted bouquet by freshness of flowers:");
        myBouquet.sortFlowers();
        System.out.println(myBouquet);
        System.out.println("This bouquet price is $" + myBouquet.getPrice() + ".");

        System.out.println("Here we find flowers in our bouquet with given stem length:");
        System.out.println(myBouquet.findLeafStalkLength(30, 60));

    }
}

