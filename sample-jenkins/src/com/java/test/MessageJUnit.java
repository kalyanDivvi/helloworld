package com.java.test;

import org.junit.Assert;
import org.junit.Test;

public class MessageJUnit {
	
	MessageTest msgTest=new MessageTest();
	
	@Test
	public void testAdd()
	{
		System.out.println("Test result :");
		int result=msgTest.add(10, 20);
		Assert.assertEquals(result,30);
	}
	
	
}
