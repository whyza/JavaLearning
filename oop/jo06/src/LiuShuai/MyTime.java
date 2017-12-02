package LiuShuai;
/*【练习题】类的成员变量与方法、构造方法
在程序中，经常要对时间进行操作，但是并没有时间类型的数据。那么，我们可以自己实现一个时间类，来满足程序中的需要。
定义名为MyTime的类，其中应有三个整型成员：时（hour），分（minute），秒（second），为了保证数据的安全性，这三个成员变量应声明为私有。
为MyTime类定义构造方法，以方便创建对象时初始化成员变量。
再定义diaplay方法，用于将时间信息打印出来。

为MyTime类添加以下方法：
addSecond(int sec)
addMinute(int min)
addHour(int hou)
subSecond(int sec)
subMinute(int min)
subHour(int hou)
分别对时、分、秒进行加减运算。
*/
public class MyTime {
	private	int hour;
	private int minute;
	private int second;
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public void addSecond(int sec) {
		this.second=sec+getSecond();
		System.out.println("增加"+sec+"秒");
	}
	public void addMinute(int min) {
		this.minute=min+getMinute();
		System.out.println("增加"+min+"分");
		
	}
	public void addHour(int hou) {
		this.hour=hou+getHour();
		System.out.println("增加"+hou+"小时");
		System.out.println(getHour()+"时"+getMinute()+"分"+getSecond()+"");
		
	}
	public void subSecond(int sec) {
		
	}
	public void subMinute(int min) {
		
	}
	public void subHour(int hou) {
		
	}
	public MyTime(int hou , int min , int sec) {
		setHour(hou);
		setMinute(min);
		setSecond(sec);
	}
}
