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
    public void getStudentTicketPrice7_20AtMonday() {
        double totalPriceResulted = discountStudent.calculate(ticket, 2);
        Assert.assertEquals(7.2, totalPriceResulted, 0.1);
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