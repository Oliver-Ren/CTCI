package stacksandQueues;

public class Stack {
	Node top;
	
	public Object pop(){
		if (top == null) return null;
		Object item = top.data;
		top = top.next;
		return item;
	}
	
	void push(Object item){
		Node t = new Node(item);
		t.next = top;
		top = t;
	}
	
	Object peak() {
		return top.data;
	}
}
