package common.problems;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SwapTwoNumbersWithoutThirdVariable {
	public static void main(String[] args) {
		int x, y;
		Scanner in;
		while (true) {
			try {
				System.out.println("enter x and y:");
				in = new Scanner(System.in);
				x = in.nextInt();
				y = in.nextInt();
			} catch (InputMismatchException e) {
				System.out.print("invalid entry, ");
				continue;
			}
			break;
		}
		in.close();
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println(x + " " + y);
	}
}