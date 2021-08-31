package com.bridgelabz.StacksAndQueue;
import com.bridgelabz.linkedlist.*;
public class MyQueue<E extends Comparable<E>> {
	private final LinkedList<E> linkedList ;
	
	public MyQueue(){
		linkedList = new LinkedList();
	}
	public void enqueue(INode<E> data) {
		linkedList.appendNodes(data);
	} 
	public void printQueue() {
		linkedList.printLinkedList();
	}
}
