package datastructure.LargeNumberAsLists.utdallas.edu;

import datastructure.LargeNumberAsLists.utdallas.edu.AddLargeNumbersAsLists.ListNode;

public class DriverClassForAddLargeNumbersAsLists {
	public static void main(String[] args) {
		AddLargeNumbersAsLists obj = new AddLargeNumbersAsLists();
		
		// Sample TestCase 1 When one list is smaller than other
		ListNode node = new ListNode(2);
		node.next = new ListNode(4);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(3);
		
		
		ListNode node1 = new ListNode(5);
		node1.next = new ListNode(6);
		node1.next.next = new ListNode(4);
		
		System.out.println("Sample Test Case -> 1 Results ");
        ListNode Sample_Test_Case1_result = obj.addTwoNumbers(node, node1);
		
		obj.printLinkedListNode(Sample_Test_Case1_result);
		
		System.out.println();
		
		
		//Second Test Case when both List are of same Length
		
		
		ListNode list1 = new ListNode(8);
		list1.next = new ListNode(4);
		list1.next.next = new ListNode(6);
		
		
		
		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(2);
		list2.next.next = new ListNode(4);
	
		System.out.println("Sample Test Case -> 2 Results");
		
		ListNode Sample_Test_Case2_result = obj.addTwoNumbers(list1, list2);
		
		obj.printLinkedListNode(Sample_Test_Case2_result);
		
		
		
		
		
	}
}
