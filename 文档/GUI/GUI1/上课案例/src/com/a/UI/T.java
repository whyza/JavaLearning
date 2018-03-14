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
			System.out.println("-------系统运行菜单------\n1:发现动物\n2:饲养动物\n3:动物招领\n4:列出所有动物\n5:所有动物的特征\n6:退出\n");
			int cmd = C.IN.nextInt();
			if (cmd == 1) {
				An a = BHZ.discoverAnimal();
				// 把动物放入集合
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
