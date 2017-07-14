package jUnit;

public class JTest {
	public static void main(String... ar)
	{
		int mulResult= new JTest().multiply(4,2);
		int addResult= new JTest().add(4,2);
		int subResult= new JTest().substract(4,2);
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

