package DataStructProject;

import java.util.LinkedList;

public class Pilha_LinkedList {
	
	LinkedList<Character> stack1 = new LinkedList<Character>();
	private int max;
	
	public Pilha_LinkedList() {
		max = 1000;
	}
	
	public Pilha_LinkedList(int max) {
		this.max = max;
	}
	
	public void push(char e) {
		if(stack1.size() == 0 || stack1.size() != 0){
		stack1.addLast(e);
		} else {
			System.out.println("A pilha está cheia!");
		}
	}
	
	public char pop() {
		if(stack1.size() != 0) {
			return stack1.removeLast();
		} else {
			System.out.println("A pilha está vazia!");
			return '.';
		}
	}
	
	public char top() {
		if(stack1.size() != 0) {
			return stack1.getLast();
		} else {
			System.out.println("A pilha está vazia!");
			return 0;
		} 
	}
	
	public boolean overFlow() {
		return stack1.size() >= max;
	}	
	
	public boolean underFlow() {
		return stack1.size() == 0;
	}
	
	public String toString() {
		return stack1.toString();
	}

}