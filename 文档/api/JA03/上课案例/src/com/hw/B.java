package com.hw;

import java.util.Scanner;

public class B {
/*
 * ��������ͳ�ƹ���
"what this workbook will do for you the job search process"
�����û�����һ����ĸ�����ַ����ﺬ�и���ĸ�ĵ�����ʾ������������ͳ��ÿһ�������ﺬ�и���ĸ�ĸ�������������ͼ:

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="what this workbook will do for you the job search process";
		System.out.println("���룺");
		Scanner in=new Scanner(System.in);
		String cmd=in.next();
		String[] arr=str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].indexOf(cmd)>=0){
				int t=(arr[i]+" ").split(cmd).length-1;
				//bug=���ָ��ַ�λ�ڽ�β��ʱ�򣬸ô���������
//				if(arr[i].endsWith(cmd)){
//					t++;
//				}
				System.out.println("�õ���"+arr[i]+"�����"+cmd+",һ������ ��"+t+"��");
			}
		}
	}

}
