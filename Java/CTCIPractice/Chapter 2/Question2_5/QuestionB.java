//package Question2_5

public class QuestionB {
	public int length( LinkedListNode l){
		int len = 0;
		if ( l == null )
			return len;
		else{
			len = length(l.next)++;
		}
	}

	public int PartialSum addListHelper(LinkedListNode l1, LinkedListNode l2, carry){
		if (l1 == null && l2 == null) return 0;
		
		


