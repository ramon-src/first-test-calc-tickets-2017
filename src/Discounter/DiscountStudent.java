package Discounter;

import Person.Person;
import Person.Student;
import Ticket.Ticket;

public class DiscountStudent extends Discount {
    /**
     * Calendar c = Calendar.getInstance();
     c.setTime(yourDate);
     int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
     * @param day
     * @return
     */
    public double calculate(Ticket ticket, int day) {
        Person person = ticket.getPerson();
        double ticketPrice = ticket.getPriceByPerson();

        if (person instanceof Student) {

            if(((Student) person).hasCard() && !isWeekend(day))
                return calculateTotalPrice(0.35, ticketPrice);
            if (day == 2)
                return calculateTotalPrice(0.1, ticketPrice);
            if (day == 3)
                return calculateTotalPrice(0.05, ticketPrice);
            if (day == 4)
                return calculateTotalPrice(0.5, ticketPrice);
            if (day == 5)
                return calculateTotalPrice(0.3, ticketPrice);
        }
        return calculateTotalPrice(0.0, ticketPrice);
    }

}
