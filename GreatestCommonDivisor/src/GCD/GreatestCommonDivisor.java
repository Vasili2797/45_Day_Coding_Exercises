package GCD;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter two numbers separated by space: ");
		String userInput = sc.nextLine();

		String[] inputArgumentsArray = userInput.split("\\s+");
		int number1 = Integer.parseInt(inputArgumentsArray[0]);
		int number2 = Integer.parseInt(inputArgumentsArray[1]);

		System.out.println(gcdRecursive(number1, number2));
	}

	public static int gcdRecursive(int firstNumber, int secondNumber) {
		int num = 1;
		int greaterNumber = 0;
		int gcd = 0;
		if (firstNumber > secondNumber) {
			greaterNumber = firstNumber;
		} else {
			greaterNumber = secondNumber;
		}

		for (int i = 1; i <= greaterNumber; i++) {
			if (firstNumber % i == 0 && secondNumber % i == 0) {
				gcd = i;
			}
		}
		return gcd;

	}

}