package Discounter;

import Person.Person;
import Person.Child;
import Ticket.Ticket;

public class DiscountChild extends Discount {

    public double calculate(Ticket ticket, int day) {
        double ticketPrice = ticket.getPriceByPerson();

        if (ticket.getPerson() instanceof Child) {
            if (day == 2)
                return calculateTotalPrice(0.1, ticketPrice);
            if (day == 3)
                return calculateTotalPrice(0.15, ticketPrice);
            if (day == 4)
                return calculateTotalPrice(0.3, ticketPrice);

            if (day == 6)
                return calculateTotalPrice(0.11, ticketPrice);
        }
        return calculateTotalPrice(0.0, ticketPrice);
    }
}
