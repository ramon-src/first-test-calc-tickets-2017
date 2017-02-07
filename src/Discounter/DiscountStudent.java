package Discounter;

import Person.Person;
import Person.Student;

public class DiscountStudent extends Discount {
    /**
     * Calendar c = Calendar.getInstance();
     c.setTime(yourDate);
     int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
     * @param person
     * @param price
     * @param day
     * @return
     */
    public double calculate(Person person, double price, int day) {
        if (person instanceof Student) {
            if (day == 2)
                return calculateTotalPrice(0.1, price);
            if (day == 3)
                return calculateTotalPrice(0.05, price);
            if (day == 4)
                return calculateTotalPrice(0.5, price);
            if (day == 5)
                return calculateTotalPrice(0.3, price);
        }
        return calculateTotalPrice(0.0, price);
    }


}
