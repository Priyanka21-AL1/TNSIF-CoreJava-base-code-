package Day7Project;

import Day7Project2.MethodOverloading;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Point p = new Point();
       System.out.println(p);
       
       Point p1= new Point(20.9f,23.45f);
       System.out.println(p1);
       
       
       
       
       
       // using same main class for both pakage here .....
       System.out.println("method overloading------------------------------");
       

       System.out.println(MethodOverloading.addition(45.6f, 5.45f));
	}

}
