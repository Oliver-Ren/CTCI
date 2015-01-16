package Question2_5;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class Solution {
	public static LinkedListNode addReverse(LinkedListNode a, LinkedListNode b){
		if (a == null && a == null)	return null;
		int carry = 0;
		int rawData = 0;
		LinkedListNode sum = new LinkedListNode(0,null,null);
		LinkedListNode sumHead = sum;
		while(true){
			//next = sum.next;
			LinkedListNode next = new LinkedListNode(0,null,null);
			
			if ( a != null && b == null){
				rawData = a.data + carry;
				a = a.next;
			}
				
			else if ( a == null && b != null){
				rawData = b.data + carry;
				b = b.next;
			}
				
			else if ( a != null && b != null){
				rawData = a.data + b.data + carry;
				a = a.next;
				b = b.next;
			}
			
			carry = rawData / 10;
			sum.data = rawData % 10;
			
			if (a != null || b != null){
				
				sum.next = next;
				sum = sum.next;
			}
			else{
				if (carry == 0){
					sum.next = null;
				}
				else{
					next.data = 1;
					sum.next = next;
				}
				break;
			}
				
	
		}
		
		return sumHead;
	}
	
	public static int linkedListToInt(LinkedListNode node) {
		int value = 0;
		if (node.next != null) {
			value = 10 * linkedListToInt(node.next);
		}
		return value + node.data;
	}	

	public static void main(String[] args) {
		LinkedListNode lA1 = AssortedMethods.randomLinkedList(3, 0, 9);
		LinkedListNode lB1 = AssortedMethods.randomLinkedList(3, 0, 9);
		LinkedListNode list3 = addReverse(lA1,lB1);
		
		
		System.out.println("  " + lA1.printForward());		
		System.out.println("+ " + lB1.printForward());			
		System.out.println("= " + list3.printForward());	
		
		int l1 = linkedListToInt(lA1);
		int l2 = linkedListToInt(lB1);
		int l3 = linkedListToInt(list3);
		
		System.out.print(l1 + " + " + l2 + " = " + l3 + "\n");
		System.out.print(l1 + " + " + l2 + " = " + (l1 + l2));	

		// TODO Auto-generated method stub

	}

}
