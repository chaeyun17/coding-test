package time.conversion;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Solution {

	public static String timeConversion(String input) {
        LocalTime localTime = LocalTime.parse(input, DateTimeFormatter.ofPattern("hh:mm:ssa", Locale.US));
		return localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
	}

}
