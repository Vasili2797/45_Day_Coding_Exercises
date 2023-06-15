package TotalOfArrayList;

import java.util.ArrayList;;

class Total {

	public static int getTotal(ArrayList<Integer> arr) {
		int sum = 0;
		if (arr.size() == 0) {
			return 0;
		} else {
			for (int i = 0; i < arr.size(); i++) {
				sum += arr.get(i);
			}
		}
		return sum;
	}

	public static String reverseString(String text) {
		String reversed = new String("");
		for (int i = 0; i < text.length(); i++) {
			reversed = text.charAt(i) + reversed;
		}
		return reversed;
	}

	public static void main(String[] args) {
		ArrayList<Integer> myArrayLs = new ArrayList<Integer>();
		myArrayLs.add(3);
		myArrayLs.add(5);
		myArrayLs.add(6);
		myArrayLs.add(9);

		int total = getTotal(myArrayLs);
		System.out.println(total);
		
		System.out.println(reverseString("This is the string we will reverse!"));
	}
}
