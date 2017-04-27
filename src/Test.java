
/*
 * Program to check the age of a person is eligible to vote or not
 */

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the age of the person ");
		int age = scanner.nextInt();

		// Writing our logic in try catch block to handle exceptions

		try {
			if (age < 18) {
				throw new NegativeAgeException("You are not eligible to vote"); // throwing
																				// our
																				// created
																				// user
																				// defined
																				// exception
			} else {
				System.out.println("You are eligible to vote");
			}
		} catch (NegativeAgeException e) {
			System.out.println(e);
		}
	}

}
