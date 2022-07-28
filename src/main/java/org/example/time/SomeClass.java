package org.example.time;

import java.security.acl.LastOwnerException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class SomeClass
{
    public static void main(String[] args)
    {
        Date date = new Date();
        System.out.println(date);
        date = new Date(122, Calendar.APRIL, 10, 15, 40, 12);
        System.out.println(date);
        date.setYear(120);
        System.out.println(date);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");

        System.out.println(dateTimeFormatter.format( LocalDate.of(2022, 7, 25)));

        LocalDate localDate = LocalDate.of(2022, Month.OCTOBER, 2);
        LocalDate ld = localDate.plusDays(5);
        System.out.println(ld);

        Instant timestamp = Instant.now();
        /*
        формирую запрос на сервер
         */
        Instant timestamp1 = Instant.now();
        timestamp=timestamp.plusSeconds(1);
        System.out.println(timestamp.getEpochSecond() + "\n" + timestamp1.getEpochSecond());
        ZoneId zoneId = ZoneId.of("Africa/Cairo");
        System.out.println(ZoneId.getAvailableZoneIds().size());
        ZoneId zoneId1 = ZoneId.of("Europe/Barcelona");
        ZonedDateTime time = ZonedDateTime.now(zoneId);
        System.out.println(time);
        time = ZonedDateTime.now(zoneId1);
        System.out.println(time);





    }
}
