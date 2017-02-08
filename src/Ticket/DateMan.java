package Ticket;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMan {

    private Calendar calendar;
    private String date;
    private Date dateMan;

    public DateMan() {

    }
    public DateMan(String date) throws ParseException {
        this.date = date;
        this.dateMan = stringToDate();
    }

    public Date stringToDate() throws ParseException {
        return new SimpleDateFormat("dd/M/yyyy").parse(date);
    }

    public int getWeekDay() throws ParseException {
        Date newDate = stringToDate();
        calendar = Calendar.getInstance();
        calendar.setTime(newDate);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    public Date getDate() {
        return dateMan;
    }
    public DateMan setDate(String date) {
        this.date = date;
        return this;
    }
}
