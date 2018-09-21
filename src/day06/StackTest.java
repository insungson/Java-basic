package day06;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> s = new Stack<String>();		//Stack
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s.empty());	//Tests if this stack is empty
		System.out.println(s.pop());	//Removes the object at the top of this stack and returns that object as the value of this function.
		System.out.println(s.peek());	//Looks at the object at the top of this stack without removing it from the stack.
		System.out.println(s.pop());	//

		s.add("D");
		System.out.println(s.peek());
		
	}

}
