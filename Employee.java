import java.util.*;  
class Employee{  
 void name()
{  
  
  TreeSet<String> al=new TreeSet<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  

  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }
void age()
{
ArrayList al = new ArrayList();
al.add(Integer.valueOf(45));
al.add(Integer.valueOf(56));
al.add(Integer.valueOf(35));
al.add(Integer.valueOf(48));

Iterator itr=al.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}  
}
void salary()
{  
  
 ArrayList al=new ArrayList();  
al.add(Integer.valueOf(20100));  
al.add(Integer.valueOf(10100));  
al.add(23000);
al.add(25800);
  
Collections.sort(al);  
  
Iterator itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
 }  
}  
}
