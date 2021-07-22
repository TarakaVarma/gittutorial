package com.TechnoElevateChallenge;

import java.util.Scanner;

public class challeng8 {
  public static int sumFirstAndLastDigit(int number) {
	  while(number>0){
		  int temp=number;
		  int last_digit;
		  last_digit=number%10;
		 
			 int first_digit=number/100;
			 int sum=first_digit+last_digit;
			 
		 
		 
		 return  sum;
	  }
	  System.out.println("Invalid value...");
	return -1;
	  
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int number= sc.nextInt();
		System.out.println(sumFirstAndLastDigit(number));

	}

}
