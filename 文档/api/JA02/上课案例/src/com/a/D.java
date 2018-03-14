package com.a;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try {
			Class c=Class.forName("java.lang.ArrayIndexOutOfBoundsException");
			
			while(c!=null){
				System.out.println(c.getName());
				c=c.getSuperclass();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
