package jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ListA {

	@Test
	public void test() {
		ListTest lt=new ListTest();
		assertEquals("Size is 4",4,lt.testlist().size());
		
	}

}
