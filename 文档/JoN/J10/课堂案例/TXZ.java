import java.util.Scanner;
class TXZ 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		//初始化地图
		String[][] arr=new String[15][15];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]="□";
			}
		}
		//初始化人的位置
		int rx=0,ry=0;
		//初始化箱子的位置
		int xx=7,xy=8;

		//初始化终点的位置
		int zx=7,zy=12;

		arr[ry][rx]="♀";//
		arr[xy][xx]="■";

		arr[zy][zx]="★";
		while(true){
			System.out.print("兄弟往哪儿走?\twasd" );
			String cmd=in.next();
			if("w".equals(cmd)){
			
			}else if("a".equals(cmd)){
			
			}else if("s".equals(cmd)){
				arr[ry][rx]="□";
				ry++;
				if(ry>=15){
					ry--;
				}
				arr[ry][rx]="♀";//人成功走了
				if(rx==xx && ry==xy){//碰到箱子
					xy++;
					if(xy>=15){
						xy--;
						ry--;
					}
					arr[ry][rx]="♀";
					arr[xy][xx]="■";//箱子成移动
					if(xx==zx && xy==zy){
						break;
					}
				
				
				}

				
			}else if("d".equals(cmd)){
				arr[ry][rx]="□";
				rx++;
				if(rx>=15){
					rx--;
				}
				arr[ry][rx]="♀";

				if(rx==xx && ry==xy){//碰到箱子
					xx++;
					if(xx>=15){
						xx--;
						ry--;
					}
					arr[ry][rx]="♀";
					arr[xy][xx]="■";
				
				
				}

			}else{
			//
				System.out.println("输入错误");
			}

			//打印地图
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr[i].length;j++){
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		}

		//打印地图
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr[i].length;j++){
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}


		System.out.println("winner winner chicken dinner!");
		
	}
}
