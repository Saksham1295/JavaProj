package Jutest;

public class TestSuite {
	 private String message;

	 
	   public TestSuite(String message){
	      this.message = message; 
	   }

	   public String printMessage(){
	      System.out.println(message);
	      return message;
	   }   

	   public String salutationMessage(){
	      message = "Hi!" + message;
	      System.out.println(message);
	      return message;
	   }   
}
