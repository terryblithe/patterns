package com.time;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@RunWith(JUnit4.class)
public class DateUtilsTest {

    @Test
    public void testDaysBt2Date() throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date birth = sdf.parse("2000-02-29");
        Date d = sdf.parse("2001-02-28");

        //int diff = DateUtils.daysBetween2Date(d, birth);
        int diff = DateUtils.daysBetween2Date(birth, d);
        System.out.println(diff);

        int diff2 = DateUtils.getDayRange2(birth, d);
        //int diff2 = DateUtils.getDayRange2(d, birth);

        System.out.println(diff2);

        int l = DateUtils.longOf2Date(birth, d);
        System.out.println(l);

        /*Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(2018, 2, 28));

        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));*/

    }


}
