/**
 * This is the Java implementation of the Singly 
 * Linked list, it has the function of appending 
 * elements as well as deleting elements
 */


public class Node{
	private int val;
	private Node next = null;
	
	public Node(int x){
		val = x;
	}

	public void appendtoTail(int x){
		Node end = new Node(x);
		Node n = this;
		while( n.next != null)
			n = n.next;
		n.next = end;

	}

	public void deleteElement(Node head, int x){
		Node position = head;
		if (position.val == x)
			head = position.next;
		while (position.next.val != x && position.next != null)
			position = position.next;
		position.next = position.next.next;
		return head;
	}


	public static void main( String args[]){
		System.out.println("Hello World!");
	}

}

