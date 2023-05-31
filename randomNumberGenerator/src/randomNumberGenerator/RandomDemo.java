package randomNumberGenerator;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println("Random any integer generator "+r.nextInt());
		System.out.println("Random integer generator between 0 and 9: "+r.nextInt(100));
		System.out.println("Random integer generator between 1 and 100: "+r.nextInt(100)+1);
	}
}
