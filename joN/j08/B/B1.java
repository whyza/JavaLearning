class  B1
{
	public static void main(String[] args) 
	{
		char[] arr = {'a','c','c','p'};
		char[] arr1 = {'j','a','v','a'};
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
			System.out.println();
		for(int i=0;i<arr.length;i++){
			arr[i]=arr1[i];
			System.out.print(arr[i]+"\t");
		}
		
	}
}
