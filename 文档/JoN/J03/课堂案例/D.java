import java.util.Scanner;
class D{
	public static void main(String[] args){

	Scanner in=new Scanner(System.in);
	System.out.print("������Գɼ�");
	int bs=in.nextInt();
	if(bs>=80){
		System.out.print("�������Գɼ�");
		int ms=in.nextInt();
		if(ms>=80){
		System.out.print("¼ȡ");
		}else{
		System.out.print("�������Ƶı�����");
		}
	}else{
	System.out.print("��ȥ�����");
	}
}
}