import java.util.Scanner;
class C{
	public static void main(String[] args){
	System.out.print("����߿��ɼ�");
	Scanner in=new Scanner(System.in);	
	int score=in.nextInt();
	if(score>=600){
	System.out.println("��ũ��");
	}else if(score>=500){
 	System.out.println("ȥ����");
	}else if(score>=400){
	System.out.println("ѧ��ѧ��");
	}else if(score>=300){
	System.out.println("������");
	}else{
	System.out.println("ȥ��ש");
	}


}

}