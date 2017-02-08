package Discounter;

import Person.Person;
import Person.Student;
import Ticket.Ticket;

public class DiscountStudent extends Discount {

    public double calculate(Ticket ticket, Integer day) {
        Person person = ticket.getPerson();
        double ticketPrice = ticket.getPriceByPerson();

        if (person instanceof Student) {

            if(((Student) person).hasCard() && !isWeekend(day))
                return calculateTotalPrice(0.35, ticketPrice);

            if (day.equals(WeekDay.MONDAY))
                return calculateTotalPrice(0.1, ticketPrice);

            if (day.equals(WeekDay.TUESDAY))
                return calculateTotalPrice(0.05, ticketPrice);

            if (day.equals(WeekDay.WEDNESDAY))
                return calculateTotalPrice(0.5, ticketPrice);

            if (day.equals(WeekDay.THURSDAY))
                return calculateTotalPrice(0.3, ticketPrice);
        }
        return calculateTotalPrice(0.0, ticketPrice);
    }

}
