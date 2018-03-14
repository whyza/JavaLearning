package com.hw;

import java.util.Scanner;

public class B {
/*
 * 、搜索与统计功能
"what this workbook will do for you the job search process"
接收用户输入一个字母，将字符串里含有该字母的单词显示出来，并且再统计每一个单词里含有该它母的个数，功能如下图:

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="what this workbook will do for you the job search process";
		System.out.println("输入：");
		Scanner in=new Scanner(System.in);
		String cmd=in.next();
		String[] arr=str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].indexOf(cmd)>=0){
				int t=(arr[i]+" ").split(cmd).length-1;
				//bug=当分隔字符位于结尾的时候，该次数不列入
//				if(arr[i].endsWith(cmd)){
//					t++;
//				}
				System.out.println("该单词"+arr[i]+"里包含"+cmd+",一共出现 了"+t+"次");
			}
		}
	}

}
