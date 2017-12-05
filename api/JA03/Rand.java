package JA03;

import java.util.Random;

public class Rand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int i = r.nextInt(10);
		System.out.println(i);
//		System.out.println(r+1);
		long l = r.nextLong();
		System.out.println(l);
		float f = r.nextFloat();
		System.out.println(f);
		double d = r.nextDouble();
		System.out.println(d);
		System.out.println(r.nextGaussian());
		
	}

}
