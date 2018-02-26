package com.company;

public class Main {

    public static void main(String[] args) {


        Hamburger hamburger = new Hamburger("Basic", "Salami", 3.56, "White");
        hamburger.addHamburgerAddition1("Lettuce", 1.52);
        hamburger.addHamburgerAddition2("Bacon", 3.46);
        hamburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Falafel", 7.25);
        healthyBurger.addHealthAddition1("Rucola", 1.26);
        healthyBurger.addHealthAddition2("Cheese", 2.54);
        healthyBurger.itemizeHamburger();

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("Lettuce", 1.52);
        deluxeBurger.itemizeHamburger();

    }
}
