import java.util.Scanner;

public class TestLoop {
	Scanner keyboard = new Scanner(System.in);

	// testWhileLoopProblem()
	public void testWhileLoopProblem() {

		// declarations
		double sum = 0;
		double average = 0;
		double numberCounter = 0;
		String shouldContinue = "yes";

		// output "Indeterminate while loop demo"
		System.out.println("Indeterminate while loop demo");

		// sum = sum + user.inputDouble("Enter number: ")
		System.out.println("Enter number: ");
		sum = sum + keyboard.nextDouble();
		keyboard.nextLine();

		// numberCounter = numberCounter + 1
		numberCounter = numberCounter + 1;

		// shouldContinue = user.inputString("Enter more numbers (yes/no)? ")
		System.out.println("Enter more numbers (yes/no)?: ");
		shouldContinue = keyboard.nextLine();

		// while shouldContinue = "yes"
		while (shouldContinue.equalsIgnoreCase("yes")) {

			// sum = sum + user.inputDouble("Enter number: ")
			System.out.println("Enter number: ");
			sum = sum + keyboard.nextDouble();
			keyboard.nextLine();

			// numberCounter = numberCounter + 1
			numberCounter = numberCounter + 1;

			// shouldContinue = user.inputString("Enter more numbers (yes/no)? ")
			System.out.println("Enter more numbers (yes/no)?: ");
			shouldContinue = keyboard.nextLine();

			// endwhile
		}

		// average = sum / numberCounter
		average = sum / numberCounter;

		// output "Sum: " + sum // format to 4 decimal places
		System.out.printf("Sum :%.4f%n", sum);

		// output "Average: " + average // format to 4 decimal places
		System.out.printf("Average :%.4f%n", average);

		// output "Program by Your Name" // replace with your actual name as in ACSIS
		System.out.print("Program by Ishtiaque Matin");

		return;
	}

	// testDoWhileLoopProblem()
	public void testDoWhileLoopProblem() {

		// declarations
		double sum = 0;
		double average = 0;
		double numberCounter = 0;
		String shouldContinue = "yes";

		// output "Indeterminate do-while loop demo"
		System.out.println("Indeterminate do-while loop demo");

		// do
		do {

			System.out.print("Enter number: ");
			sum = sum + keyboard.nextDouble();
			keyboard.nextLine();
			numberCounter = numberCounter + 1;
			System.out.print("Enter more numbers (yes/no)? ");
			shouldContinue = keyboard.nextLine();

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
		System.out.print("Program by Ishtiaque Matin");

		return;
	}

	// testForLoopProblem()
	public void testForLoopProblem() {
		// declarations
		String sentence = "";
		double letterCount = 0;
		char extractedCharacter = 0; // char data type in Java
		int index = 0; // declare inside for loop in Java

		// output "Determinate for loop demo"
		System.out.println("Determinate for loop demo");

		// sentence = user.inputString("Enter a sentence: ")
		System.out.print("Enter a sentence: ");
		sentence = keyboard.nextLine();
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
			// endif

		} // endfor

		// output "Number of 'a' counted: " + letterCount
		System.out.println("Number of 'a' counted: " + letterCount);

		// output "Input string contained " + length + " letters
		System.out.println("Input string contained " + length + " letters");

		// output "Program by Your Name" // replace with your actual name as in ACSIS
		System.out.print("Program by Ishtiaque Matin");

		return;
	}

}
