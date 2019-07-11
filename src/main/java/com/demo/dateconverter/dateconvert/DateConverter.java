package com.demo.dateconverter.dateconvert;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author: Milan Paudyal
 * @Date: 1/28/19,Mon
 **/

public class DateConverter {
    public static void main(String[] args) {
/*
        CustomDate customDate = new CustomDate(1997, 01, 01);
        System.out.println("Nepali Date " + DateUtils.getNepaliDate(customDate));
        customDate = new CustomDate(2053, 6, 15);
        System.out.println("English Date " + DateUtils.getEnglishDate(customDate));
*/

        Date d = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(d);

        //CustomDate customDate1 = new CustomDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1 , c.get(Calendar.DAY_OF_MONTH));
        CustomDate customDate1 = new CustomDate(2054, 15 , -1);
        System.out.println(customDate1);
        System.out.println("nE DATE " + DateUtils.getEnglishDate(customDate1));
    }
}
