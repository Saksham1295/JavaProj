package Jutest;

import java.util.*;  
class MapTest{  
 public static void main(String args[]){  
  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
  hm.put(100,"Amit");  
  hm.put(101,"Vijay");  
  hm.put(102,"Rahul"); 
  hm.put(103,"Saksham");
  hm.put(104,"Anurag");
  System.out.println("Values");
  for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
 
   
  }
  hm.remove(102);
  System.out.println("Values After Remove");
  for(Map.Entry m:hm.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	 
	   
	  }
 }  
}