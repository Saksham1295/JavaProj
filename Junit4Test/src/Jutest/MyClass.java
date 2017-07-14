package Jutest;

public class MyClass {
	public static void main(String... ar)
	{
		int mulResult= new MyClass().multiply(4,2);
		int addResult= new MyClass().add(4,2);
		int subResult= new MyClass().substract(4,2);
		System.out.println(mulResult+""+addResult+""+subResult);
	}

	public int multiply(int x, int y)
	{
		if(x>999)
		{
			throw new IllegalArgumentException("X should be less than 1000");
			
		}
		return x*y;
	}
	public int add(int x,int y)
	{
		return x+y;
	}
	public int substract(int x,int y)
	{
		return x-y;
	}
}
