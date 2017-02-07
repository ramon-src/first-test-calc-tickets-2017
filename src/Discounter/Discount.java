package Discounter;

import Ticket.Ticket;

public abstract class Discount {
    public abstract double calculate(Ticket ticket, int day);

    public double calculateTotalPrice(double discount, double price) {
        return price - (price * discount);
    }
    public boolean isWeekend(int day){
        return (day == 1 || day == 7);
    }
}
