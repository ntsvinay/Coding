package leetCode.Mid;

import leetCode.Easy.ListNode;

public class SwapPairs {
	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode reslt = head, prev = null;

		while (reslt != null && reslt.next != null) {
			
			ListNode temp = reslt.next;// { 1, 2, 3, 4 };
			reslt.next = temp.next;
			temp.next = reslt;

			if (prev == null) {
				head = temp;
			} else {
				prev.next = temp;
			}
			prev = reslt;
			reslt = reslt.next;
		}
		return head;

		/*
		 * ListNode curr = head, prev = null;
		 * 
		 * // consider two nodes at a time and swap their links while (curr != null &&
		 * curr.next != null) { ListNode temp = curr.next; curr.next = temp.next;
		 * temp.next = curr;
		 * 
		 * if (prev == null) { head = temp; } else { prev.next = temp; }
		 * 
		 * prev = curr; curr = curr.next; }
		 * 
		 * return head;
		 */
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		ListNode l1 = null;
		for (int val : arr) {
			ListNode temp = new ListNode(val, l1);
			l1 = temp;
		}
		ListNode rslt = new SwapPairs().swapPairs(l1);
		while (rslt != null) {
			System.out.println(rslt.val);
			rslt = rslt.next;
		}
	}
}