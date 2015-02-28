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
	
	public void shift(int stackNum) {
		StackData  stack = stacks[stackNum];
		if (stack.size >= stack.capacity) {
			int nextStack = (stackNum + 1) % number_of_stacks;
			shift(nextStack);
			stack.capacity++;
		}
		
		// shift elements in reverser order
		for (int i = (stack.start + stack.capacity - 1) % total_size; stack.isWithinStack(i, total_size); i = prevElement(i)) {
			buffer[i] = buffer[prevElement(i)];
		}
		
		stack.start = nextElement(stack.start);
		stack.pointer = nextElement(stack.pointer);
		stack.capacity--;
	}
	
	
	// expand stack by shifting over other stacks
	public void expend(int stackNum) {
		shift((stackNum + 1) % number_of_stacks);
		stacks[stackNum].capacity++;
		
	}
	
	public void push(int stackNum, int value) throws Exception{
		StackData stack = stacks[stackNum];
		/* check that we have space */
		if (stack.size >= stack.capacity) {
			if (numberOfElements() >= total_size) { // Totally full
				throw new Exception("Our of space.");
			} else { // just need to shift things around.
				expend(stackNum);
			}
		}
		
		/* Find the index of the top element in the array + 1,
		 * and increament the pointer.
		 */
		stack.size++;
		stack.pointer = nextElement(stack.pointer);
		buffer[stack.pointer] = value;
	}
	
	public int pop(int stackNum) {
		StackData stack = stacks[stackNum];
		if (stack.size == 0) {
			throw new Exception("try to pop a empty stack!");
		}
		int value = buffer[stack.pointer];
		buffer[stack.pointer] = 0;
		stack.pointer = prevElement(stack.pointer);
		stack.size--;
		return value;
	}
	
	public int peek(int stackNum) {
		StackData stack = stacks[stackNum];
		return buffer[stack.pointer];
	}
	
	public boolean isEmpty(int stackNum) {
		StackData stack = stacks[stackNum];
		return stack.size == 0;
	}
}
