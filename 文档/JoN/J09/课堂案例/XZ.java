class XZ 
{
	public static void main(String[] args) 
	{
		int[] arr={5,1,7,2,9,8,4};
		for(int i=0;i<arr.length-1;i++){
			int maxxb=i;//������һ�ֵ�һ���������ģ�
			for(int j=i+1;j<arr.length;j++){
				if(arr[maxxb]<arr[j]){
					maxxb=j;//��¼�Ǹ����Ҹ���ֵ�������±�
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
