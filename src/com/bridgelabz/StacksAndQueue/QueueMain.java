package com.bridgelabz.StacksAndQueue;

import com.bridgelabz.linkedlist.MyNode;

public class QueueMain {
	public static void main(String[] args) {
		MyQueue<Integer> myQueue = new MyQueue<Integer>();
		
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		myQueue.enqueue(firstNode);
		myQueue.enqueue(secondNode);
		myQueue.enqueue(thirdNode);
		myQueue.printQueue();
		Object deQueuedElement = myQueue.dequeue();
		System.out.println();
		System.out.println("Queue after repeated dequeue Operation: ");
		while(!myQueue.isEmpty()) {
			myQueue.dequeue();
			myQueue.printQueue();
		}
	}
}
