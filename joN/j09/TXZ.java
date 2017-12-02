import java.util.Random;
import java.util.Scanner;
class TXZ 
{
//♀■★
	public static void main(String[] args) 
	{
		Random r = new Random();
		//箱子随机出现
		int xx = r.nextInt(14)+1;
		int xy = r.nextInt(14)+1;
		int zx = r.nextInt(14)+1;
		int zy = r.nextInt(14)+1;
		String[][] arr = new String[15][15];
		for(int i=0;i<arr.length;i++){	
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]="□";
			}
		}
		int rx=0;
		int ry=0;
		arr[ry][rx]="♀";
		arr[xx][xy]="■";
		arr[zx][zy]="★";
		for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr[i].length;j++){
					System.out.print(arr[i][j]);
				}
				System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("往哪走? w a s d");
			String an = sc.next();
			if("d".equals(an)){
				arr[ry][rx]="□";
				rx++;
				if(rx>=15){
					rx--;
				}
				arr[ry][rx]="♀";
			}
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr[i].length;j++){
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		}
	}
}
