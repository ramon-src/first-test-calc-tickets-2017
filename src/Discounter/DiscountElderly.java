package Discounter;

import Person.Person;
import Person.Elderly;

public class DiscountElderly extends Discount {

    public double calculate(Person person, double price, int day) {
        if (person instanceof Elderly) {
            if (day == 2)
                return calculateTotalPrice(0.1, price);
            if (day == 3)
                return calculateTotalPrice(0.15, price);
            if (day == 4)
                return calculateTotalPrice(0.4, price);
            if (day == 5)
                return calculateTotalPrice(0.3, price);

            if (isWeekend(day))
                return calculateTotalPrice(0.05, price);
        }
        return calculateTotalPrice(0.0, price);
    }

}
