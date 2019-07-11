package com.f1soft.esewa.resource.nepalicalendar

import java.util.*

/**
 * Nepali date conversion utilities and database.
 */
/// Starting Nepali year that this database starts storing date from.
val startNepaliYear = 2000
val startEnglishDate = CustomDate(1943, 4, 14)

/**
 * CustomDate Database useful for converting from/to Nepali/English dates.
 *
 * Basically, this is an array of arrays. Each sub-array represents a year.
 * Each year contains number of days in each month as array of integers.
 */
val data = arrayOf(
        intArrayOf(30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31),
        intArrayOf(31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31),
        intArrayOf(30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31),
        intArrayOf(31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31),
        intArrayOf(31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31),
        intArrayOf(31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31),
        intArrayOf(31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30),
        intArrayOf(31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31),
        intArrayOf(31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30),
        intArrayOf(31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31),
        intArrayOf(31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31),
        intArrayOf(31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31),
        intArrayOf(30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31),
        intArrayOf(31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31),
        intArrayOf(30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31),
        intArrayOf(31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31),
        intArrayOf(30, 32, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31),
        intArrayOf(31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31),
        intArrayOf(31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30),
        intArrayOf(31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31),
        intArrayOf(31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30),
        intArrayOf(31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31),
        intArrayOf(31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31),
        intArrayOf(31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31),
        intArrayOf(31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31),
        intArrayOf(30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31),
        intArrayOf(31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31),
        intArrayOf(30, 32, 31, 32, 31, 31, 29, 30, 29, 30, 29, 31),
        intArrayOf(31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31),
        intArrayOf(31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31),
        intArrayOf(31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31),
        intArrayOf(31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30),
        intArrayOf(31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31),
        intArrayOf(31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31),
        intArrayOf(31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30),
        intArrayOf(31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30),
        intArrayOf(31, 31, 32, 32, 31, 30, 30, 30, 29, 30, 30, 30),
        intArrayOf(30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30),
        intArrayOf(31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30),
        intArrayOf(31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30),
        intArrayOf(31, 32, 31, 32, 30, 31, 30, 30, 29, 30, 30, 30),
        intArrayOf(30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30),
        intArrayOf(31, 31, 32, 31, 31, 31, 30, 30, 29, 30, 30, 30),
        intArrayOf(30, 31, 32, 32, 30, 31, 30, 30, 29, 30, 30, 30),
        intArrayOf(30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30),
        intArrayOf(30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30))


/**
 * Get {@return number of years} that this database stores.
 */
val numYears: Int
    get() = data.size

/**
 * Get {@return number of days} in given {@param year} and {@param month}.
 */
fun getNumDaysNepCal(year: Int, month: Int): Int {
    try {
        return data[year - startNepaliYear][month - 1]
    } catch (e: ArrayIndexOutOfBoundsException) {
        e.printStackTrace()
        return 0
    }
}

fun getNumDaysEngCal(year: Int, month: Int): Int {
    return GregorianCalendar(year, month, 1).getActualMaximum(Calendar.DAY_OF_MONTH)
}

/**
 * Convert English date to Nepali date.
 * @param engDate English date to convert from.
 * @return Corresponding Nepali date.
 */
fun getNepaliDate(engDate: CustomDate): CustomDate? {
    var days = startEnglishDate.getDaysTill(engDate) + 1
    for (i in 0 until numYears) {
        for (j in 0..11) {
            if (days > data[i][j])
                days -= data[i][j]
            else
                return CustomDate(i + startNepaliYear, j + 1, days)
        }
    }
    return null
}

/**
 * Convert Nepali date to English date.
 * @param nepDate Nepali date to convert from.
 * @return Corresponding English date.
 */
fun getEnglishDate(nepDate: CustomDate): CustomDate? {
    var days = 0
    val year = nepDate.year - startNepaliYear
    for (i in 0..year) {
        for (j in 0..11) {
            if (i == year && j == nepDate.month - 1) {
                days += nepDate.day - 1

                val c = startEnglishDate.calendar
                c.add(Calendar.DATE, days)
                return CustomDate(c)
            } else
                days += data[i][j]
        }
    }
    return null

}
