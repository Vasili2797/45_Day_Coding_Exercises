package alphabeticalOrderCheck;

public class GroceryList {
	public static boolean isAlphabetized(String[] groceryList) {
		if (groceryList.length > 1) {
			String lastGroceryItem = groceryList[0];
			for (int i = 0; i < groceryList.length; i++) {
				if (lastGroceryItem.compareTo(groceryList[i]) > 0) {
					return false;
				}
				lastGroceryItem = groceryList[i];
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// Below is a sample test case you can use to run your code.
		// Try playing around with different values in the array to test edge cases
		String[] groceryList = { "apples", "banana", "bananas", "chocolate" };
		System.out.println(isAlphabetized(groceryList));
	}
}
