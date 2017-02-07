package Discounter;

import Person.Person;

public abstract class Discount {
    public abstract double calculate(Person person, double price, int day);

    public double calculateTotalPrice(double discount, double price) {
        return price - (price * discount);
    }
}
