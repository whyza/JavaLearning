package com.a.ZL;

import com.a.ZLS.ZLS;
import com.a.utils.C;
import com.hw.model.An;

public class GR implements Person{

	@Override
	public void ZL() {
		System.out.println("һ������������������");
		System.out.println("�������켸�ţ�");
		ZLS.Show();
		int no=C.IN.nextInt();
		An a=ZLS.LIST.remove(no);
		System.out.println("���˰�"+a.getName()+"��������");
	}

}
