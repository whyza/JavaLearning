
class MP 
{
	public static void main(String[] args) 
	{
		int[] arr={5,1,7,2,9,8,4};
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				System.out.print("\t"+i+"±È"+j+"");
				if(arr[i]<arr[j]){
					System.out.print("»»");
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
			System.out.println();
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
