package jUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestB {
	
	@Test(expected = IllegalArgumentException.class)
	public void testExceptionIsThrown(){
		TestA tester1=new TestA();
	tester1.print(25);
	}
	
	@Test
	public void X()
	{
		TestA tester1=new TestA();
		assertEquals(" Output must be 10","10",tester1.print(10));
	}
	@Test
	public void Y()
	{
		TestA tester1=new TestA();
		assertEquals(" Output must be 20","20",tester1.print(20));
	}
	@Test
	public void Z()
	{
		TestA tester1=new TestA();
		assertEquals(" Output must be 50","50-100",tester1.print(50));
	}
	@Test
	public void R()
	{
		TestA tester1=new TestA();
		assertEquals(" Output must be More than 100","I am more than 100",tester1.print(100));
	}
	

}
