package com.a.UI;

import com.a.BHZ.BHZ;
import com.a.ZL.GR;
import com.a.ZLS.ZLS;
import com.a.utils.C;
import com.hw.model.An;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("-------ϵͳ���в˵�------\n1:���ֶ���\n2:��������\n3:��������\n4:�г����ж���\n5:���ж��������\n6:�˳�\n");
			int cmd = C.IN.nextInt();
			if (cmd == 1) {
				An a = BHZ.discoverAnimal();
				// �Ѷ�����뼯��
				ZLS.LIST.add(a);
			} else if (cmd == 2) {
				ZLS.WY();
			} else if (cmd == 3) {
				GR g=new GR();
				g.ZL();
			} else if (cmd == 4) {
				ZLS.Show();
			} else if (cmd == 5) {
				ZLS.ShowTZ();
			} else if (cmd == 6) {
				break;
			}

		}

	}

}
