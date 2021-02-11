package day13;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack s = new Stack();
	s.push(1);
	s.add(2);
	s.add(3);
	System.out.println(s);
	
	System.out.println("it returns top element" + s.peek());
		
	System.out.println("it returns and remove top element" + s.pop());
		
	System.out.println("it returns top element" + s.peek());
	
	System.out.println("it returns and remove top element" + s.pop());
	
	System.out.println("after poping out" + s);

	}

}
