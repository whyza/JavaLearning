//王贤杰砍刘冠婷BOSS
import java.util.*;
class VS 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		Random r=new Random();
		//初始化游戏基本数据
		int WHP=1000,LHP=50000;
		int WAT=0,LAT=0;
		int count=1;
		System.out.println("突然遇到了boss。。。");
		while(true){
			System.out.println("【【【【【当前第"+count+"回合】】】】");
			System.out.println("1-攻击\t2-技能\t3-道具\t4-逃跑");//打印菜单
			int cmd=in.nextInt();
			//判断菜单选项
			if(cmd==1){//普通攻击
				WAT=5000+r.nextInt(10001);
				LAT=r.nextInt(401);
				//攻击--掉血的过程
				LHP-=WAT;
				System.out.println("王贤杰使用【飞龙在天】,刘冠婷掉了["+WAT+"],还剩"+LHP+"点血。");
				WHP-=LAT;
				System.out.println("刘冠婷使用【温柔小拳拳】,王贤杰掉了["+LAT+"],还剩"+WHP+"点血。");
			
				if(WHP<=0 && LHP<=0){
					System.out.println("俩人儿化蝶…………………………");
					break;
				}
				if(LHP<=0){
					System.out.println("邪恶的boss刘冠婷被正义的王贤杰击败了。获得经验1点，金钱2G。爆了装备【温柔的小拳套】");
					break;
				}
				if(WHP<=0){
					System.out.println("胜败乃兵家常事，大侠请重新来过。");
					break;
				}
			}else if(cmd==2){//使用技能
				System.out.println("选择技能:1-瞬杀斩\t2-吐口水\3-丢出臭袜子");
				int cmdjn=in.nextInt();
				if(cmdjn==1){//瞬杀斩
					//10%的概率
					if(r.nextInt(100)<10){
						WAT=LHP;
					}else{
						WAT=0;
					}
				LAT=r.nextInt(401);
				//攻击--掉血的过程
				LHP-=WAT;
				System.out.println("王贤杰使用【瞬杀斩】,刘冠婷掉了["+WAT+"],还剩"+LHP+"点血。");
				WHP-=LAT;
				System.out.println("刘冠婷使用【温柔小拳拳】,王贤杰掉了["+LAT+"],还剩"+WHP+"点血。");
			
				if(WHP<=0 && LHP<=0){
					System.out.println("俩人儿化蝶…………………………");
					break;
				}
				if(LHP<=0){
					System.out.println("邪恶的boss刘冠婷被正义的王贤杰击败了。获得经验1点，金钱2G。爆了装备【温柔的小拳套】");
					break;
				}
				if(WHP<=0){
					System.out.println("胜败乃兵家常事，大侠请重新来过。");
					break;
				}
				}else if(cmdjn==2){
				
				
				}else if(cmdjn==3){
				
				}else{
				
				
				}
			
			}else if(cmd==3){
			
			}else if(cmd==4){
			
			}else{
				System.out.println("傻逼你瞎按，。");
			}
		}
	}
}
