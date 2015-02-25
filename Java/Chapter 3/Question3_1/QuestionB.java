package Question3_1;

public class QuestionB {
	static int number_of_stacks = 3;
	static int default_size = 4;
	static int total_size = default_size * number_of_stacks;
	static StackData [] stacks = {new StackData(0, default_size),
		new StackData(default_size, default_size),
		new StackData(default_size * 2, default_size)};
	static int [] buffer = new int [total_size];
	
	public static int numberOfElements() {
		return stacks[0].size + stacks[1].size + stacks[2].size;
	}
	
	public static int nextElement(int index) {
		if (index + 1 == total_size) return 0;
		else return index + 1;
	}
	
	public static int prevElement(int index) {
		if (index - 1 == -1) return total_size - 1;
		else return index - 1;
	}
	
	public void shift(stackNum) {
		
	}
	
	public void expend(stackNum) {
		
	}
	
	public void push(stackNum, int value) {
		
	}
	
	public int pop(int stackNum) {
		
	}
	
	public int peek(int stackNum) {
		
	}
	
	public boolean isEmpty(stackNum) {
		
	}
}
