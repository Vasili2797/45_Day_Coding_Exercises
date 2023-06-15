package sortedArray;

import java.util.Arrays;

class SortedArray {
	public static void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > current) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = current;
		}
//		 System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		int[] intArray = { 1, 4, 6, 2, 3, 14, 16, 7, 5, 15 };
		sort(intArray);
		System.out.println(Arrays.toString(intArray));
	}
}