/***************************
 * 
 * @author Erick Rosas
 *	DATE: 11/14/2022 (Monday)
 *
 ****************************/
import java.util.Scanner;
public class Exercise06_04 {

	//Main mathod for the prompts shows to the user
	public static void main(String[] args) {
		System.out.print("Enter and integer: ");
		// instead of typing this scanner java.util.Scanner input = new java.util.Scanner(System.in);
		//import scanner first in line 7 then...
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		reverse(number);
		
		//we have to close the input 
		input.close();
	}
	
	//Reverse method will reverse the number given from the prompt above
	 public static void reverse(int n) {
		 
		 //if given 0 it will only display 0
		 if (n==0) {
			System.out.print(n);
		 }
		 while ( n != 0 ) {
			 System.out.print(n % 10);
			 n = n /10;
			 
		 }
	 }
}
