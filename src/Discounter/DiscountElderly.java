package Discounter;

import Person.Person;
import Person.Elderly;
import Ticket.Ticket;

public class DiscountElderly extends Discount {

    public double calculate(Ticket ticket, int day) {
        double ticketPrice = ticket.getPriceByPerson();
        if (ticket.getPerson() instanceof Elderly) {
            if (day == 2)
                return calculateTotalPrice(0.1, ticketPrice);
            if (day == 3)
                return calculateTotalPrice(0.15, ticketPrice);
            if (day == 4)
                return calculateTotalPrice(0.4, ticketPrice);
            if (day == 5)
                return calculateTotalPrice(0.3, ticketPrice);

            if (isWeekend(day))
                return calculateTotalPrice(0.05, ticketPrice);
        }
        return calculateTotalPrice(0.0, ticketPrice);
    }

}
