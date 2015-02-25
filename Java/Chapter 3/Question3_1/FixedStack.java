package Question3_1;

public class FixedStack {
	private static final int N = 1000;
	private int [] array = new int[N];
	private int [] pos = new int[3];
	private int [] start = new int[3];
	private int [] end = new int[3];
	
	public FixedStack() {
		for (int i = 0; i < 3; i++) {
			start[i] = N/3 * i;
			end[i] = N/3 * (i+1);
		}
	}
	
	public void push(int stackNum, int value) {
		int index = this.pos[stackNum]++;
		checkCapacity(index, stackNum);
		array[index] = value;
	}
	
	public int pop(int stackNum) {
		if (isEmpty(stackNum)) {
			throw new Exception();
		}
		int index = this.pos[stackNum]--;
		return array[index];
	}
	
	public boolean isEmpty(int stackNum) {
		return pos[stackNum] == start[stackNum];
	}
	
	private void checkCapacity(int index, int stackNum) {
		if (index > end[stackNum]) {
			throw new Exception();
		}
	}
}
