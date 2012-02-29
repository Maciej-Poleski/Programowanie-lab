package laboratorium02.zadanie4;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class TokioDateTime {
	public static void main(String... args)
	{
		TimeZone tokioTimeZone=TimeZone.getTimeZone("Japan");
		Locale tokioLocale=Locale.JAPAN;
		Calendar calendar=Calendar.getInstance(tokioTimeZone,tokioLocale);
		
	}
}
