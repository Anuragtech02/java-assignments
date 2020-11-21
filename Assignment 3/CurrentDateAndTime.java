import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class CurrentDateAndTime
{
	public static void main(String args[]) 
    {
		SimpleDateFormat cdt = new SimpleDateFormat("dd/MM/yyy  HH:mm:ss.SSS");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("IST")));
		System.out.println("\nCurrent Date and Time is : "+cdt.format(System.currentTimeMillis()));
	}
}