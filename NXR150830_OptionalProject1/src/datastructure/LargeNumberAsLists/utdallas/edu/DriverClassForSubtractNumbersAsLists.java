package datastructure.LargeNumberAsLists.utdallas.edu;

import datastructure.LargeNumberAsLists.utdallas.edu.SubtractLargeNumberAsLists.ListNode;

public class DriverClassForSubtractNumbersAsLists {
	public static void main(String[] args) {
		SubtractLargeNumberAsLists obj = new SubtractLargeNumberAsLists();
		
		// Sample TestCase 1 
		ListNode node = new ListNode(9);
		node.next = new ListNode(8);
		node.next.next = new ListNode(6);
		
		
		
		ListNode node1 = new ListNode(9);
		node1.next = new ListNode(8);
		node1.next.next = new ListNode(7);
		
		System.out.println("Sample Test Case -> 1 Results ");
	    ListNode Sample_Test_Case1_result = obj.subtractTwoNumbers(node, node1);
		
		obj.printLinkedListNode(Sample_Test_Case1_result);
		
		System.out.println();	
	}
	
}
