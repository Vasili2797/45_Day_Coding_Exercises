package genericsArrayListExample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		ArrayList<Object> allArrayList = new ArrayList<>();
		allArrayList.add(1);
		allArrayList.add("Some String");
		allArrayList.add(1.234);
		allArrayList.add(true);
		for (int i = 0; i < allArrayList.size(); i++) {
			System.out.print(allArrayList.get(i) + "\n");
		}
		List<Integer> integerList = new ArrayList<>();
		long start = System.currentTimeMillis();

		fillOutList(integerList, getRandomNumber(1000, 10000000));
		long end = System.currentTimeMillis();
		System.out.println("The time it took for it was " + (end - start) + " ms");

		List<Integer> newIntegerList = new LinkedList<>();
		long LinekdListStart = System.currentTimeMillis();
		fillOutList(integerList, getRandomNumber(1000, 10000000));

		long LinkedListEnd = System.currentTimeMillis();
		System.out.println("The time it took for LinkedList was " + (LinkedListEnd - LinekdListStart) + " ms");
	}

	private static void fillOutList(List<Integer> list, int amountOfElements) {
		for (int i = 0; i < amountOfElements; i++) {
			list.add(i);
			list.add((list.size()/2),i);
		}
	}

	public static int getRandomNumber(int min, int max) {
		return (int) ((Math.random() * (max - min)) - min);
	}
}
