package com.a.BHZ;

import java.util.Random;

import com.a.utils.C;
import com.hw.model.An;
import com.hw.model.Cat;
import com.hw.model.Dog;
import com.hw.model.Pig;

public class BHZ {

	public static An discoverAnimal() {
		Random r=new Random();
		int sj = r.nextInt(3)+1;
		switch (sj) {
		case 1:
			System.out.println("�������ڷ���ʳ�÷�����.һֻ��");
			System.out.println("��Ҫ���������������ɶ?");
			String name=C.IN.next();
			System.out.println("������");
			double tz=C.IN.nextDouble();
			System.out.println("����max��");
			double maxtz=C.IN.nextDouble();
			System.out.println("����������");
			double tzadd=C.IN.nextDouble();
			Dog d=new Dog(name, tz, maxtz, tzadd);
			return d;
		case 2:
			System.out.println("�������ں��췢����.һֻcat");
			System.out.println("��Ҫ�����maoer��������ɶ?");
			String name1=C.IN.next();
			System.out.println("������");
			double tz1=C.IN.nextDouble();
			System.out.println("����max��");
			double maxtz1=C.IN.nextDouble();
			System.out.println("����������");
			double tzadd1=C.IN.nextDouble();
			Cat c=new Cat(name1, tz1, maxtz1, tzadd1);
			return c;
		default:
			
			
			System.out.println("��������Ů�����ҷ�����.һֻPig");
			System.out.println("��Ҫ�����Pig��������ɶ?");
			String name2=C.IN.next();
			System.out.println("������");
			double tz2=C.IN.nextDouble();
			System.out.println("����max��");
			double maxtz2=C.IN.nextDouble();
			System.out.println("����������");
			double tzadd2=C.IN.nextDouble();
			Pig p=new Pig(name2, tz2, maxtz2, tzadd2);
			return p;
		}

	}
}
