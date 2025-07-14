package day14LQUEUE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Queue<Integer> r = new LinkedList<Integer>();
   r.add(7);
   r.add(10);
   r.add(34);
   r.add(17);
   r.add(67);
   
   System.out.println(r);
   int positionPeek = r.peek();
   System.out.println("using peek method for the 1st value");
   
   System.out.println();
   System.out.println(r.remove());
   System.out.println(r);
   
   Iterator itr = r.iterator();
   while(itr.hasNext())
   {
	   System.out.println(itr.next() +"/t");
   }
   
   System.out.println();
   System.out.println(r.poll());
   System.out.println(r);
   
   
   
	}

}
