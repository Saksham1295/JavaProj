package jUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUTest {
	
	@Test(expected = IllegalArgumentException.class)
	
	public void testExceptionIsThrown(){
		JTest tester=new JTest();
	tester.multiply(1000,5);
	}
	@Test
	public void testMultiply(){
		JTest tester =new JTest();
		assertEquals("10*5 must be 50",50,tester.multiply(10,5));
	}
	@Test
	public void testAdd()
	{
		JTest tester =new JTest();
		assertEquals("10+5 must be 15",15,tester.add(10,5));
	}
	@Test
	public void testSub()
	{
		JTest tester =new JTest();
		assertEquals("10-5 must be 5",5,tester.substract(10,5));
	}

}
