package Discounter;

import Person.Person;

public abstract class Discount {
    public abstract double calculate(Person person, double price, int day);

    public double calculateTotalPrice(double discount, double price) {
        return price - (price * discount);
    }
    public boolean isWeekend(int day){
        return (day == 1 || day == 7);
    }
}
