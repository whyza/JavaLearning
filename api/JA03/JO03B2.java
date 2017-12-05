package JA03;

import java.util.Date;

public class JO03B2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d  =new Date();
		System.out.println(d.getTime());
		long dd = d.getTime();
		System.out.println("距离1970年1月1日已经有"+dd/(1000*60*60*24)+"天了");
	}

}
