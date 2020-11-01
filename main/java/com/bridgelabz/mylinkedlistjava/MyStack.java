package com.bridgelabz.mylinkedlistjava;

public class MyStack<K> 
{
	private final MyLinkedList<K> myLinkedList;

	public MyStack()
	{
		this.myLinkedList = new MyLinkedList<K>();
	}
	public Node<K> peek() 
	{
		return this.myLinkedList.getHead();
	}

	public void printStack() 
	{
		this.myLinkedList.printMyLinkedNodes();
	}

	public void push(MyNode<K> myNode) 
	{
		this.myLinkedList.addTop(myNode);
	}
}
