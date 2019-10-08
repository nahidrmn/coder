package common.problems;

import java.util.Scanner;

public class StringReverseWithoutUsingInbuiltFunction {
	public static void main(String[] args) {
		System.out.println("Enter the String to be reversed");
		Scanner in = new Scanner(System.in);
		try {
			String original = in.nextLine();

			char chars[] = original.toCharArray();
			StringBuilder stringBuilder = new StringBuilder();
			for (int i = chars.length - 1; i >= 0; i--) {
				stringBuilder.append(chars[i]);
			}
			System.out.println(stringBuilder);

		} catch (Exception e) {
			System.out.println("Exception in main method: " + e.getMessage());
		} finally {
			in.close();
		}

	}
}