package Question2_1;

import java.util.HashSet;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class Solution_Alternative {
	public static void removeDuplicates(LinkedListNode n){
		LinkedListNode current = n;
		while( current != null){
			LinkedListNode running = current.next;
			LinkedListNode previous = current;
			while ( running != null){
				if ( running.data == current.data ){
					previous.next = running.next;
				
				}
				else{
					previous = running;
				}
				running = running.next;
					
			}
			current = current.next;
		}
	
	}
	
	public static void main(String[] args) {	
		LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
		LinkedListNode head = first;
		LinkedListNode second = first;
		for (int i = 1; i < 8; i++) {
			second = new LinkedListNode(i % 2, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}
		System.out.println(head.printForward());
		LinkedListNode clone = head.clone();
		removeDuplicates(head);
		System.out.println(head.printForward());
//		removeDuplicates(clone);
	}

}
