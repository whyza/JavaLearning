package LiuShuai;
/*����ϰ�⡿��ĳ�Ա�����뷽�������췽��
�ڳ����У�����Ҫ��ʱ����в��������ǲ�û��ʱ�����͵����ݡ���ô�����ǿ����Լ�ʵ��һ��ʱ���࣬����������е���Ҫ��
������ΪMyTime���࣬����Ӧ���������ͳ�Ա��ʱ��hour�����֣�minute�����루second����Ϊ�˱�֤���ݵİ�ȫ�ԣ���������Ա����Ӧ����Ϊ˽�С�
ΪMyTime�ඨ�幹�췽�����Է��㴴������ʱ��ʼ����Ա������
�ٶ���diaplay���������ڽ�ʱ����Ϣ��ӡ������

ΪMyTime��������·�����
addSecond(int sec)
addMinute(int min)
addHour(int hou)
subSecond(int sec)
subMinute(int min)
subHour(int hou)
�ֱ��ʱ���֡�����мӼ����㡣
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
		System.out.println("����"+sec+"��");
	}
	public void addMinute(int min) {
		this.minute=min+getMinute();
		System.out.println("����"+min+"��");
		
	}
	public void addHour(int hou) {
		this.hour=hou+getHour();
		System.out.println("����"+hou+"Сʱ");
		System.out.println(getHour()+"ʱ"+getMinute()+"��"+getSecond()+"");
		
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
