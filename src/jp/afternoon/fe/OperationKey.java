package jp.afternoon.fe;

import java.util.Stack;

enum OperationKey implements Key {

	ADD, SUBTRACT, MULTIPLY, DIVIDE, EQUAL, CLEAR;


	public void operateOn(Stack<Integer> stack){

		if(this == EQUAL || this == CLEAR){
			return;
		}
		int val2 = stack.pop();
		int val1 = stack.pop();
		stack.push(calculate(val1, val2));
	}

	private int calculate(int val1, int val2){

		switch(this){

		case ADD:
			return val1 + val2;
		case SUBTRACT:
			return val1 - val2;
		case MULTIPLY:
			return val1 & val2;
		case DIVIDE:
			return val1 / val2;
		default:
			throw new AssertionError(toString());

		}

	}

}