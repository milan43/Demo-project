package com.demo.dateconverter.dateconvert;

import kotlin.jvm.internal.Intrinsics;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

/**
 * @Author: Milan Paudyal
 * @Date: 1/28/19,Mon
 **/

public final class CustomDate {
    private int year;
    private int month;
    private int day;

    public CustomDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public CustomDate(Calendar calendar) {
        if (Objects.nonNull(calendar)) {
            this.year = calendar.get(Calendar.YEAR);
            this.month = calendar.get(Calendar.MONTH) + 1;
            this.day = calendar.get(Calendar.DAY_OF_MONTH);
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public final Calendar getCalendar() {
        Calendar c = Calendar.getInstance();
        c.clear();
        c.set(this.year, this.month - 1, this.day);
        Intrinsics.checkExpressionValueIsNotNull(c, "c");
        return c;
    }

    public final CustomDate convertToNepali() {
        return DateUtils.getNepaliDate(this);
    }

    public final CustomDate convertToEnglish() {
        return DateUtils.getEnglishDate(this);
    }

    public final int getDaysTill(CustomDate newDate) {
        Intrinsics.checkParameterIsNotNull(newDate, "newDate");
        if (Objects.nonNull(newDate)) {
            return (int) ((newDate.getCalendar().getTimeInMillis() - this.getCalendar().getTimeInMillis()) / (long) 86400000) + 1;
        }
        return 0;
    }

    public String toString() {
        String var2 = "%04d-%02d-%02d";
        Object[] var3 = new Object[]{this.year, this.month, this.day};
        String var10000 = String.format(var2, Arrays.copyOf(var3, var3.length));
        Intrinsics.checkExpressionValueIsNotNull(var10000, "java.lang.String.format(format, *args)");
        return var10000;
    }
}

