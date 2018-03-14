package com.a;

public class S {

	public static void main(String[] args) {
		//1-字符串方法
		
		String str="郭重阳和胡全在一起了。";
		String a="a";
		//比较字符串是否完全一致
		System.out.println("A".equals(a));
		//比较字符串是否相等，忽略大小写
		System.out.println("A".equalsIgnoreCase(a));
		//字符串长度
		System.out.println(str.length());
		//返回指定位置的字符
		System.out.println(str.charAt(1)+1);
		//找到指定字符串出现的位置,找不到返回-1
		str="郭重阳和胡全在一起了。李重阳不开心了";
		System.out.println(str.indexOf("重阳"));
		//从某个位置开始找到指定字符串第一次出现的位置
		System.out.println(str.indexOf("重阳", 3));
		//判断字符串是否是空字符串""
		//str="";
		System.out.println(str.isEmpty());
		//
		System.out.println(str.lastIndexOf("重阳"));
		//替换指定字符串。本身不变，替换后的作为新值返回
		str=str.replace("胡全", "王贤杰");
		System.out.println(str);
		//判断以什么开头
		System.out.println(str.startsWith("郭靖"));
		//判断以什么结尾
		System.out.println(str.endsWith("@qq.com"));
		str="郭重阳和胡全在一起了。李重阳不开心了";
		//从指定位置开始截取到最后，包括指定位置
		System.out.println(str.substring(3));
		//从开始位置截取到结束位置，包头不包尾
		System.out.println(str.substring(3, 5));
		//
		char[] arr=str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}//全部变小写
		System.out.println(str.toLowerCase());
		
		//全部变da写
		System.out.println(str.toUpperCase());
		//通过指定字符串分隔成数组
		str="床前明月光，疑是地上霜，，举头望明月，低头思故乡";
		String[] brr=str.split("，");
		for (int i = 0; i < brr.length; i++) {
			System.out.println(brr[i]+brr[i].isEmpty());
		}
		//去掉字符串两端的空格
		str="admin      ";
		System.out.println(str+"|");
		System.out.println(str.trim()+"|");
		
		System.out.println(str.equals("admin"));
		
		str="  adm i n      ";
		
		System.out.println(str.replace(" ", ""));
	}

}
