package Ticket;

import Person.Child;
import Person.Elderly;
import Person.Student;
import junit.framework.Assert;
import org.junit.Test;

import java.text.ParseException;

public class TicketGeneratorTest {

    @Test
    public void generateATicket() throws ParseException {
        Assert.assertTrue(TicketGenerator.createTicket("child", "11/02/1995") instanceof Ticket);
    }
    @Test
    public void ticketCreatedIsForAChild() throws ParseException {
        Ticket ticket = TicketGenerator.createTicket("child", "11/02/1995");
        Assert.assertTrue(ticket.getPerson() instanceof Child);
    }
    @Test
    public void ticketCreatedIsForAElderly() throws ParseException {
        Ticket ticket = TicketGenerator.createTicket("elderly", "11/02/1995");
        Assert.assertTrue(ticket.getPerson() instanceof Elderly);
    }
    @Test
    public void ticketCreatedIsForAStudent() throws ParseException {
        Ticket ticket = TicketGenerator.createTicket("student", "11/02/1995");
        Assert.assertTrue(ticket.getPerson() instanceof Student);
    }

    @Test(expected=ParseException.class)
    public void invalidDate() throws ParseException {
        TicketGenerator.createTicket("student", "11-02-1995");
    }

}
