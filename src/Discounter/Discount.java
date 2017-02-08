package Discounter;

import Ticket.Ticket;

public abstract class Discount {

    public abstract double calculate(Ticket ticket, Integer day);

    public double calculateTotalPrice(double discount, double price) {
        return price - (price * discount);
    }

    public boolean isWeekend(Integer day){
        return (day.equals(WeekDay.SUNDAY) || day.equals(WeekDay.SATURDAY));
    }
}
