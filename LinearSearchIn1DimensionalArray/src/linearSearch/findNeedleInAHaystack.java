package linearSearch;

public class findNeedleInAHaystack {

	public static int linearSearch2D(String[][] haystack, String target) {
		int value = -1;
		for (int row = 0; row < haystack.length; row++) {
			for (int column = 0; column < haystack[row].length; column++) {
				if (target.equals(haystack[row][column])) {
					System.out.println(target + " located at [" + row + "][" + column + "].");
					value = 1;
				}
			}
		}
		return value;
	}

	public static void main(String[] args) {
		String[][] haystack = { { "hay", "hay" }, { "hay", "hay" }, { "hay", "hay" }, { "hay", "hay" },
				{ "needle", "hay" }, { "hay", "hay" } };
		String target = "needle";
		linearSearch2D(haystack, target);
	}

	public static void selectionSort(int arr[]) {
		int size = arr.length;
		for (int i = 0; i < size - 1; i++) {
			int currentMinimumIndex = i;
		}
	}
}
