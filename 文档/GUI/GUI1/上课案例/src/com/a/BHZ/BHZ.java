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
			System.out.println("保护者在丰泽食堂发现了.一只狗");
			System.out.println("您要对这个狗起名儿叫啥?");
			String name=C.IN.next();
			System.out.println("体重是");
			double tz=C.IN.nextDouble();
			System.out.println("体重max是");
			double maxtz=C.IN.nextDouble();
			System.out.println("体重增量是");
			double tzadd=C.IN.nextDouble();
			Dog d=new Dog(name, tz, maxtz, tzadd);
			return d;
		case 2:
			System.out.println("保护者在红旗发现了.一只cat");
			System.out.println("您要对这个maoer起名儿叫啥?");
			String name1=C.IN.next();
			System.out.println("体重是");
			double tz1=C.IN.nextDouble();
			System.out.println("体重max是");
			double maxtz1=C.IN.nextDouble();
			System.out.println("体重增量是");
			double tzadd1=C.IN.nextDouble();
			Cat c=new Cat(name1, tz1, maxtz1, tzadd1);
			return c;
		default:
			
			
			System.out.println("保护者在女生寝室发现了.一只Pig");
			System.out.println("您要对这个Pig起名儿叫啥?");
			String name2=C.IN.next();
			System.out.println("体重是");
			double tz2=C.IN.nextDouble();
			System.out.println("体重max是");
			double maxtz2=C.IN.nextDouble();
			System.out.println("体重增量是");
			double tzadd2=C.IN.nextDouble();
			Pig p=new Pig(name2, tz2, maxtz2, tzadd2);
			return p;
		}

	}
}
