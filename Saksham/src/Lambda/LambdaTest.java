package Lambda;

public class LambdaTest {
	final static String salutation  = "Hello ";
	public static void main(String args[])
	{
		GreetingService greeService1 = message ->
		System.out.println(salutation + message);
		greeService1.sayMessage("Saksham");
	}
	interface GreetingService
	{
		void sayMessage(String message);
		
	}

}
