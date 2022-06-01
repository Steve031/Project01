package Project01;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {

		
		Scanner scan =new Scanner(System.in);	
		System.out.println("Please enter a number.");
		int num=scan.nextInt();		
		boolean prime = true;
		
		//int num=43;
		for (int i=2; i<num; i++) {
			if (num%i==0) {
				prime = false;
				break;
			}	
		}
		if (prime==true) {
	      System.out.println(num + " is a prime number.");
		}else {
	      System.out.println(num + " is not a prime number.");
	    }	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
