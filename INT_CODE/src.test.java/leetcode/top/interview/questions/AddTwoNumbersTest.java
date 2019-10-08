package leetcode.top.interview.questions;

import leetcode.top.interview.questions.util.ListNode;

public class AddTwoNumbersTest {
	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(9);
		ListNode listNode1Node2 = new ListNode(8);
		ListNode listNode1Node3 = new ListNode(7);
		listNode1.next = listNode1Node2;
		listNode1Node2.next = listNode1Node3;
		listNode1Node3.next = null;

		ListNode listNode2 = new ListNode(9);
		ListNode listNode2Node2 = new ListNode(7);
		ListNode listNode2Node3 = new ListNode(6);
		listNode2.next = listNode2Node2;
		listNode2Node2.next = listNode2Node3;
		listNode2Node3.next = null;

		ListNode resultNode = new AddTwoNumbers().addTwoNumbers(listNode1, listNode2);

		while (resultNode != null) {
			System.out.println(resultNode.val);
			resultNode = resultNode.next;
		}
	}
}