package common.problems;

public class StringReverseWithReverseFunction {
	public static void main(String[] args) {
		String string = "Automation";
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(string);
		stringBuilder = stringBuilder.reverse();
		System.out.println(string + " " + stringBuilder);
	}
}
