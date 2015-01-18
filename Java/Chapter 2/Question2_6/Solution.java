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
	
	public static void main(String args[]){
		LinkedListNode aa = new LinkedListNode(1,null,null);
		LinkedListNode start = aa;
		LinkedListNode loopStart = null;
		LinkedListNode bb = new LinkedListNode(2,null,null);


		aa.next = loopStart;
		System.out.println(start.printForward());
	}

}
