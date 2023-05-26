package areaOfTriangleUsingHeronsFormula;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please, enter A side of a triangle: ");
		int aTriangle = sc.nextInt();

		System.out.print("Please, enter B side of a triangle: ");
		int bTriangle = sc.nextInt();

		System.out.print("Please, enter C side of a triangle: ");
		int cTriangle = sc.nextInt();

		double triangleArea = 0.0;
		double p = 0.0;
		double triangleAreaBeforePowering = 0.0;

		if (aTriangle <= 0 || bTriangle <= 0 || cTriangle <= 0) {
			System.out.println("NaN");
		} else {
			p += 0 + (((double) aTriangle + (double) bTriangle + (double) cTriangle) / 2);
			System.out.println("The value for P is: " + p);
			triangleAreaBeforePowering = (p * (p - (double) aTriangle) * (p - (double) bTriangle)
					* (p - (double) cTriangle));
			if (triangleAreaBeforePowering > 0) {
				System.out.println("The value for triangle area before powering is: " + triangleAreaBeforePowering);
				triangleArea = Math.sqrt(triangleAreaBeforePowering);
				System.out.println("The area is " + triangleArea);
			} else {
				System.out.println("The area is: NaN");
			}
			
		}
	}

}
