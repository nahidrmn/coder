package common.problems;

import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String numberAsString = in.next();
		in.close();
		
		/*int result = 0;
		for (int i = 0; i < numberAsString.length(); i++) {
			result = result * 10 + numberAsString.charAt(i) - '0';
		}
		System.out.println(result);

		int java8Results = numberAsString.chars().reduce(0, (a, b) -> 10 * a + b - '0');
		System.out.println(java8Results);*/
		
		System.out.println(myAtoi(numberAsString));
	}
	
	public static int myAtoi(String str) {
		if(str == null || str.isEmpty())
			return 0;
		return 0;
	}

}
