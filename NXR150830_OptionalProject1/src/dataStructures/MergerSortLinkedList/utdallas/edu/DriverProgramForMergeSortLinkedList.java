package dataStructures.MergerSortLinkedList.utdallas.edu;


import dataStructures.MergerSortLinkedList.utdallas.edu.MergeSortAlgorithmLinkedList.LinkedListNode;

public class DriverProgramForMergeSortLinkedList {

	public static void main(String[] args) {
		// Sample Test Case
		MergeSortAlgorithmLinkedList obj = new MergeSortAlgorithmLinkedList();
		LinkedListNode node = new LinkedListNode(100);
		node.next = new LinkedListNode(87);
		node.next.next = new LinkedListNode(1);
		node.next.next.next = new LinkedListNode(127);
		node.next.next.next.next = new LinkedListNode(3);

		
		
		System.out.println("Before merge sort");

		System.out.println("The linked list elements : ");

		obj.printLinkedListNode(node);

		System.out.println();

		System.out.println("After Merge Sort");

		System.out.println("The linked List elements");

		LinkedListNode result = obj.sortList(node);

		obj.printLinkedListNode(result);
	}

}
