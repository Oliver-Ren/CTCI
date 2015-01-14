package Question2_3;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class Solution {
	
	public static void deleteNode(LinkedListNode n){
		if ( n == null || n.next == null) return;
		n.data = n.next.data;
		n.next = n.next.next;
	}
	
	public static void main(String[] args) {
		LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
		System.out.println(head.printForward());
		deleteNode(head.next); // delete node 4
		System.out.println(head.printForward());
	}

}

