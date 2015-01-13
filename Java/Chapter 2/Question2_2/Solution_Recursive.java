package Question2_2;

import CtCILibrary.*;

public class Solution_Recursive {
	
	public int findKthtoLast( LinkedListNode n, int k){
		if ( n == null ) return 0;
		int i = findKthtoLast(n.next, k) + 1;
		if ( i == k )
			System.out.print(n.data);
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
