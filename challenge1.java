package com.TechnoElevateChallenge;

public class challenge1 {
	public static String getDurationString(int minutes,int seconds) {
		if(minutes>=0 & (seconds >=0 &&seconds<=59)) {
			int Hour=0;
			Hour=minutes/60;
			minutes=minutes%60;
			return Hour+" : Hours  "+minutes+" : Minutes  "+seconds+": seconds";
		}
		return "Ivalid value....";
		
		
	}
	public static String getDurationString(int seconds) {
		int minutes=0;
		if(seconds>=0) {
			minutes=seconds/60;
			seconds=seconds%60;
			return  minutes +": Minutes " +seconds+": Seconds";
		}
		return "invalid..";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDurationString(24,35));
		System.out.println(getDurationString(180));

	}

}
