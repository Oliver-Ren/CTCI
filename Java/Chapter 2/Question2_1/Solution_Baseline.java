package Question2_1;

import java.util.HashSet;
import java.util.LinkedList;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class Solution_Baseline {
	public static void removeDuplicates(LinkedListNode L){
		LinkedListNode previous = null;
		HashSet<Integer> set = new HashSet<Integer> ();
		while (L != null){
			if (set.contains(L.data)){
				previous.next = L.next;
			}
			else{
				set.add(L.data);
				previous = L;
			}
			L = L.next;
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
