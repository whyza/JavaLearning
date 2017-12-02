class A2 
{
	public static void main(String[] args) 
	{
		int[] arr = {29,30,44,8,39};
		int max = arr[0];
		int min = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				int temp = arr[i];
				arr[i] = max;
				max = temp;
			}if(arr[i]<min){
				int t = arr[i];
				arr[i] = min;
				min = t;
			}
		}
		System.out.println("最大值为："+max+"\t"+"最小值为："+min);
	}
}
