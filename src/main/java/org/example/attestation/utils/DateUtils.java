package org.example.attestation.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    public static LocalDate addDaysToDate(LocalDate date, int daysToAdd) {
        return date.plusDays(daysToAdd);
    }


    private DateUtils() {
    }

    public static String formatDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(formatter);
    }
}
