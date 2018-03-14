/*
0+6=6
1+5=6
2+4=6
3+3=6
4+2=6
5+1=6
6+0=6
x+y=z
y=6-x;



4.2006年培养学员8万人，每年增长25%，
请问按此增长速度，
到哪一年培训学员人数将达到20万人？
*/

class B 
{
	public static void main(String[] args) 
	{
		/*
		int a=0;
		while(a<=6){
			System.out.println(a+"+"+(6-a)+"=6");
			a=a+1;
		}
		*/
		double rs=80000;
		int year=2006;
		while(rs<=200000){
			year=year+1;
			rs=rs*1.25;
		}
		System.out.print(year);
	}
}
