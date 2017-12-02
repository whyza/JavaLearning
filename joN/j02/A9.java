class A9{
public static void main(String[] args){
	int a = 12345;
	int first = a/10000;
	int sec = a/1000%10;
	int three = a/100%10;
	int four  = a/10%10;
	int five  = a%10;	
	System.out.println("万位数为："+first+" 千位数为："+sec+" 百位数为："+three+" 十位数为："+four+" 个位数为："+five);

}

}