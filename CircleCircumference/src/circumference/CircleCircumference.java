package circumference;

/*
 * If I do javac *.java then run it in cmd, if I have package declared, it does not work
 * 
 * However, if I have package declared and do not compile it(javac *.java) then it will run right
 * away
 * 
*/
import java.util.Scanner;

public class CircleCircumference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter circle radius: ");

		int radiusSize = sc.nextInt();
		double circleCircumference = 2 * (double) radiusSize * Math.PI;

		System.out.println("Circle circumference is: " + circleCircumference);
	}

}