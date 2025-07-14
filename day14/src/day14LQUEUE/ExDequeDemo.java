package day14LQUEUE;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Deque<String> deque1 = new ArrayDeque<String>();
      deque1.add("priyaa");
      deque1.add("shreya");
      deque1.add("gautam");
      deque1.add("priyanka");
      
      System.out.println(deque1);
      
      
       deque1.pollLast();
       System.out.println(deque1);
       
       deque1.peekFirst();
       System.out.println(deque1);
       
       for(String str: deque1)
       {
    	   System.out.println("queue is : " + str);
       }
       System.out.println(deque1);
       
	}

}
