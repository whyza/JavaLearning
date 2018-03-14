class XZ 
{
	public static void main(String[] args) 
	{
		int[] arr={5,1,7,2,9,8,4};
		for(int i=0;i<arr.length-1;i++){
			int maxxb=i;//假设这一轮第一个数是最大的，
			for(int j=i+1;j<arr.length;j++){
				if(arr[maxxb]<arr[j]){
					maxxb=j;//记录那个比我更大值的所在下标
				}
			}
			if(maxxb!=i){
				int temp=arr[i];
				arr[i]=arr[maxxb];
				arr[maxxb]=temp;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}



	}
}
