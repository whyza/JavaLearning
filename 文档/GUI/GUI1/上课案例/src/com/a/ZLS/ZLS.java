package com.a.ZLS;

import java.util.ArrayList;

import com.a.C;
import com.hw.model.An;

public class ZLS {
	public static ArrayList<An> LIST=new ArrayList<An>();

	
	/**
	 *�г����ж���
	 */
	public static void  Show(){
		for (int i = 0; i < LIST.size(); i++) {
			System.out.println("NO."+i+"=="+LIST.get(i).getName());
		}
	}
	
	
	public static void  ShowTZ(){
		for (int i = 0; i < LIST.size(); i++) {
			System.out.print(LIST.get(i).getName()+"������");
			LIST.get(i).ShowTZ();
		}
	}
	public static void WY(){
		Show();
		System.out.println("����������ι���ı��");
		int no=com.a.utils.C.IN.nextInt();
		
		An aa=LIST.get(no);
		
		double t=aa.getTz();
		double tz=aa.getTz()+aa.getAdd();
		if(tz>=aa.getMaxtz()){
			tz=aa.getMaxtz();
		}
		aa.setTz(tz);
		System.out.println(aa.getName()+"��ι���ˣ�����������"+(aa.getTz()-t));;
		
		
		
		
		
	}
}
