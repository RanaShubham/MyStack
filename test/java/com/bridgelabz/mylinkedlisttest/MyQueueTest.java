package com.bridgelabz.mylinkedlisttest;

import org.junit.Assert;
import org.junit.Test;
import com.bridgelabz.mylinkedlistjava.MyNode;
import com.bridgelabz.mylinkedlistjava.MyQueue;
import com.bridgelabz.mylinkedlistjava.Node;
import com.bridgelabz.mylinkedlistjava.NodeNotFoundException;

public class MyQueueTest 
{
	@Test
	public void given3Numbers_WhenAddedToQueue_ShouldBeAddedAtTheEndOfTheQueue()
	{
		MyQueue<Integer> myQueue = new MyQueue<Integer>();
		
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		
		Node<Integer> nodePeak = myQueue.peek();
		myQueue.printQueue();
		
		Assert.assertEquals(myThirdNode,nodePeak);
	}
	
	@Test
	public void given3Numbers_WhenRemovingFromQueue_ShouldBeRemoveFromTheFrontOfTheQueue()
	{
		MyQueue<Integer> myQueue = new MyQueue<Integer>();
		
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		
		Node<Integer> removedNode = myQueue.dequeue();
		myQueue.printQueue();
		
		Assert.assertEquals(myFirstNode,removedNode);
	}
	
	@Test(expected = NodeNotFoundException.class)
	public void givenEmptyQueue_WhenRemovingFromQueue_ShouldThrowNodeNotFoundException()
	{
		MyQueue<Integer> myQueue = new MyQueue<Integer>();
		
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		
		myQueue.enqueue(myFirstNode);
		
		myQueue.dequeue();
		myQueue.dequeue();
	}
}
