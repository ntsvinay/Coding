package leetCode.Easy;


public class AddTwoNumber {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int cr = 0;
		ListNode listNode1 = new ListNode(0);
		ListNode listNode = listNode1;
		while (l1 != null || l2 != null) {
			int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + cr;
			if (l1 != null) {
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}
			cr = sum / 10;

			ListNode temp = new ListNode(sum % 10);
			listNode.next = temp;
			listNode = listNode.next;
		}
		if (cr > 0) {
			ListNode temp = new ListNode(cr);
			listNode.next = temp;
			listNode=listNode.next;
		}
		return listNode1.next;

	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 3 };
		int[] arr1 = { 5, 6, 4 };
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
		AddTwoNumber addNumber = new AddTwoNumber();
		ListNode rtnNode = addNumber.addTwoNumbers(l1, l2);

		while (rtnNode != null) {
			System.out.print(rtnNode.val);
			rtnNode = rtnNode.next;
		}
	}

}
