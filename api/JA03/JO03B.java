package JA03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JO03B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
//		System.out.println(d.getTime());
		System.out.println(d);
		DateFormat d1 = new SimpleDateFormat("��ǰʱ����: yyyy��MM��dd��  EEEE ����ʱ��");
		System.out.println(d1.format(d));
		DateFormat df = new SimpleDateFormat("��ǰʱ���ǣ�yyyy��MM��dd�� hhʱ:mm��:ss��");
		System.out.println(df.format(d));
//		System.out.println(d.toLocaleString());
		DateFormat d2 = new SimpleDateFormat("ŷ������: MM-dd-yyyy  hh:mm:ss");
		System.out.println(d2.format(d));
	}

}
