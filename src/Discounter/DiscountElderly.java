package Discounter;

import Person.Person;
import Person.Elderly;
import Ticket.Ticket;

public class DiscountElderly extends Discount {

    public double calculate(Ticket ticket, Integer day) {
        double ticketPrice = ticket.getPriceByPerson();

        if (ticket.getPerson() instanceof Elderly) {
            if (day.equals(WeekDay.MONDAY))
                return calculateTotalPrice(0.1, ticketPrice);

            if (day.equals(WeekDay.TUESDAY))
                return calculateTotalPrice(0.15, ticketPrice);

            if (day.equals(WeekDay.WEDNESDAY))
                return calculateTotalPrice(0.4, ticketPrice);

            if (day.equals(WeekDay.THURSDAY))
                return calculateTotalPrice(0.3, ticketPrice);

            if (isWeekend(day))
                return calculateTotalPrice(0.05, ticketPrice);
        }
        return calculateTotalPrice(0.0, ticketPrice);
    }

}
