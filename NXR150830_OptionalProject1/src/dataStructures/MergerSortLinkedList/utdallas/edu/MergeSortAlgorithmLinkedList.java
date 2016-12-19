package dataStructures.MergerSortLinkedList.utdallas.edu;

import java.util.Iterator;

/**
 * Merge sort algorithm that works on linked lists
 * 
 * @author Nagasupreeth Ramesh
 *
 */
public class MergeSortAlgorithmLinkedList {

	// LinkedList Node Definition that has a link to next node pointer and place
	// holder for storing Data
	static class LinkedListNode {

		LinkedListNode next;
		int value;

		public LinkedListNode(int value) {
			this.value = value;
		}
	}

	public LinkedListNode sortList(LinkedListNode node) {
		if (node == null || node.next == null)
			return node;

		LinkedListNode firstHalf = node;
		LinkedListNode middle = getMiddleOfLinkedList(node);
		LinkedListNode secondHalf = middle.next;
		middle.next = null;
		return mergeLinkedList(sortList(firstHalf), sortList(secondHalf));
	}

	// This will find the middle of linked List using tortoise and hare
	// algorithm.
	public LinkedListNode getMiddleOfLinkedList(LinkedListNode head) {
		LinkedListNode slowptr = head;
		LinkedListNode fastPtr = head;

		while (fastPtr.next != null && fastPtr.next.next != null) {
			slowptr = slowptr.next;
			fastPtr = fastPtr.next.next;
		}

		return slowptr;

	}

	// Here this fuction will mainly compare the elements and accordingly merge
	// them in sorted order
	public LinkedListNode mergeLinkedList(LinkedListNode first,
			LinkedListNode second) {
		LinkedListNode newHead = new LinkedListNode(0);
		LinkedListNode currentNode = newHead;

		while (first != null && second != null) {
			if (first.value <= second.value) {
				currentNode.next = first;
				first = first.next;
			} else {
				currentNode.next = second;
				second = second.next;
			}
			currentNode = currentNode.next;
		}

		// Here if one of the list has exhausted we simply take the head pointer
		// point to other list since exhasted list will already be in sorted
		// order.
		if (first == null) {
			currentNode.next = second;
		} else {
			currentNode.next = first;
		}

		return newHead.next;
	}

	
	public void printLinkedListNode(LinkedListNode root) {
		while (root != null) {
			System.out.println(root.value);
			root = root.next;
		}
	}
}
