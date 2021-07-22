package com.TechnoElevateChallenge;

public class challenge7 {
	public static boolean isOdd(int i) {
		if(i%2==0) {
			return false;
		}
		return true;
	}
	public static int summOdd(int start ,int end) {
		int sum=0 ;
		System.out.println(isOdd(21));
		if(start>0 && end>0) {
			for(int  i=start;i<=end;i++) {
				isOdd(i);
				
					if(i%2!=0) {
						sum=sum+i;
					}
				
			}return sum;
			 
	
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
    System.out.println(summOdd(2, 13));
    
	}

}
