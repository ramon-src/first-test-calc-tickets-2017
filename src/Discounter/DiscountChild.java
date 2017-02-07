package Discounter;

import Person.Person;
import Person.Child;

public class DiscountChild extends Discount {

    public double calculate(Person person, double price, int day) {
        if (person instanceof Child) {
            if (day == 2)
                return calculateTotalPrice(0.1, price);
            if (day == 3)
                return calculateTotalPrice(0.15, price);
            if (day == 4)
                return calculateTotalPrice(0.3, price);

            if (day == 6)
                return calculateTotalPrice(0.11, price);
        }
        return calculateTotalPrice(0.0, price);
    }
}
