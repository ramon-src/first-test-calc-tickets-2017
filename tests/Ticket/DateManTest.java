package Ticket;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.util.Date;

public class DateManTest {

    DateMan dateMan;

    @Before
    public void setUp(){
        dateMan = new DateMan();
    }

    @Test
    public void getDateFormattedFromDateString() throws ParseException {
        dateMan.setDate("11/02/2017");
        Assert.assertTrue(dateMan.stringToDate() instanceof Date);
    }
    @Test
    public void getWeekDay7FromSaturdayByAStringDate() throws ParseException {
        dateMan.setDate("11/02/2017");
        Assert.assertEquals(7, dateMan.getWeekDay());
    }

    @Test
    public void getWeekDay1FromSundayByAStringDate() throws ParseException {
        dateMan.setDate("12/02/2017");
        Assert.assertEquals(1, dateMan.getWeekDay());
    }
}
