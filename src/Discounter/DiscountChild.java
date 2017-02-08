package Discounter;

import Person.Child;
import Ticket.Ticket;

public class DiscountChild extends Discount {

    public double calculate(Ticket ticket, Integer day) {
        double ticketPrice = ticket.getPriceByPerson();

        if (ticket.getPerson() instanceof Child) {
            if (day.equals(WeekDay.MONDAY))
                return calculateTotalPrice(0.1, ticketPrice);

            if (day.equals(WeekDay.TUESDAY))
                return calculateTotalPrice(0.15, ticketPrice);

            if (day.equals(WeekDay.WEDNESDAY))
                return calculateTotalPrice(0.3, ticketPrice);

            if (day.equals(WeekDay.FRIDAY))
                return calculateTotalPrice(0.11, ticketPrice);
        }
        return calculateTotalPrice(0.0, ticketPrice);
    }
}
