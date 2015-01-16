package Question2_4;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;


public class Solution {
	public static LinkedListNode partition ( LinkedListNode n, int val) {
		if ( n == null) return null;
		LinkedListNode left = new LinkedListNode(0, null, null);
		LinkedListNode right = new LinkedListNode(0, null, null);
		LinkedListNode leftStart = left;
		LinkedListNode rightStart = right;
		LinkedListNode middle = new LinkedListNode();
		boolean isMiddleFound = false;
		
		while ( n != null){
			if ( isMiddleFound == false && n.data == val){
				middle = n;
				isMiddleFound = true;
			}			
			else if ( n.data <= val){
				left.next = n;
				left = left.next;
			}
			else if ( n.data > val){
				right.next = n;
			    right = right.next;
			}
			n = n.next;
		}
		
		//combine
		if ( isMiddleFound ){
			left.next = middle;
			middle.next = rightStart.next;
			right.next = null;
		}
		else return null;
		
		return leftStart.next;
	}
	
	public static void main(String args[]){
			LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
			System.out.println(head.printForward());
			System.out.println(head.next.next.next.data);
			head = partition(head, 1);
			
			System.out.println(head.printForward());
		
	}
}
