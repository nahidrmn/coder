package leetcode.top.interview.questions;

public class LongestSubstringWithoutRepeatingCharactersTest {
	public static void main(String[] args) {
		String inputCase1 = "abcabcbb";
		String inputCase2 = "bbbbb";
		String inputCase3 = "pwwkew";
		System.out.println("Length of longest substring of " + inputCase1 + " is: "
				+ new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(inputCase1));
		System.out.println("Length of longest substring of " + inputCase2 + " is: "
				+ new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(inputCase2));
		System.out.println("Length of longest substring of " + inputCase3 + " is: "
				+ new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(inputCase3));
	}
}