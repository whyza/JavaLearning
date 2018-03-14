/*
1-你是男是女。
2-你们家几口人。人数>=3
3-年龄。age<19 &&age>14
//4-三围和。sum>=240
5-体重。tz<=120
6-身高 。1.60~1.70
在一起
*/
import java.util.Scanner;
class C 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("天空一声巨响。王新生闪亮登场。");
		System.out.println("===========================");
		System.out.println("请问您是男是女》");
		String sex=in.next();
		if("女".equals(sex)){
			System.out.println("你们家几口人?");
			int num=in.nextInt();
			if(num>=3){
				System.out.println("芳龄几何");
				int age=in.nextInt();
				if(age>14 &&  age<=19){
						System.out.println("你多重……");
						double w=in.nextDouble();
						if(w<=120){
							System.out.println("你的身高");
							double sg=in.nextDouble();
							if(sg>=1.60 && sg<=1.70){
								System.out.println("在一起");
							}else{
								System.out.println("婉拒。。。。");
							}
						}else{
							System.out.println("怕你压着我……");
						}
				}else{
				System.out.println("年龄不合适");
				}
			}else{
				System.out.println("这样家里不热闹。。");
			}
		}else{
			System.out.println("搞基不?");
			String gj=in.next();
			if("搞".equals(gj)){
				System.out.println("凑合一下");
			}else{
				System.out.println("神经病");
			}
		}
	
	}
}
