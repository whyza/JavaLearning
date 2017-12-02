class A7{
public static void main(String[] args){
	char a = 'A';
	char b = 'B';
	char c = 'C';
	char d = 'D';
	char temp1;
	temp1 = a;
	a = d;
	d = temp1;
	char temp2;
	temp2 = b;
	b = c; 
	c = temp2;
	System.out.println("交换后a、b、c、d的值分别为:"+a+"\t"+b+"\t"+c+"\t"+d);
}
	

}