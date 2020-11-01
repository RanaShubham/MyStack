package com.bridgelabz.mylinkedlistjava;

public class MyStack<K> 
{
	private final MyLinkedList<K> myLinkedList;

	public MyStack()
	{
		this.myLinkedList = new MyLinkedList<K>();
	}
	
	/**
	 * To get the last Node added to the stack.
	 * @return Stack Node
	 */
	public Node<K> peek() 
	{
		return this.myLinkedList.getHead();
	}

	/**
	 * Prints the Stack.
	 */
	public void printStack() 
	{
		this.myLinkedList.printMyLinkedNodes();
	}

	
	/**
	 * To add to the Stack.
	 * @param myNode
	 */
	public void push(MyNode<K> myNode) 
	{
		this.myLinkedList.addTop(myNode);
	}
	
	/**
	 * To remove the last added Node
	 * @return Stack Node
	 */
	public Node<K> pop() 
	{
		Node<K> nodeToBePopped = this.myLinkedList.getHead();
		this.myLinkedList.popHead();
		return nodeToBePopped;
	}
}
