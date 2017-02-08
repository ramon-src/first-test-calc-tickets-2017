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

    @Before
    public void setUp() {
        child = new Child();
        discountChild = new DiscountChild();
        ticket = new Ticket(child);
    }

    @Test
    public void getChildTicketPrice5_5AtSunday() {
        double totalPriceResulted = discountChild.calculate(ticket, 1);
        Assert.assertEquals(5.5, totalPriceResulted, 0.1);
    }
    @Test
    public void getChildTicketPrice4_95AtMonday() {
        double totalPriceResulted = discountChild.calculate(ticket, 2);
        Assert.assertEquals(4.95, totalPriceResulted, 0.1);
    }
    @Test
    public void getChildTicketPrice4_67AtTuesday() {
        double totalPriceResulted = discountChild.calculate(ticket, 3);
        Assert.assertEquals(4.67, totalPriceResulted, 0.1);
    }
    @Test
    public void getChildTicketPrice3_85AtWednesday() {
        double totalPriceResulted = discountChild.calculate(ticket, 4);
        Assert.assertEquals(3.85, totalPriceResulted, 0.1);
    }
    @Test
    public void getChildTicketPrice5_5AtThursday() {
        double totalPriceResulted = discountChild.calculate(ticket, 5);
        Assert.assertEquals(5.5, totalPriceResulted, 0.1);
    }
    @Test
    public void getChildTicketPrice4_89AtFriday() {
        double totalPriceResulted = discountChild.calculate(ticket, 6);
        Assert.assertEquals(4.89, totalPriceResulted, 0.1);
    }
    @Test
    public void getChildTicketPrice5_5AtSaturday() {
        double totalPriceResulted = discountChild.calculate(ticket, 7);
        Assert.assertEquals(5.5, totalPriceResulted, 0.1);
    }
}