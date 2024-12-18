package getting_started;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalanderDemo {

	public static void main(String[] args) {
		Calendar cd = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(sdf.format(cd.getTime()));
		System.out.println(cd.get(Calendar.AM_PM));
		System.out.println(cd.get(Calendar.DAY_OF_MONTH));
		System.out.println(cd.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cd.get(Calendar.DAY_OF_YEAR));
	}

}
