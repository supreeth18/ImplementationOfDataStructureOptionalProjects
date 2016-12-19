package datastructure.LargeNumberAsLists.utdallas.edu;

public class AddLargeNumbersAsLists {
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
	 * Here the most important observation is to use the Carry Flag since the
	 * numbers gets larger carry will be generated and care has to be taken to
	 * handle that case. so we will maintain two variables carryFlag that will
	 * handle if the sum>9 we will use currentValue to keep track of the sum of
	 * two lists and if it exceeds > 9 carry flag will have to be updated.
	 */
	public ListNode addTwoNumbers(ListNode firstList, ListNode secondList) {
		ListNode dummyList = new ListNode(0);

		ListNode resultListNode = dummyList;

		int carryFlag = 0;
		int currentValue = 0;

		while (firstList != null || secondList != null) {
			currentValue = dummyList.dataValue;

			if (firstList != null) {
				currentValue += firstList.dataValue;
				firstList = firstList.next;
			}

			if (secondList != null) {
				currentValue += secondList.dataValue;
				secondList = secondList.next;
			}

			carryFlag = currentValue / 10;
			dummyList.dataValue = currentValue % 10;

			if (firstList != null || secondList != null || carryFlag == 1) {
				dummyList.next = new ListNode(carryFlag);
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
