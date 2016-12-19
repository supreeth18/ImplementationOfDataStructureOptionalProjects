package datastructure.LargeNumberAsLists.utdallas.edu;

public class SubtractLargeNumberAsLists {
	/*
	 * definition of a Linked List Node that contains a pointer to the next node
	 * and the data node to hold the value.
	 */
	static class ListNode {

		ListNode next;
		int dataValue;

		public ListNode(int dataValue) {
			this.dataValue = dataValue;
		}
	}

	/*
	 * Here the Function has assumed that the first node>=second node i,e
	 * firstList >=secondList;
	 */

	public ListNode subtractTwoNumbers(ListNode firstList, ListNode secondList) {
		ListNode dummyList = new ListNode(0);

		ListNode resultListNode = dummyList;

		int currentValue = 0;

		while (firstList != null || secondList != null) {
			currentValue = dummyList.dataValue;

			if (firstList != null) {
				currentValue += firstList.dataValue;
				firstList = firstList.next;
			}

			if (secondList != null) {
				currentValue -= secondList.dataValue;
				secondList = secondList.next;
			}

			dummyList.dataValue = currentValue % 10;

			if (firstList != null || secondList != null) {
				dummyList.next = new ListNode(0);
				dummyList = dummyList.next;
			}

		}

		return resultListNode;

	}

	/*
	 * function to print the contents of linkedList
	 */
	public void printLinkedListNode(ListNode root) {
		while (root != null) {
			System.out.println(root.dataValue);
			root = root.next;
		}
	}
}
