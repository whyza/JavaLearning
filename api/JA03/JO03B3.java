package JA03;

import java.util.Calendar;
import java.util.Date;

public class JO03B3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
//		c.set(1997,2);
	
		c.set(Calendar.YEAR, 1997);
		c.set(Calendar.MONTH, 4-1);
		c.set(Calendar.DATE, 2);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_WEEK)-1);
		long d1 = c.getTimeInMillis();
		Calendar c2 = Calendar.getInstance();
		System.out.println(c2.get(Calendar.YEAR));
		System.out.println(c2.get(Calendar.MONTH)+1);
		System.out.println(c2.get(Calendar.DATE));
		long d2 = c2.getTimeInMillis();
		System.out.println("你出生到今天一共有"+(d2-d1)/(1000*60*60*24)+"天");
//		System.out.println(d2);
		Date dd = new Date();
		long ms = dd.getTime();
		System.out.println(ms);
	}

}
