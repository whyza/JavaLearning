import java.util.Scanner;
class A9{
public static void main(String[] args){
	System.out.println("请输入年份");
	Scanner sc = new Scanner(System.in);
	int year =  sc.nextInt();
	System.out.println("请输入月份");
	int mounth = sc.nextInt();

	if(mounth == 4 || mounth == 6 || mounth == 9 || mounth == 11){
		System.out.println(year+"年的"+mounth+"月总共有30天");
	}else if(mounth == 1 || mounth == 3 || mounth == 5 || mounth == 7 || mounth == 8 || mounth == 10 || mounth == 12){
		System.out.println(year+"年的"+mounth+"月总共有31天");
	} 


	if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
	if(mounth == 2){
		System.out.println(year+"年的"+mounth+"月总共有29天");
	}
	}else{
		System.out.println(year+"年的"+mounth+"月总共有28天");
	}
	}
}