package jp.afternoon.fe;

import java.util.Stack;

enum DigitKey implements Key{

	DIGIT0, DIGIT1, DIGIT2, DIGIT3, DIGIT4,
	DIGIT5, DIGIT6, DIGIT7, DIGIT8, DIGIT9;

	public void operateOn(Stack<Integer> stack){
		stack.push(stack.pop() * 10 + ordinal());

	}
}