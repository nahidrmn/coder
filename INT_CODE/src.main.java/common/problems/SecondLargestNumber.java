package common.problems;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int numbers[] = { 13, 73, 89, 7, 12, 44, 45, 98 };
		int largest = numbers[0];
		int secondLargest = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				secondLargest = largest;
				largest = numbers[i];
			} else if (numbers[i] > secondLargest && numbers[i] != largest) {
				secondLargest = numbers[i];
			}
		}
		System.out.println("secondLargest: " + secondLargest);
	}
}