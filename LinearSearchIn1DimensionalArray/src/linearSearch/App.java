package linearSearch;

class App {
	public static int linearSearch(int[] arr, int target) {
		int indexOfElement = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				indexOfElement = i;
				System.out.println("Element is present at index " + indexOfElement);
				return indexOfElement;
			}
		}
		System.out.println("System could not find the target");
		return -1;
	}

	public static void main(String args[]) {
		int arr[] = { 2, 3, 4, 10, 40 };
		int target = 10;
		linearSearch(arr, target);
	}
}
