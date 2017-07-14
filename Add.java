class Add
{
	void Input()
	{
		Emp1 e = new Emp1();
		e.getname("Saksham");
		e.getage("21");
		e.getsalary("21000");
		Emp1 e1 = new Emp1();
		e1.getname("Shikhar");
		e1.getage("22");
		e1.getsalary("13000");
		Emp1 e2 = new Emp1();
		e2.getname("Siddharth");
		e2.getage("23");
		e2.getsalary("12500");
		Input1 a = new Input1();
		a.Insert(e);
		a.Insert(e1);
		a.Insert(e2);
		this.t = a.cal();
	}	
	void Output()
	{
		Output out = new Output(t);
	}
	
}