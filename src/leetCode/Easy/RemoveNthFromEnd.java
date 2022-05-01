package leetCode.Easy;

public class RemoveNthFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {

		int size = 0;
		ListNode tmp = head;
		while (tmp != null) {
			size++;
			tmp = tmp.next;
		}

		if (head == null) {
			return head;
		} else if (n == 0) {
			head = head.next;
			size--;
			if (head == null) {
				return head;
			}
		} else if (n > size) {
			int ind = 0;
			ListNode node = head;
			while (ind < size) {
				ind++;
				node = node.next;
			}
			node.next = null;

		} else if (n == size) {
			return head.next;
		} else {
			int ind = 0;
			ListNode node = head;
			while (ind < n) {
				System.out.println(node.val);
				node = node.next;
				ind++;
			}
			node.next = node.next.next;
		}

		return head;
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		ListNode sec = new ListNode(2, head);
		ListNode third = new ListNode(3, sec);
		ListNode forth = new ListNode(4, third);
		ListNode fifth = new ListNode(5, forth);
		ListNode rslt = new RemoveNthFromEnd().removeNthFromEnd(fifth, 2);
		while (rslt != null) {
			System.out.print(rslt.val + " ");
		}
	}
}