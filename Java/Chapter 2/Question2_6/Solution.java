package Question2_6;

import java.util.HashSet;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode; 

public class Solution {
	// Method 1, using HashSet time O(n), space O(n)
	public static LinkedListNode findLoopStartHash( LinkedListNode l){
		if ( l == null) return null;
		HashSet<LinkedListNode> set = new HashSet<LinkedListNode>();
		while ( l != null ) {
			if (! set.contains(l))
				set.add(l);
			else
				return l;
			l = l.next;
		}
		return null;
	}
	
	
	// Method 2, using two pointers 
	public static LinkedListNode findLoopStartPtr( LinkedListNode head){
		if ( head == null || head.next == null) return null;
		LinkedListNode ptr1 = head;
		LinkedListNode ptr2 = head;
		do {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next.next;
		} while ( ptr1 != ptr2 && ptr2 != null && ptr2.next != null);
		
		if ( ptr2 == null || ptr2.next == null) return null;
		else{
			ptr2 = head;
			while ( ptr2 != ptr1){
				ptr1 = ptr1.next;
				ptr2= ptr2.next;
			}
		}
		return ptr1;
	}
	
	public static void main(String args[]){
		LinkedListNode aa = new LinkedListNode(1,null,null);
		LinkedListNode start = aa;
		LinkedListNode loopStart = null;
		LinkedListNode detectedLoopStart = null;
		LinkedListNode detectedLoopStart2 = null;
		for (int i = 2; i < 100; i++){
			LinkedListNode bb = new LinkedListNode(i,null,null);
			aa.next = bb;
			aa = aa.next;
			if (aa.data == 40) loopStart = aa;
		}
		//aa.next = loopStart;
		detectedLoopStart = findLoopStartHash(start);
		detectedLoopStart2 = findLoopStartPtr(start);
		System.out.println(detectedLoopStart);
		System.out.println(detectedLoopStart2) ;
	}

}
