package com.a.ZL;

import com.a.ZLS.ZLS;
import com.a.utils.C;
import com.hw.model.An;

public class GR implements Person{

	@Override
	public void ZL() {
		System.out.println("一个工人走入了招领所");
		System.out.println("你想招领几号：");
		ZLS.Show();
		int no=C.IN.nextInt();
		An a=ZLS.LIST.remove(no);
		System.out.println("工人把"+a.getName()+"领养走了");
	}

}
