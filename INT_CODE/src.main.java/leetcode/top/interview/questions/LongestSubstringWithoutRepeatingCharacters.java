package leetcode.top.interview.questions;

import java.util.HashSet;
import java.util.Set;
/*
Given a string, find the length of the longest substring without repeating characters.

Example 1:
Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 

Example 2:
Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
             
Complexity Analysis
Time complexity : O(n). Index i will iterate n times.
Space complexity (HashMap) : O(min(m,n)). Same as the previous approach.
Space complexity (Table): O(m). m is the size of the charset.
*/

public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<>();
		int i = 0, j = 0, max = 0;

		while (i < s.length()) {
			if (!set.contains(s.charAt(i))) {
				set.add(s.charAt(i++));
				max = Math.max(max, set.size());
			} else {
				set.remove(s.charAt(j++));
			}
		}
		return max;
	}
}