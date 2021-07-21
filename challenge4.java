package com.TechnoElevateChallenge;

public class challenge4 {
	public static boolean isCatPlaying(boolean summer, int temperature) {
		if(  summer &&temperature>=25 &&temperature<=35) {
			return true;
		}
	   return false;
		
			
		
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isCatPlaying(true,40));
	}

}
