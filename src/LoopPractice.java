/*
 *Student Name: Ishtiaque Matin
 *Theory Professor: Siju Philip
 *Theory Section Number: CST8116_360
 *Lab Professor: Siju Philip
 *Lab Section Number: CST8116_363
 * Due Date: Nov 19th, 2021
 * Modified: Nov 19th, 2021
 * Description: This class will practise the three types of loops
*/

//  the class contains the 3 methods
public class LoopPractice {

	private User user = new User(); // use this to get inputs

	// programer = "Program by Ishtiaque Matin"
	private final String programer = "Program by Ishtiaque Matin";

	//this method will test the while loop
	public void testWhileLoopProblem() {

		// declarations
		double sum = 0;
		double average = 0;
		int numberCounter = 0;
		String shouldContinue = "yes";

		// output "Indeterminate while loop demo"
		System.out.printf("%s%n", "Indeterminate while loop demo");
		// ToDo: Part 1: indeterminate loop
		// prompt user for a number
		// add their input to sum
		// ask if they want to enter more numbers
		// get their response
		// repeat the steps until they enter something that is not "yes"
		// use a while loop.
		// output the resulting sum using printf, format to 4 decimal places
		// output the resulting average using printf, format to 4 decimal places
		// output your name using printf

		// sum = sum + user.inputDouble("Enter number: ")
		sum = user.inputDouble("Enter number: ");

		// numberCounter = numberCounter + 1
		numberCounter = numberCounter + 1;

		// shouldContinue = user.inputString("Enter more numbers (yes/no)? ")
		shouldContinue = user.inputString("Enter more numbers (yes/no)?: ");

		// while shouldContinue = "yes"
		while (shouldContinue.equalsIgnoreCase("yes")) {

			// sum = sum + user.inputDouble("Enter number: ")
			System.out.print("Enter number: ");
			sum = sum + user.inputDouble();

			// numberCounter = numberCounter + 1
			numberCounter = numberCounter + 1;

			// shouldContinue = user.inputString("Enter more numbers (yes/no)? ")
			shouldContinue = user.inputString("Enter more numbers (yes/no)?: ");

			// end while
		}

		// average = sum / numberCounter
		average = sum / numberCounter;

		// output "Sum: " + sum // format to 4 decimal places
		System.out.printf("Sum :%.4f%n", sum);

		// output "Average: " + average // format to 4 decimal places
		System.out.printf("Average :%.4f%n", average);

		// output "Program by Your Name" // replace with your actual name as in ACSIS
		System.out.print(programer);

		return;

	}

	//this method will test do while loop
	public void testDoWhileLoopProblem() {

		// declarations
		double sum = 0;
		double average = 0;
		int numberCounter = 0;
		String shouldContinue = "yes";

		System.out.printf("%n%nIndeterminate do-while loop demo%n");
		// ToDo: Part 2: indeterminate loop
		// prompt user for a number
		// add their input to sum
		// ask if they want to enter more numbers
		// get their response
		// repeat the steps until they enter something that is not "yes"
		// **use a do-while loop instead**
		// output the resulting sum using printf, format to 4 decimal places
		// output the resulting average using printf, format to 4 decimal places
		// output your name using printf
		// you may re-use your code from part 1 with changes for do-while loop

		// do while shouldContinue = "yes"
		do {

			System.out.print("Enter number: ");
			sum = sum + user.inputDouble();

			numberCounter = numberCounter + 1;

			System.out.print("Enter more numbers (yes/no)? ");
			shouldContinue = user.inputString();

		}
		// while shouldContinue = "yes"
		while (shouldContinue.equalsIgnoreCase("yes"));

		// average = sum / numberCounter
		average = sum / numberCounter;

		// output "Sum: " + sum // format to 4 decimal places
		System.out.printf("Sum :%.4f%n", sum);

		// output "Average: " + average // format to 4 decimal places
		System.out.printf("Average :%.4f%n", average);

		// output "Program by Your Name" // replace with your actual name as in ACSIS
		System.out.print(programer);

		// end while

		return;

	}

	//this method will test the for loop
	public void testForLoopProblem() {

		// declarations
		String sentence = "";
		int letterCount = 0;
		char extractedCharacter = 0;
		int index = 0; // declare inside for loop in Java

		// output "Determinate for loop demo"
		System.out.printf("%n%nDeterminate for loop demo%n");
		// ToDo: Part 3: determinate loop
		// prompt the user to enter a sentence
		// input the sentence
		// use a for loop to count the number of occurrences of lower-case 'a'
		// in the sentence.
		// output the resulting count of letter 'a' using printf
		// output the number of letters in the String.
		// output your name using printf

		// Tip(s):

		// class String has a .length() method that lets you know how many times
		// you need to loop.

		// Strings are a sequence of letters indexed from zero to (length - 1)

		// class String has a method .charAt(index) that returns the char
		// located at that index

		// an if statement can check if the extractedCharacter == 'a'
		// and add 1 to the letterCount if this is true.

		// a for loop can start at index 0, and increment up to the length
		// of the String to check each letter one at a time using charAt(index)
		// of class String.

		// sentence = user.inputString("Enter a sentence: ")
		System.out.print("Enter a sentence: ");
		sentence = user.inputString();
		double length = sentence.length();

		for (index = 0; index < sentence.length(); index++) {

			extractedCharacter = sentence.charAt(index);

			// if extractedCharacter = 'a'
			if (extractedCharacter == 'a') {
				letterCount = letterCount + 1;
			} else if (extractedCharacter == 'A') {
				letterCount = letterCount + 1;
			} else if (extractedCharacter == ' ') {
				length = length - 1;
			}
			// end if

		} // end for

		// output "Number of 'a' counted: " + letterCount
		System.out.println("Number of 'a' counted: " + letterCount);

		// output "Input string contained " + length + " letters
		System.out.println("Input string contained " + length + " letters");

		// output "Program by Your Name" // replace with your actual name as in ACSIS
		System.out.print(programer);

		return;

	}

}
