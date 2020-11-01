package com.bridgelabz.mylinkedlisttest;

import org.junit.Assert;
import org.junit.Test;
import com.bridgelabz.mylinkedlistjava.MyNode;
import com.bridgelabz.mylinkedlistjava.MyStack;
import com.bridgelabz.mylinkedlistjava.Node;

public class MyStackTest 
{
	@Test
	public void given3Numbers_WhenAddedToStack_ShouldBeAddedToTop()
	{
		MyStack<Integer> myStack = new MyStack();
		
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		Node<Integer> nodePeak = myStack.peek();
		myStack.printStack();
		
		Assert.assertEquals(myThirdNode,nodePeak);
	}
}
