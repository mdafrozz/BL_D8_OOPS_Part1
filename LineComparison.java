package line_comparison_computation;

import java.util.Scanner;

public class LineComparison {
	
	public static int getInputFromUser(String number) {
		System.out.println("Enter Value of " + number+":");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public static void main(String[] args) {
		System.out.println("-----------Welcome to Line Comparison Computation-----------");

		// UC1 - Calculate Length
		System.out.println("Enter Co-ordinates (x1, y1)");
		int x1 = getInputFromUser("x1");
		int y1 = getInputFromUser("y1");
		System.out.println("Enter Co-ordinates (x2, y2)");
		int x2 = getInputFromUser("x2");
		int y2 = getInputFromUser("y2");
		double x = Math.pow((x2 - x1), 2);
		double y = Math.pow((y2 - y1), 2);
		Double length = Math.floor(Math.sqrt(x + y));
		System.out.println("Length is: " + length);
		

	}
}
