package common.problems;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int fiboNumber = in.nextInt();
		in.close();
		int a = 0, b = 0, c = 1;

		for (int i = 0; i < fiboNumber; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(a + " ");
		}

	}

}
