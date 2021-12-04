package firstnLast;

import java.util.Scanner;

public class FirstnLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*[EASY] 4. If user enters input as 1, print ”First movie”, 8, print “Last movie”. For
		anything else, print “Not First or Last movie” */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter movie number: ");
		
		int movieNumber = input.nextInt();
		input.close();
		
		if (movieNumber == 1) {
			System.out.println("First movie");
		} else if (movieNumber == 8) {
			System.out.println("Last movie");
		} else {
			System.out.println("Not First or Last movie");
		}
			

	}//End of main

}//End of class
