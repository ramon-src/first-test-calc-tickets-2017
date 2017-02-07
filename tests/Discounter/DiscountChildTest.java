package Discounter;

import Person.Child;
import Ticket.Ticket;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiscountChildTest {

    Child child;
    DiscountChild discountChild;
    Ticket ticket;
    double ticketPrice;

    @Before
    public void setUp() {
        child = new Child();
        discountChild = new DiscountChild();
        ticket = new Ticket(child);
        ticketPrice = ticket.getPriceByPerson();
    }

    @Test
    public void getChildTicketPrice4_89AtFriday() {
        double totalPriceResulted = discountChild.calculate(ticket, 6);
        Assert.assertEquals(4.89, totalPriceResulted, 0.1);
    }
}