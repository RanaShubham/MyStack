package com.bridgelabz.mylinkedlistjava;

public class MyQueue<K> 
{
	private final MyLinkedList<K> myLinkedList;

	public MyQueue()
	{
		this.myLinkedList = new MyLinkedList<K>();
	}

	/**
	 * Prints a queue data structure.
	 */
	public void printQueue() 
	{
		this.myLinkedList.printMyLinkedNodes();
	}

	/**
	 * Adds a node to the end of the queue.
	 * @param myNode
	 */
	public void enqueue(MyNode<K> myNode) 
	{
		this.myLinkedList.addTop(myNode);
	}
	
	/**
	 * returns Node which is present at the end of the queue.
	 * @return Node
	 */
	public Node<K> peek() 
	{
		return this.myLinkedList.getHead();
	}
	
	/**
	 * Removes the first Node present in the queue.
	 * @return Node
	 */
	public Node<K> dequeue() 
	{
		Node<K> nodeToBeDequeued = this.myLinkedList.getTail();
		this.myLinkedList.cutTail();
		return nodeToBeDequeued;
	}
}
