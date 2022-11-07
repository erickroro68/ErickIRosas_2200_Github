/*
 * ERICK ROSAS
 * DATE: 11/7/2022 (Monday)
 */

import java.util.Scanner;

public class Exercise06_13 {
	
	public static void main(String[] args) {
		
		//4s%20s\n is the number of whitespaces we see in the code
		//Creating the 
		System.out.printf("%4s%20s\n","i","m(i)");
		System.out.printf("%5s%19s\n","---","------");
		//still need a loop
		//max loop of 20
		for(int i = 1; i <= 20; i++) {
			System.out.printf("%4d%20.4f\n",i,m(i));
		}
	}
	
	public static double m(int i) {
		double sum = 0;
		for (int k = 1; k <= i; k++) {
			sum += k/ (k + 1.0);
			
		}
		
		//have to return the sum
		return sum;
	}

}
