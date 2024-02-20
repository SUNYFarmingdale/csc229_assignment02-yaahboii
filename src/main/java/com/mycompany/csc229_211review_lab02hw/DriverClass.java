package com.mycompany.csc229_211review_lab02hw;
import java.util.Scanner;
/**
 *
 * @author Eric Paiz
 */
public class DriverClass {
	
	public static void main(String[] args) {
		// ToDo 5: Fix the error
		
		// ToDo 6: Fix the constructor of Student class
		
		// ToDo 7: Add a toString method for Student class
		
		Student std1= new Student("James",(short)20);
		
		// ToDo 8: Set the gpa of the student using the scanner and user
		// 			input and then print the output.

		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);
		// User GPA input prompt
		System.out.println("Enter GPA for student: ");
		// assigns the GPA input to the gpa variable
		double gpa = scanner.nextDouble();
		scanner.close();
		// uses the gpa mutator method with the gpa variable
		std1.setGpa(gpa);
		System.out.println(std1);
		
		// ToDo 9: add comments and explain your code
		
		// ToDo 10: submit using a pull request.
	}

}