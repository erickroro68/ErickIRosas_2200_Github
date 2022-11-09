/**************************************************************************************************************
 * 
 * NAME: Erick Rosas
 * DATE: 11/09/2022
 * (Wednesday)
 *
 *******************************************************************/
import java.util.Scanner;

public class Exercise06_23 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String: ");
		//reading the string the user types
		String s = input.nextLine();
		
		System.out.print("Enter a Character: ");
		//reading the string the user types
		char c = input.nextLine().charAt(0);
		
		int count = count(s,c);
		System.out.println("The number of occurences of " + c + " in " + s + " is " + count);

	}
	
	//We are defying count as a static method since we do not want to make it an object
	//we have to return a count since is not voided
	public static int count(String str, char ch) {
	//defining a counter
		int count = 0;
		//making a for loop
		//counting up to the length of the string variable
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			} //we still need a return value
		}
		
		return count;
	}
}
