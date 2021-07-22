package com.TechnoElevateChallenge;

import java.util.Scanner;

public class challenge9 {
	public static int getEvenDigitSum(int number) {
		int sum=0;
		int rem;
		if(number<0) {
			return -1;
		}
		
		while(number>0) {
			rem=number%10;
			if(rem%2==0) {
				sum=sum+rem;
			}
			number =number/10;
		}
		return sum;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number= sc.nextInt();
		System.out.println(getEvenDigitSum(number));
    
  
	}

}
