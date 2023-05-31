package DigitScanner;

//import java.util.Scanner;
//
//public class App {
//	public static void main(String[] args) {
//		System.out.print("Please, enter any integer: ");
//		Scanner scanner = new Scanner(System.in);
//		int numberEntered = scanner.nextInt();
//		String numberToString = Integer.toString(numberEntered);
//		for (int i = 0; i < numberToString.length(); i++) {
//			char c = numberToString.charAt(i);
//			System.out.println(c);
//		}
//	}
//}

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class App {

//	public static void main(String[] args) {
//		System.out.print("Please, enter height of the pyramid: ");
//		Scanner scan = new Scanner(System.in);
//		int numScanned = scan.nextInt();
//		for (int i = 1; i <= numScanned; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = 1; i <= numScanned; i++) {
//			for (int j = numScanned; j > i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		System.out.println("Please enter something to output back");

		Scanner scan = new Scanner(System.in);
		String scannedString = scan.nextLine();
		System.out.println(scannedString);

		ArrayList<Integer> scannedNumbersArrayList = new ArrayList<Integer>();
		System.out.println("Now I want you to write to me numbers:");
		String str;
		boolean valueOfTrue = true;
		do {
			str = scan.nextLine();
			if (!str.equalsIgnoreCase("")) {
				valueOfTrue = false;
				break;
			}
		} while (valueOfTrue);

		System.out.println(str);
		String[] numberWords = str.split(", ");

		System.out.println("The f is this? " + Arrays.toString(numberWords));
		System.out.println(numberWords instanceof String[]);
		//At  this moment, I know that the instance is an array of strings... How to I convert it to an int array?
		
		int[] result = Arrays.stream(numberWords).mapToInt(Integer::parseInt).toArray();
		System.out.println(Arrays.toString(result));
		System.out.println("The instance of this is now an int array:");
		System.out.println(result instanceof int[]);
		
//		int[] numbersIntArray = new int[numberWords.length];
//		for (int i = 0; i < numberWords.length; i++) {
//			numbersIntArray[i] = Integer.parseInt(numberWords[i]);
//		}
//		System.out.println(Arrays.toString(numbersIntArray));
		// System.out.println(scannedNumbersArrayList);
		// System.out.println("Thank you!");
		// System.out.println("The maximum number is: "+maxNumber());
	}

	public int maxNumber(int[] argument1) {
		int maximum = 0;
		for (int i = 0; i < argument1.length; i++) {
			if (argument1[i] > maximum) {
				maximum = argument1[i];
			}
		}
		return maximum;
	}
}
