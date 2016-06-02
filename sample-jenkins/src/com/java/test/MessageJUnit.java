package com.java.test;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

public class MessageJUnit extends TestCase{
	
	MessageTest msgTest=new MessageTest();
	
	@Test
	public void testAdd()
	{
		//System.out.println("Test result :");
		int result=msgTest.add(10, 20);
		Assert.assertEquals(result,30);
		System.out.println("Test result :"+result);
	}
	
	
	
}
