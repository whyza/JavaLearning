class A{
public static void main(String[] args){
	int password=1234;
	//�ҵ����λ  1234
	int first = (password/1000+5)%10;
	//�ҵ���λ
	int sec = ((password%1000)/100+5)%10;
	//�ҵ�ʮλ
	int three = ((password%100)/10+5)%10;
	//�ҵ���λ
	int four =  (password%10+5)%10;
	//������һλ�͵���λ
	int temp;
	temp  = first;
	first = four;
	four = temp;
	//�����ڶ�λ�͵���λ
	int chage;
	chage = sec;
	sec = three; 
	three = chage;
	System.out.println("ԭʼ���� '1234' ���ܺ�õ�: "+first+sec+three+four);

}

}