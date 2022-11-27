package v119;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TimeApiDemo {

    public static void main(String[] args) {
        LocalTime time = LocalTime.of(17, 32);
        LocalDate date = LocalDate.of(2022, Month.NOVEMBER, 27);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println("Idő: " + time);
        System.out.println("Dátum: " + date);
        System.out.println("Dátum és idő: " + dateTime);

        ZoneId zoneId = ZoneId.of("Europe/Budapest");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zoneId);

        System.out.println("Dátum és idő (zónával): " + zonedDateTime);
        System.out.println();

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfYear = date.getDayOfYear();
        System.out.println(date + " (" + dayOfWeek + ") az év " + dayOfYear + ". napja");

        LocalDate afterThreeDays = date.plusDays(3);
        System.out.println(afterThreeDays + " (" + afterThreeDays.getDayOfWeek() + ") az év " + afterThreeDays.getDayOfYear() + ". napja");

        ZonedDateTime twoMonthBefore = zonedDateTime.minus(2, ChronoUnit.MONTHS);
        System.out.println("Két hónappal korábban: " + twoMonthBefore);
        System.out.println();

        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime newYorkTime = now.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Helyi idő: " + now);
        System.out.println("New York-i idő: " + newYorkTime);
        System.out.println();

        ZonedDateTime nextThursday = now.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println("Következő csütörtök: " + nextThursday.toLocalDate());
        ZonedDateTime firstDayOfMonth = now.with(ChronoField.DAY_OF_MONTH, 1);
        System.out.println("Hónap első napja: " + firstDayOfMonth);
        ZonedDateTime dateTimeInJune = now.with(ChronoField.MONTH_OF_YEAR, 6);
        System.out.println("Júniusban ugyanekkor: " + dateTimeInJune);
        System.out.println();

        LocalDate christmas = LocalDate.of(2022, 12, 25);
        long daysTillXmas = ChronoUnit.DAYS.between(now.toLocalDate(), christmas);
        System.out.println("Karácsonyig hátralévő napok száma: " + daysTillXmas);
        System.out.println();

        Period twelweDays = Period.ofDays(12);
        ZonedDateTime nowPlusTwelweDays = now.plus(twelweDays);
        System.out.println("12 nap múlva: " + nowPlusTwelweDays.toLocalDate());

        Duration fiveSeconds = Duration.ofSeconds(5);
        LocalTime fiveSecondsLater = now.toLocalTime().plus(fiveSeconds);
        System.out.println("5 mp múlva: " + fiveSecondsLater);
        System.out.println();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy. MMMM dd. HH:mm");
        System.out.println(now.format(formatter));
        System.out.println(dateTimeInJune.format(formatter));
    }

}
