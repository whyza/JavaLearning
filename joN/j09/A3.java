import java.util.Scanner;
class A3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new  Scanner(System.in);
		double[] arr = new double[10];
		double sum = 0;
		for(int i=0;i<arr.length;i++){
			System.out.println("����");
			double num = sc.nextDouble();
			arr[i]=num;
			sum+=num;
		}
		double max = arr[0]; 
		double min = arr[0]; 
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				double temp = arr[i];
				arr[i] = max;
				max = temp;
			}
			if(min>arr[i]){
				double t = arr[i];
				arr[i] = min;
				min = t;
			}
			
		}
		sum=sum-max-min;
		System.out.println("ȥ��һ����߷֣�"+max+" ȥ��һ����ͷ֣�"+min+"���ƽ����"+sum/8.0+"��");
		}		
	}
		
