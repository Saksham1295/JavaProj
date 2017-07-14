package Jd;
import java.util.ArrayList;

public class EmpAdd {

	ArrayList<EmpVo> al = new ArrayList<EmpVo>();
	
	public void add(int id,String name,int age,double salary) {
		
		EmpVo obj = new EmpVo();
		 obj.setId(id);		
		 obj.setName(name);
		 obj.setAge(age);
		 obj.setSalary(salary);

		 al.add(obj);
	}
	
	public ArrayList<EmpVo> getEmployeeList(){
		return al;
		
	}
	
}
