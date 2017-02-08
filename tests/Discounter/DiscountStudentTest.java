package Discounter;

import Person.Student;
import Ticket.Ticket;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiscountStudentTest {

    Student student;
    DiscountStudent discountStudent;
    Ticket ticket;

    @Before
    public void setUp() {
        student = new Student();
        discountStudent = new DiscountStudent();
        ticket = new Ticket(student);
    }

    @Test
    public void getStudentTicketPrice8_0AtSunday() {
        double totalPriceResulted = discountStudent.calculate(ticket, 1);
        Assert.assertEquals(8.0, totalPriceResulted, 0.1);
    }

    @Test
    public void getStudentTicketPrice7_20AtMonday() {
        double totalPriceResulted = discountStudent.calculate(ticket, 2);
        Assert.assertEquals(7.2, totalPriceResulted, 0.1);
    }

    @Test
    public void getStudentTicketPrice7_60AtTuesday() {
        double totalPriceResulted = discountStudent.calculate(ticket, 3);
        Assert.assertEquals(7.6, totalPriceResulted, 0.1);
    }

    @Test
    public void getStudentTicketPrice4_0AtWednesday() {
        double totalPriceResulted = discountStudent.calculate(ticket, 4);
        Assert.assertEquals(4.0, totalPriceResulted, 0.1);
    }

    @Test
    public void getStudentTicketPrice5_6AtThursday() {
        double totalPriceResulted = discountStudent.calculate(ticket, 5);
        Assert.assertEquals(5.6, totalPriceResulted, 0.1);
    }

    @Test
    public void getStudentTicketPrice8_0AtFriday() {
        double totalPriceResulted = discountStudent.calculate(ticket, 6);
        Assert.assertEquals(8.0, totalPriceResulted, 0.1);
    }

    @Test
    public void getStudentTicketPrice8_0AtSaturday() {
        double totalPriceResulted = discountStudent.calculate(ticket, 7);
        Assert.assertEquals(8.0, totalPriceResulted, 0.1);
    }

    @Test
    public void getStudentTicketPrice5_20WithStudentCard() {
        Student studentWithCard = new Student();

        studentWithCard.setCardToTrue();
        ticket = new Ticket(studentWithCard);
        double totalPriceResulted = discountStudent.calculate(ticket, 2);
        Assert.assertEquals(5.2, totalPriceResulted, 0.1);
    }


}