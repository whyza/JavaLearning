//2017-10-14
class E 
{
	public static void main(String[] args) 
	{
		//�������1��9�·ݵ�ÿ���·ֵ�������Ȼ���ۼ�
		int sum=0;
		for(int i=1;i<=9;i++){
			//���i�·��ж�����
			switch(i){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					sum+=31;
				break;
				case 2:
					sum+=28;
				break;
				default:
					sum+=30;
			}
			//System.out.println("-==========="+i);
		}
		sum+=14;
		System.out.println("����2017���Ѿ�����"+sum*100/365+"%");
	}
}
