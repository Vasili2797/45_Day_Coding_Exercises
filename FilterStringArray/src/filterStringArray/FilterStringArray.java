package filterStringArray;

import java.util.*;

//The testing string
//We are conducting a new type of program in Java
//word length filter size: 4

public class FilterStringArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any words separated by space: ");
		String userInput = sc.nextLine();
		System.out.print("Please, enter minumum word length to filter words: ");
		int minLength = sc.nextInt();

		String[] words = userInput.split("\\s+");
		String[] filteredWords = filterWordsByLength(minLength, words);
		System.out.println(Arrays.toString(filteredWords));
	}

	public static String[] filterWordsByLength(int minLength, String[] words) {
		ArrayList<String> arrayListst = new ArrayList<>();
		System.out.println(Arrays.toString(words));
		for (int i = 0; i < words.length; i++) {
			arrayListst.add(words[i]);
		}
		ArrayList<String> filteredArrayList = new ArrayList<>();

		for (int i = 0; i < arrayListst.size(); i++) {
			if (arrayListst.get(i).length() >= minLength) {
				System.out.println(arrayListst.get(i));
				filteredArrayList.add(arrayListst.get(i));
			}
		}

		System.out.println("The filtered arraylist: " + filteredArrayList);

		String[] newStringArray = new String[filteredArrayList.size()];
		newStringArray = filteredArrayList.toArray(new String[filteredArrayList.size()]);

		System.out.println("is the newStringArray an instance of String[]? ");
		System.out.println(newStringArray instanceof String[]);

		return newStringArray;
	}
}