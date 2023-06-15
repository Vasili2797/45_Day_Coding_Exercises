package reverseAnArray;

public class App {
	public static void reverseGroceries(String[] groceryList) {
		int j = groceryList.length - 1;
		for (int i = 0; i < groceryList.length / 2; i++) {
			String temp = groceryList[i];
			groceryList[i] = groceryList[j];
			groceryList[j] = temp;
			j--;
		}
	}

	public static void main(String[] args) {
		// Below is a sample test case you can use to run your code.
		// Try playing around with different values in the array to test edge cases
		String[] groceryList = { "apples", "banana", "Apples", "chocolate" };
		reverseGroceries(groceryList);

		for (String item : groceryList) {
			System.out.println(item);
		}
	}
}
