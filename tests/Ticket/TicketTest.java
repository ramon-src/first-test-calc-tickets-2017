package Ticket;

import Person.Child;
import Person.Student;
import Person.Elderly;
import org.junit.Assert;
import org.junit.Test;

public class TicketTest {

    @Test
    public void getPersonChildFromTicket() {
        Child child = new Child();
        Ticket ticket = new Ticket(child);
        Assert.assertSame(child, ticket.getPerson());
    }
    @Test
    public void getPriceOfChildTicket5_5() {
        Ticket ticket = new Ticket(new Child());
        Assert.assertEquals(5.5, ticket.getPriceByPerson(), 0.1);
    }

    @Test
    public void getPriceOfStudentTicket8_0() {
        Ticket ticket = new Ticket(new Student());
        Assert.assertEquals(8.0, ticket.getPriceByPerson(), 0.1);
    }

    @Test
    public void getPriceOfElderlyTicket5_5() {
        Ticket ticket = new Ticket(new Elderly());
        Assert.assertEquals(6.0, ticket.getPriceByPerson(), 0.1);
    }
}
