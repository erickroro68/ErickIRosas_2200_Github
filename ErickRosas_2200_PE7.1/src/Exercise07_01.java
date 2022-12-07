/*
 * Erick Rosas
 * DATE: 12/07/2022
 * (Wednesday)
 */
import java.util.Scanner;
public class Exercise07_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//get number of Students
		System.out.print("Enter the number of Students: ");
		
		
		int numberOfStudents = input.nextInt();
		//creating an array for scores variable
		double[] scores = new double [numberOfStudents];
		double best = 0; //the best score to be computed and is greater than zero
		
		//read score and find the max
		System.out.print("Enter " + numberOfStudents + " scores: ");
		for(int i = 0; i < scores.length; i++) {
			scores[i] = input.nextDouble();
			//check if the value read is bigger than the "best"
			if ( scores[i] > best) {
				best = scores[i];
			}
		}
		//Assert: "best" is the max value of all the scores
		//System.out.println("the best score is: " + best);
		
		//Declare and Initialize a letter-grade string
		char grade;
		//Assign and display grades
		for(int i = 0; i < numberOfStudents; i++) {
			if (scores[i] >= best - 10) grade = 'A';
			else if (scores[i] >= best - 20) grade = 'B';
			else if (scores[i] >= best - 30) grade = 'C';
			else if (scores[i] >= best - 40) grade = 'D';
			else grade = 'F';
			
			System.out.println("Students " + i + " score is " + scores[i] + " and grade is " + grade);
		}
		
		//closing the input stream
		input.close();
	}

}
