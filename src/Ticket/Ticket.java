package Ticket;

import Person.Person;
import Person.Child;
import Person.Student;
import Person.Elderly;

public class Ticket {

    private Person person;
    private String date;
    private double price;
    private double totalPrice;

    public Ticket(Person person){
        this.person = person;
    }
    public Ticket(Person person, String date){
        this.person = person;
        this.date = date;
    }

    public double getPriceByPerson() {
        if (person instanceof Child) {
            return 5.5;
        }
        if (person instanceof Student) {
            return 8.0;
        }
        if (person instanceof Elderly) {
            return 6.0;
        }
        return 0.0;
    }

    public Person getPerson() {
        return person;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
