package JA03;

import java.util.Date;

public class JO03B2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d  =new Date();
		System.out.println(d.getTime());
		long dd = d.getTime();
		System.out.println("����1970��1��1���Ѿ���"+dd/(1000*60*60*24)+"����");
	}

}
