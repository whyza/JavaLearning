class A{
public static void main(String[] args){
	int password=1234;
	//找到最高位  1234
	int first = (password/1000+5)%10;
	//找到百位
	int sec = ((password%1000)/100+5)%10;
	//找到十位
	int three = ((password%100)/10+5)%10;
	//找到个位
	int four =  (password%10+5)%10;
	//交换第一位和第四位
	int temp;
	temp  = first;
	first = four;
	four = temp;
	//交换第二位和第三位
	int chage;
	chage = sec;
	sec = three; 
	three = chage;
	System.out.println("原始数据 '1234' 加密后得到: "+first+sec+three+four);

}

}