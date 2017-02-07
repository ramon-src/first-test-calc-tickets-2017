package Discounter;

import Person.Elderly;
import Ticket.Ticket;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiscountElderlyTest {

    Elderly elderly;
    DiscountElderly discountElderly;
    Ticket ticket;

    @Before
    public void setUp() {
        elderly = new Elderly();
        discountElderly = new DiscountElderly();
        ticket = new Ticket(elderly);
    }

    @Test
    public void getElderlyTicketPrice5_70AtSunday() {
        double totalPriceResulted = discountElderly.calculate(ticket, 1);
        Assert.assertEquals(5.70, totalPriceResulted, 0.1);
    }
    @Test
    public void getElderlyTicketPrice5_40AtMonday() {
        double totalPriceResulted = discountElderly.calculate(ticket, 2);
        Assert.assertEquals(5.40, totalPriceResulted, 0.1);
    }

    @Test
    public void getElderlyTicketPrice5_10AtTuesday() {
        double totalPriceResulted = discountElderly.calculate(ticket, 3);
        Assert.assertEquals(5.10, totalPriceResulted, 0.1);
    }
    @Test
    public void getElderlyTicketPrice3_59AtWednesday() {
        double totalPriceResulted = discountElderly.calculate(ticket, 4);
        Assert.assertEquals(3.59, totalPriceResulted, 0.1);
    }

    @Test
    public void getElderlyTicketPrice4_20AtThursday() {
        double totalPriceResulted = discountElderly.calculate(ticket, 5);
        Assert.assertEquals(4.20, totalPriceResulted, 0.1);
    }
    @Test
    public void getElderlyTicketPrice6AtFriday() {
        double totalPriceResulted = discountElderly.calculate(ticket, 6);
        Assert.assertEquals(6.0, totalPriceResulted, 0.1);
    }
    @Test
    public void getElderlyTicketPrice5_70AtSaturday() {
        double totalPriceResulted = discountElderly.calculate(ticket, 7);
        Assert.assertEquals(5.70, totalPriceResulted, 0.1);
    }

}