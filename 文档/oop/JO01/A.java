class A 
{
	public static void main(String[] args) 
	{
		int[][] arr=new int[5][5];
		//1-ÿ�е�һ������1.
		for(int i=0;i<arr.length;i++){
			arr[i][0]=1;
		}
		//ÿ�к�����ȵ�ʱ����1
		
		//�ڶ��п�ʼ����һ�������󣬵����������+����ǰ���
		for(int i=1;i<arr.length;i++){
			for(int j=1;j<=i;j++){
				arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
			}
		}
		
		System.out.println("Hello World!");
	}
}
