package com.company;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe Burger", "Sausage & Bacon", 15.32, "White");
        super.addHamburgerAddition1("Chips", 4.20);
        super.addHamburgerAddition2("Drink", 3.25);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add addition to this burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add addition to this burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add addition to this burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add addition to this burger");
    }
}
