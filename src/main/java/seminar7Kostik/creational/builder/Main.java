package seminar7Kostik.creational.builder;

import seminar7Kostik.creational.builder.builder.BusinessCard;
import seminar7Kostik.creational.builder.builder.BusinessCardBuilder;
import seminar7Kostik.creational.builder.builder.SmallBusinessCardBuilder;

public class Main {
    public static void main(String[] args) {
        BusinessCardBuilder builder= new SmallBusinessCardBuilder();
        BusinessCard card = builder.build();
        System.out.println(card);
    }
}
