/***********************
 * 
 * @author Erick Rosas
 * DATE: 11/16/2022
 * (Wednesday)
 *
********************** */

import java.util.Scanner;
public class Exercise06_04v2 {

		//Main method for the prompts shows to the user
		public static void main(String[] args) {
			System.out.print("Enter and Integer Positive or Negative: ");
			Scanner input = new Scanner(System.in);
			int number = input.nextInt();
			reverse(number);
			
			//we have to close the input 
			input.close();
		}
		
		//Reverse method will reverse the number given from the prompt above Positive or NEgative
		 public static void reverse(int n) {
			 
			 //if number is negative it will put a negative in front of the integers and reverse the rest of the numbers times -1
	
			 if (n < 0) {
				System.out.print("-");
				reverse (n * -1);
			 }
			 //if number is less than 10 it wont change since you cant reverse a single number
			 else if (n < 10 ) {
				 System.out.println(n);
			 }
			 //if all is false than it will reverse the integer
			 else {
				 System.out.print(n % 10);
				 reverse (n / 10);
			 }
	
		 }
	}

