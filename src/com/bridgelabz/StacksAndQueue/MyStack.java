package com.bridgelabz.StacksAndQueue;
import com.bridgelabz.linkedlist.*;

public class MyStack<E extends Comparable<E>>{
	private final LinkedList<E> linkedList ;
	MyStack(){
		linkedList = new LinkedList<E>();
	}
	
	public void push(INode<E> data) {
		linkedList.add(data);
	}
	public Object pop() {
		return linkedList.pop();
	}
	public INode<E> peek() {
		return linkedList.head;
	}
	public void printStack() {
		linkedList.printLinkedList();
	}
}

