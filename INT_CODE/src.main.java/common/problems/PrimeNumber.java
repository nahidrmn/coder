package common.problems;

import java.util.Scanner;

/**
 * @author narahman
 *
 */
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberFromConsole = scanner.nextInt();
		scanner.close();
		boolean istheNumberPrime = true;
		for (int i = 2; i < numberFromConsole / 2; i++) {
			int tempNumber = numberFromConsole % i;
			if (tempNumber == 0) {
				istheNumberPrime = false;
				break;
			}
		}
		if (istheNumberPrime)
			System.out.println("Prime");
		else
			System.out.println("Not a prime");
	}
}