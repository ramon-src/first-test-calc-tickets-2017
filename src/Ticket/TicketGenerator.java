package Ticket;

import Discounter.Discount;
import Discounter.DiscountChild;
import Discounter.DiscountElderly;
import Discounter.DiscountStudent;
import Person.Person;
import Person.Child;
import Person.Elderly;
import Person.Student;

import java.text.ParseException;

public class TicketGenerator {

    private static Person person;
    private static Discount discount;
    private static DateMan dateMan;

    private TicketGenerator() {
    }

    public static Ticket createTicket(String newPerson, String date) throws ParseException {
        if (newPerson.equals("child")) {
            person = new Child();
            discount = new DiscountChild();
        }
        if (newPerson.equals("elderly")) {
            person = new Elderly();
            discount = new DiscountElderly();
        }
        if (newPerson.equals("student")) {
            person = new Student();
            discount = new DiscountStudent();
        }

        Ticket ticket = new Ticket(person, date);
        dateMan = new DateMan(date);
        double totalPrice = discount.calculate(ticket, dateMan.getWeekDay());
        ticket.setTotalPrice(totalPrice);

        return ticket;
    }

}

