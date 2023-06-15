package projectPracticeTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please, enter length of side A of a triangle: ");
		double aTriangle = sc.nextDouble();

		System.out.println("Please, enter length of side B of a triangle: ");
		double bTriangle = sc.nextDouble();

		System.out.println("Please, enter length of side C of a triangle: ");
		double cTriangle = sc.nextDouble();

		double p = (aTriangle + bTriangle + cTriangle) / 2;

		// System.out.println("The value for P is: "+p);
		double triangleArea = Math.sqrt(p * (p - aTriangle) * (p - bTriangle) * (p - bTriangle));
		;
		// System.out.println("The value for triangle area before powering is: "
		// +triangleAreaBeforePowering);
		System.out.println("Tiangle area is: " + triangleArea);

	}

}
