package com.B.test2;

public class MyTime {
	private int hour;
	private int minute;
	private int second;
	public int getHour() {
		return hour;
	}
	public int setHour(int hour) {
		if(hour >= 0 && hour < 24) {
			return this.hour = hour;
		}else {
			return this.hour = 0;
		}
	
	}
	public int getMinute() {
		return minute;
	}
	public int setMinute(int minute) {
		if(minute >= 0 && minute < 60) {
			return this.minute = minute;
			
		}else {
			return this.minute = 0;
		}
	}
	public int getSecond() {
		return second;
	}
	public int setSecond(int second) {
		if(second >= 0 && second < 60) {
			return this.second = second;
		}else {
			return this.second = 0;
		}
	}
	int Scount;
	public int addSecond(int sec) {
		if(sec + getSecond() >= 60) {	
			Scount = (getSecond() + sec)/60;
			System.out.println("��"+sec+"��");
			sec = (getSecond() + sec)%60;
			setSecond(sec);
			setMinute(getMinute()+Scount);
			diapliy();
			return sec;
		}else {
			System.out.println("��"+sec+"��");
			sec = setSecond(getSecond()+sec);
			diapliy();
			return sec;
		}
	}
	int Hcount=0;
	public int addMinute(int min) {
		if(min + getMinute() >= 60) {	
			Hcount = (getMinute() + min)/60;
			System.out.println("��"+min+"����");
			min = (getMinute() + min)%60;
			setMinute(min);
			setHour(getHour()+Hcount);
			diapliy();
			return min;
		}else {
			System.out.println("��"+min+"����");
			min = setMinute(getMinute()+min);
			diapliy();
			return min;
		}
	}
	int count = 0;
	public int addHour(int hou) {
		if( hou + getHour() > 24) {
			count = (getHour() + hou)/24 + 1;
			System.out.println("��"+hou+"Сʱ");
			hou  = (getHour() + hou - 24)%24;
			setHour(hou);
			diapliy();
			return hou;
		}else  {
			System.out.println("��"+hou+"Сʱ");
			System.out.print("��1��");
			hou = setHour(getHour()+hou);
			diapliy();
			return hou;
		}		
	}
	public int subMinute(int min) {
		if(count*24 + getHour() >= 0) {
			System.out.println("��"+min+"����");
			int hour1 = getHour();
			hour = 24 + (hour*60 + getMinute() - min)/60;
			System.out.println(hour);
			System.out.println(hour1);
			count = (count*24 + hour1 + getMinute()/60 + hour)/24  ;
			System.out.println(count);
			min = (hour*60 + getMinute() - min)%60;
			setMinute(min);
			diapliy();
			return min;
		}else{
			System.out.println("��"+min+"����"+"����������Χ");
			return min;
		}
		
	}
	public int subHour(int hou) {
		int count2 = count;
		if(count * 24 + getHour() - hou >= 0) {
			System.out.println("��"+hou+"Сʱ");
//			System.out.println(count);
			count = (count*24 + getHour() - hou)/24;
//			System.out.println(count);
			hou = (count2*24 + getHour() - hou)%24;
			setHour(hou);
			diapliy();
			return hou;
		}else{
			System.out.println("��"+hou+"Сʱ"+"����������Χ");
			return hou;
		}

	}
	public int subSecond(int sec) {
		
		System.out.println("��"+sec+"��");
		sec = setSecond(getSecond()-sec);
		diapliy();
		return sec;
	}
	public void diapliy() {
		System.out.println("��"+count+"��\t"+getHour()+"ʱ\t"+getMinute()+"��\t"+getSecond()+"��");
	}
	
}
