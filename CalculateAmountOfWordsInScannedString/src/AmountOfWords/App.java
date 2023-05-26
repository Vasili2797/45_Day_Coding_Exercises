package AmountOfWords;

import java.util.Scanner;

// This is a program that will give the amount of words in an entered String
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");

		String enteredText = new String(sc.nextLine());
		int amountOfWords = getWordsAmount(enteredText);
		System.out.println("Amount of words in your text: " + amountOfWords);
	}

	public static int getWordsAmount(String text) {

		String[] strArray = null;
		strArray = text.split(" ");
		int amountOfWords = strArray.length;
		return amountOfWords;
	}
}
