package additional;

import java.util.Stack;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InfixToPostfix {
	
	public static String conversion(String infix){
		List<Character> result = new ArrayList<Character>();
		Stack<Character> stack = new Stack<Character>();
		for( int i = 0; i < infix.length(); i++){
			char character = infix.charAt(i);
			if (character >= '0' && character <= '9')
				result.add(character);
			else{
				switch(character){
				case '+':
				case '-':while(!stack.isEmpty() && (stack.peek() == '*' || stack.peek() == '/')) result.add(stack.pop());
						 stack.push(character);
						 break;
				case '*':
				case '/':stack.push(character);
						 break;
				case '(':stack.push(character);
						 break;
				case ')':while(stack.peek() != '(') result.add(stack.pop());
						 stack.pop();
						 break;
				default: return null;
				}
			}
		}
		while(!stack.isEmpty()) result.add(stack.pop());
		return result.toString();
	}

	public static void main(String[] args) {
		String test = "9+(3-1)*3+10/2";
		String result = conversion(test);
		System.out.print(result);
		// TODO Auto-generated method stub

	}

}
