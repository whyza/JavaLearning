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
	System.out.println("������a��b��c��d��ֵ�ֱ�Ϊ:"+a+"\t"+b+"\t"+c+"\t"+d);
}
	

}