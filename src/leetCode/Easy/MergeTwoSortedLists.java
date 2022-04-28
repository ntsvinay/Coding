package leetCode.Easy;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null && list2 == null) {
			return list1;
		} else if (list1 == null && list2 != null) {
			return list2;
		} else if (list1 != null && list2 == null) {
			return list1;
		}
		if (list1.val < list2.val) {
			list1.next = mergeTwoLists(list1.next, list2);
			return list1;
		} else {
			list2.next = mergeTwoLists(list1, list2.next);
			return list2;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4 };
		int[] arr1 = { 1, 2, 4 };
		ListNode l1 = null;
		ListNode l2 = null;
		for (int val : arr) {
			ListNode temp = new ListNode(val, l1);
			l1 = temp;
		}
		for (int val : arr1) {
			ListNode temp = new ListNode(val, l2);
			l2 = temp;
		}
		ListNode li = new MergeTwoSortedLists().mergeTwoLists(l1, l2);
		while (li != null) {
			System.out.print(li.val);
			li = li.next;
		}
	}
}