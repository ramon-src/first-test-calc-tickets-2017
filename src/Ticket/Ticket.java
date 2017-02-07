package Ticket;

import Person.Person;
import Person.Child;
import Person.Student;

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
        return 0.0;
    }
}
