package Question2_7;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode; 

public class Solution {
	public static boolean isPalindrome(LinkedListNode head) {
		LinkedListNode pointer = head;
		int len = 0;
		int i = 0;
		for ( ; pointer != null; pointer = pointer.next) len++;
		if ( len == 0 ) return false;
		if ( len == 1 ) return true;
		
		
		// scan for the seconde time
		
		pointer = head;
		int checkStartPos = len / 2;
		int [] firstHalf = new int[checkStartPos];
		for ( ; pointer != null; pointer = pointer.next) {
			if ( i < checkStartPos )
				firstHalf[i] = pointer.data;
			else if ( (i > checkStartPos || (i == checkStartPos && len % 2 == 0)) && firstHalf[len - i - 1] != pointer.data)
				return false;
			i++;
		}
		return true;
	}

	public static void main(String[] args) {
//		LinkedListNode aa = new LinkedListNode(1,null,null);
//		LinkedListNode start = aa;
//		int len = 9;
//		for ( int i = 0; i < len; i++){
//			LinkedListNode bb = new LinkedListNode(Math.abs(i - len/2),null,null);
//			aa.next = bb;
//			aa = aa.next;
//		}
//		System.out.println(start.next.printForward());
//		boolean isPalindrome = isPalindrome(start.next);
//		System.out.println(isPalindrome);
		
		
		// test2 ramdom
		LinkedListNode head = AssortedMethods.randomLinkedList(6, 0, 1);
		System.out.println(head.printForward());
		boolean isPalindrome = isPalindrome(head);
		System.out.println(isPalindrome);
		// TODO Auto-generated method stub

	}

}
