package Jutest;


import org.junit.Test;
//import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestJunit1 {

   String message = "Robert";	
   TestSuite mu = new TestSuite(message);
   
   @Test
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");    
      assertEquals(message, mu.printMessage());     
   }
}
