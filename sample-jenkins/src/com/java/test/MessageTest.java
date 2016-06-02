package com.java.test;

public class MessageTest {

	public static void main(String[] args) {
		
		MessageTest msgTest=new MessageTest();
		System.out.println("MessageTest Result is :"+msgTest.add(10, 20));

	}
	
	public int add(int x,int y)
	{
		return x+y;
	}

}
