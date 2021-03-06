package com.bridgelabz.StacksAndQueue;
import com.bridgelabz.linkedlist.*;

public class StackMain {
	public static void main(String[] args) {
		MyStack<Integer> myStack = new MyStack<Integer>();
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		myStack.push(firstNode);
		myStack.push(secondNode);
		myStack.push(thirdNode);
		myStack.printStack();

		INode<Integer> myNode = myStack.peek();
		System.out.println("Stack Peek :"+myNode.getKey());
		
		Object poppedElement = myStack.pop();
		System.out.println("Popped the Element : "+poppedElement);
		System.out.println("Stack after pop operation");	
	}
	
}
