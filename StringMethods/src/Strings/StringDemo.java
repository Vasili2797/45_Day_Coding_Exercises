package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) throws IOException {
		System.out.println();
		System.out.println("=====String Methods=====");
		System.out.println();

		String s = "    hello   ";
		System.out.println("s.length(): " + s.length());
		System.out.println("s.contains(\"lo\"): " + s.contains("lo"));
		System.out.println("s.isEmpty(): " + s.isEmpty());

		System.out.println("s.toUpperCase(): " + s.toUpperCase());
		System.out.println("s.toLowerCase(): " + s.toLowerCase());
		System.out.println("s.startsWith(\"h\"): " + s.startsWith("h"));
		System.out.println("s.endsWith(\"o\"): " + s.endsWith("o"));
		System.out.println("s.replace('h', 'j'): " + s.replace('h', 'j'));

		System.out.println("s.trim(): " + s.trim()); //
		System.out.println("s.strip(): " + s.strip());
		System.out.println("s.stripLeading(): " + s.stripLeading()); // Only removes spaces in front
		System.out.println("s.stripTrailing(): " + s.stripTrailing()); // Only removes spaces in back

		System.out.println("s.substring(): " + s.stripLeading().substring(1, 4));
		System.out.println("Arrays.toString(s.toCharArray()): " + Arrays.toString(s.strip().toCharArray()));
		System.out.println("s.charAt(2): " + s.strip().charAt(2));
		System.out.println(
				"To get the bytes of each character: Arrays.toString(s.getBytes()) " + Arrays.toString(s.getBytes()));
		System.out.println("Arrays.toString(s.split(\"e\"): " + Arrays.toString(s.split("e")));
		System.out.println(s); // All the strings are immutable. Meaning, the original string doesn't change, a
								// new one is created

		String s2 = "    hello   ";
		System.out.println(s == s2);
		String s3 = new String("    hello   ");
		System.out.println(s.equals(s3));

		String greetingsTemplate = "Hello, dear %s! Good %s!";
		System.out.println("What is your name kind sir?");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name = reader.readLine();
		String firstName = name;
		String morning = "morning";
		String afternoon = "afternoon";
		String evening = "evening";
		String formattedString = String.format(greetingsTemplate, firstName, morning);
		System.out.println(formattedString);

		// the number Pi in different decimal places
		System.out.println();
		System.out.printf("%.1f%n", Math.PI);
		System.out.printf("%.2f%n", Math.PI);
		System.out.printf("%.3f%n", Math.PI);
		System.out.printf("%.4f%n", Math.PI);
		System.out.printf("%.5f%n", Math.PI);

		// Ask users to enter text and then split words
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter any text here:");
		String userInput = scanner.nextLine();
		System.out.println("These are the words enterd in an array format:");
		System.out.println(Arrays.toString(userInput.split("[\\p{P}\\s]+")));

	}
}
