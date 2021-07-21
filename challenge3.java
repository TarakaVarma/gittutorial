package com.TechnoElevateChallenge;

public class challenge3 {
	public static void printEqual(int x, int y, int z) {
		if(x<0 || y<0 || z<0) {
			System.out.println("invalid value...");
		}else if(x==y&&x==z&&y==x&&y==z) {
			System.out.println("All numbers are equal..");
		}else {
			System.out.println("All numbers are differnt...");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          printEqual(1, -1, 0);
	}

}
