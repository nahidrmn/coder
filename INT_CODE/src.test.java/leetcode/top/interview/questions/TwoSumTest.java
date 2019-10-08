package leetcode.top.interview.questions;

public class TwoSumTest {
	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] result = new TwoSum().twoSum(nums, target);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}