package jUnit;

public class TestA {

	public String print(int x)
	{
		if(x==10)
		{
			return("10");
		}
		else if(x==20)
		{
			return("20");
		}
		else if(x==50)
		{
			return("50-100");
		}
		else if(x==100)
		{
			return("I am more than 100");
		}
		else
		{
			throw new IllegalArgumentException("NOt Valid");
			
		}
	
	}
}
