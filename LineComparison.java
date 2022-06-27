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
		System.out.println("Enter the first line co-ordinates");
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
		
		//UC2 - Equality of two lines
		System.out.println("Enter the second line co-ordinates");
        System.out.println("Enter Co-ordinates (a1, b1) point");
        int a1 = getInputFromUser("a1");
        int b1 = getInputFromUser("b1");
        System.out.println("Enter Co-ordinates (a2, b2) point");
        int a2 = getInputFromUser("a2");
        int b2 = getInputFromUser("b2");
        double a = Math.pow((a2 - a1), 2);
        double b = Math.pow((b2 - b1), 2);
        double length1 = Math.floor(Math.sqrt(a + b));
        System.out.println("Length is: " + length1);

	}
}
