package Ticket;

import Person.Person;
import Person.Child;
import Person.Student;
import Person.Elderly;

import java.util.Calendar;

public class Ticket {

    private Person person;

    public Ticket(Person person) {
        this.person = person;
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
}
