package com.time;

import sun.util.calendar.CalendarUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.CancellationException;

public class DateUtils {

    /**
     *
     * @param birth 生日
     * @param start 受理日期
     * @return
     * @throws Exception
     */
    public static int daysBetween2Date(Date birth, Date start) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        if (start == null || birth == null) {
            throw new Exception("date is null");
        }

        String[] starts = sdf.format(start).split("-");
        String[] births = sdf.format(birth).split("-");

        births[0] = starts[0];

        int year = Integer.parseInt(starts[0]);

        if ("02".equals(births[1]) && "29".equals(births[2])) {
            if (!((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) { //平年
                births[2] = "28";
            }
        }

        String newBirthStr = String.join("-", births);
        Date newBirth = sdf.parse(newBirthStr);

        Calendar startCal = Calendar.getInstance();
        startCal.setTime(start);

        Calendar birthCal = Calendar.getInstance();
        birthCal.setTime(newBirth);

        int diff = birthCal.get(Calendar.DAY_OF_YEAR) - startCal.get(Calendar.DAY_OF_YEAR);

        return diff;
    }

    /**
     *
     * @param beginDate 生日
     * @param endDate 受理日期
     * @return
     */
    public static int getDayRange2(Date beginDate, Date endDate) {
        if (null == beginDate || null == endDate) {
            return -1;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String[] splits = sdf.format(beginDate).split("-");

        Calendar calendarBegin = Calendar.getInstance();
        Calendar calendarEnd = Calendar.getInstance();
        calendarBegin.setTime(beginDate);
        calendarEnd.setTime(endDate);

        int beginYear = calendarEnd.get(Calendar.YEAR);
        boolean isLeapYear = CalendarUtils.isGregorianLeapYear(beginYear);

        calendarBegin.set(Calendar.HOUR_OF_DAY, 0);
        calendarBegin.set(Calendar.MINUTE, 0);
        calendarBegin.set(Calendar.SECOND, 0);
        calendarBegin.set(Calendar.MILLISECOND, 0);
        calendarBegin.set(Calendar.YEAR, beginYear);

        calendarEnd.set(Calendar.HOUR_OF_DAY, 0);
        calendarEnd.set(Calendar.MINUTE, 0);
        calendarEnd.set(Calendar.SECOND, 0);
        calendarEnd.set(Calendar.MILLISECOND, 0);

        if (calendarBegin.getTime().compareTo(endDate) == -1) {
            return -1;
        }
        if (Integer.parseInt(splits[1]) == 2 && Integer.parseInt(splits[2]) == 29) {
            if (!isLeapYear) {
                calendarBegin.set(Calendar.MONTH, 1);
                calendarBegin.set(Calendar.DAY_OF_MONTH, 28);
            }
        }

        int startDay = (int) (calendarBegin.getTime().getTime() / (1000 * 60 * 60 * 24));
        int endDay = (int) (calendarEnd.getTime().getTime() / (1000 * 60 * 60 * 24));

        int dayRange = startDay - endDay;
        if (dayRange < 0) {
            return -1;
        }

        return dayRange;
    }

    public static int longOf2Date(Date birth, Date accept) {

        if (null == birth || null == accept) {
            return -1;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String[] splits = sdf.format(birth).split("-");

        Calendar acceptCalendar = Calendar.getInstance();
        acceptCalendar.setTime(accept);

        int year = acceptCalendar.get(Calendar.YEAR);
        boolean isLeapYear = CalendarUtils.isGregorianLeapYear(year);

        Calendar birthCalendar = Calendar.getInstance();
        birthCalendar.setTime(birth);
        birthCalendar.set(Calendar.YEAR, year);

        if (birthCalendar.getTime().compareTo(accept) == -1) {
            return -1;
        }

        if (Integer.parseInt(splits[1]) == 2 && Integer.parseInt(splits[2]) == 29) {
            if (!isLeapYear) {
                birthCalendar.set(Calendar.MONTH, 1);
                birthCalendar.set(Calendar.DAY_OF_MONTH, 28);
            }
        }

        int count = 0;
        while (acceptCalendar.getTime().compareTo(birthCalendar.getTime()) != 0) {
            acceptCalendar.add(Calendar.DATE, 1);
            count++;
        }
        return count;
    }

}
