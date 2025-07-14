package day14ListDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  LinkedList<Integer>li= new LinkedList<Integer>();
  li.add(10);
  li.add(20);
  li.add(40);
  li.add(60);
  System.out.println(li);
  li.addFirst(9);
  System.out.println(li);
  li.addLast(70);
  System.out.println(li);
  
  System.out.println(li.getFirst());
  System.out.println(li.getLast());
  
  li.removeFirst();
  li.removeLast();
  System.out.println(li);
  
  ListIterator<Integer> ll = li.listIterator();
  while(ll.hasPrevious())
  {
	  System.out.println(ll.next()+"/t");
	  
	  System.out.println();
	  
	  ll=li.listIterator(li.size());
	  
	  while(ll.hasPrevious())
	  {
		int n=ll.previous(); 
		
	  }
  }
  
	}

}
