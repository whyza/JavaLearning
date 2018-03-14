//9、定义一个整形变量比如:int a = 12345;然后依次输出各个位上的数字；
class AA{
public static void main(String[] args){
	int a=12345;
	int g=a/1%10;
	int s=a/10%10;
	int b=a/100%10;
	int q=a/1000%10;
	int w=a/10000;

//定义两个整数变量并赋值，不使用第三变量的情况下，交换这两个变量的值；
	int a=10;
	int b=20;
/*
	int c=a;
	a=b;
	b=c;
*/
	b=a+b;//b=30  a=10
	a=b-a;//a=20 b=30
	b=b-a;//b=10 a=20


}

}