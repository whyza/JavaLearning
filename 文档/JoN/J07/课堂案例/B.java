//��Ǯ��ټ�������=5   ĸ��=3	С��һ��Ǯ��ֻ
class B 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=20;i++){//��������
			for(int j=0;j<=33;j++){//ĸ��
				for(int k=0;k<=100;k+=3){
					if(i+j+k==100 && i*5+j*3+k/3.0==100){
						System.out.println("����="+i+"\tĸ��="+j+"\tС��="+k);
					}
				}
			}
		}
	}
}
