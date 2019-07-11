package com.f1soft.esewa.resource.nepalicalendar

import java.util.*

/**
 * Simple CustomDate class to store the tuple (year, month, day).
 *
 * Days and months start at index 1. So sunday is 1, Baisakh is 1 and January is 1.
 */
class CustomDate {
    var year = 0
    var month = 0
    var day = 0

    val calendar: Calendar
        get() {
            val c = Calendar.getInstance()
            c.clear()
            c.set(year, month - 1, day)
//            c.timeZone = TimeZone.getTimeZone("GMT+5:45")
            return c
        }

    constructor(year: Int, month: Int, day: Int) {
        this.year = year
        this.month = month
        this.day = day
    }

    constructor(calendar: Calendar) {
        year = calendar.get(Calendar.YEAR)
        month = calendar.get(Calendar.MONTH) + 1
        day = calendar.get(Calendar.DAY_OF_MONTH)
    }

    fun convertToNepali() = getNepaliDate(this)
    fun convertToEnglish() = getEnglishDate(this)
    fun getDaysTill(newDate: CustomDate) = ((newDate.calendar.timeInMillis - calendar.timeInMillis) / (24 * 60 * 60 * 1000)).toInt() + 1
    override fun toString() = String.format("%04d-%02d-%02d", year, month, day)
}
