package iterateThroughDigitsInNumber;

public class App {
	public static int getReverseBudget(int budget) {
		int reverseBudget = 0;
		int temp = 0;
		while (budget > 0) {
			System.out.println("original temp " + temp);
			temp = budget % 10;
			System.out.println("temp " + temp);
			budget /= 10;
			System.out.println("budget " + budget);
			reverseBudget = (reverseBudget * 10) + temp;
			System.out.println("reverseBudget " + reverseBudget);
		}

		return reverseBudget;
	}

	public static void main(String[] args) {
		// Try passing different arguments for your budget with varying numbers of
		// digits, like 62, 374, 599, etc
		System.out.println(getReverseBudget(123));
	}
}

class GroceryList {
	public static boolean hasSpecialItem(double[] groceryPrices) {
		for (double itemCost : groceryPrices) {
			String itemCostStr = String.valueOf(itemCost);
			if (itemCostStr.length() > 1
					&& itemCostStr.substring(itemCostStr.length() - 2, itemCostStr.length()).equals("99")) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		// Below is a sample test case you can use to run your code.
		// Try playing around with different values in the array to test edge cases
		double[] groceryList = { 10.0, 89.9, 8.99, 2.34 };
		System.out.println(hasSpecialItem(groceryList));
	}
}
