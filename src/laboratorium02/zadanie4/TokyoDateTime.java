package laboratorium02.zadanie4;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class TokyoDateTime {
    public static void main(String... args) {
        TimeZone tokyoTimeZone = TimeZone.getTimeZone("Japan");
        Locale tokyoLocale = Locale.JAPAN;
        Calendar calendar = Calendar.getInstance(tokyoTimeZone, tokyoLocale);
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, tokyoLocale);
        dateFormat.setTimeZone(tokyoTimeZone);
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
