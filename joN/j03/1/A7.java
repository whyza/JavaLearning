import java.util.Scanner;
class A7{
public static void main(String[]  args){
	System.out.println("�������Ա����");
	Scanner sc = new Scanner(System.in);
	int zJ = 1000;
	int jF = sc.nextInt();
	if(jF > 5000){
	System.out.println("�Ż����ۺ�"+zJ*0.7+"Ԫ ");
	}else if(jF > 3000 && jF < 5000){
	System.out.println("�Żݰ��ۺ�"+zJ*0.8+"Ԫ ");
	}else if(jF > 1000 && jF < 3000){
	System.out.println("�Żݰ��ۺ�"+zJ*0.9+"Ԫ");
	}
}

}