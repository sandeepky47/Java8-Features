import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class LocalDateDemo {

	public static void main(String[] args) {

	LocalDate date=LocalDate.now();
	System.out.println(date);
	System.out.println(date.getMonth());
	Month m=date.getMonth();
	System.out.println(m.getDisplayName(TextStyle.SHORT, Locale.getDefault()));
	System.out.println(m.getDisplayName(TextStyle.FULL_STANDALONE, Locale.getDefault()));
	System.out.println(date.getDayOfWeek());
	 DayOfWeek d = date.getDayOfWeek();
	System.out.println(d.getDisplayName(TextStyle.SHORT,Locale.getDefault()));
	System.out.println(d.getDisplayName(TextStyle.FULL_STANDALONE,Locale.getDefault()));
		
	}

}
