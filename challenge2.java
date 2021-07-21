package com.TechnoElevateChallenge;

public class challenge2 {
	static double pi=3.14;
	public static double area(double r) {
		if(r<0) {
			System.out.println("inavalid vlaue...");
			return -1.0;
			
		}
		
		
			return pi*(r*r);
		
		
		
	}
	public static double area(double x , double y) {
		if(x<0 ||  y<0) {
			System.out.println("inavalid value....");
			return -1.0;
		}
		
		
			return x*y;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(area(-25));
       System.out.println(area(10,-5));
	}

}
