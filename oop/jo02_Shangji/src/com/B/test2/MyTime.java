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
			System.out.println("加"+sec+"秒");
			sec = (getSecond() + sec)%60;
			setSecond(sec);
			setMinute(getMinute()+Scount);
			diapliy();
			return sec;
		}else {
			System.out.println("加"+sec+"秒");
			sec = setSecond(getSecond()+sec);
			diapliy();
			return sec;
		}
	}
	int Hcount=0;
	public int addMinute(int min) {
		if(min + getMinute() >= 60) {	
			Hcount = (getMinute() + min)/60;
			System.out.println("加"+min+"分钟");
			min = (getMinute() + min)%60;
			setMinute(min);
			setHour(getHour()+Hcount);
			diapliy();
			return min;
		}else {
			System.out.println("加"+min+"分钟");
			min = setMinute(getMinute()+min);
			diapliy();
			return min;
		}
	}
	int count = 0;
	public int addHour(int hou) {
		if( hou + getHour() > 24) {
			count = (getHour() + hou)/24 + 1;
			System.out.println("加"+hou+"小时");
			hou  = (getHour() + hou - 24)%24;
			setHour(hou);
			diapliy();
			return hou;
		}else  {
			System.out.println("加"+hou+"小时");
			System.out.print("第1天");
			hou = setHour(getHour()+hou);
			diapliy();
			return hou;
		}		
	}
	public int subMinute(int min) {
		if(count*24 + getHour() >= 0) {
			System.out.println("减"+min+"分钟");
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
			System.out.println("减"+min+"分钟"+"超出正常范围");
			return min;
		}
		
	}
	public int subHour(int hou) {
		int count2 = count;
		if(count * 24 + getHour() - hou >= 0) {
			System.out.println("减"+hou+"小时");
//			System.out.println(count);
			count = (count*24 + getHour() - hou)/24;
//			System.out.println(count);
			hou = (count2*24 + getHour() - hou)%24;
			setHour(hou);
			diapliy();
			return hou;
		}else{
			System.out.println("减"+hou+"小时"+"超出正常范围");
			return hou;
		}

	}
	public int subSecond(int sec) {
		
		System.out.println("减"+sec+"秒");
		sec = setSecond(getSecond()-sec);
		diapliy();
		return sec;
	}
	public void diapliy() {
		System.out.println("第"+count+"天\t"+getHour()+"时\t"+getMinute()+"分\t"+getSecond()+"秒");
	}
	
}
