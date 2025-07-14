package day14ListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List list = new ArrayList();
     System.out.println(list.isEmpty()) ;  
     list.add(10);
     list.add(20);
     list.add("priyanka");
     list.add("heti");
     list.add(false);
     list.add(true);
     list.add(14.6f);
     list.add(10);
     
     System.out.println("list is : " + list);
     
     System.out.println(list.isEmpty()) ; 
     System.out.println(list.size()) ; 
     System.out.println(list.contains(10)) ; 
     System.out.println(list.remove(false)) ; 
     
     System.out.println("list is : " + list);
     
     System.out.println(list.indexOf(20));
     
     // by using generics we can access specific type of dta
     
     List<String>names=new ArrayList<String>();
     names.add("rushi mature ");
     names.add("Anil ");
     names.add("Meena");
     names.add("priyankaa");
   //  names.add(null);
     System.out.println("names are :" + names);
     
     Collections.reverse(names);
     System.out.println("names are :" + names);
     
     
     Collections.sort(names);
     System.out.println("names are :" + names);
     
     //traversing in list
     
     Iterator<String> i= names.iterator();
     while(i.hasNext())
     {
    	 String nm = i.next();
    	 System.out.println(nm + " ");
     }
     
     System.out.println(names);
     
     ListIterator<String> li = names.listIterator(names.size());
     while(li.hasPrevious())
     {
    	 String nm = li.previous();
    	 System.out.println(nm + " ");
    	 
     }
     System.out.println(names);
     
	}

}
