/*
10、假设A在离原点15公里处，B在离远点85公里处，问两人向对方靠近，速度都是每小时5公里，问几小时后相遇（for）
*/

class B10 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=85;i+=5){
			if(15+i==85-i){
				System.out.print(i/5+"小时");
			}
		}
	}
}
