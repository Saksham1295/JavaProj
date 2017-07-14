package Jutest;

import org.junit.Test;
//import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestUnit2 {

   String message = "Robert";	
   TestSuite TestSuite = new TestSuite(message);
 
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Robert";
      assertEquals(message,TestSuite.salutationMessage());
   }
}