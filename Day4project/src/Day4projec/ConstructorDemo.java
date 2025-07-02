package Day4projec;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      String name;
      String city;
      int id;
      System.out.println("Enter your name :");
      name = sc.nextLine();
      
      
      System.out.println("Enter your city :");
      city = sc.nextLine();
      
      System.out.println("Enter your ID :");
      id = sc.nextInt();
      
     
      System.out.println(" ");
      
      constructor c1 = new constructor();  //default
      // c1.setCustomerId(id);
     //  c1.setCustomerName(name);
      // c1.setCustomerCity(city);
      
     // System.out.println(c1);
      
      constructor c2 = new constructor(name,id,city);
      c2.setCustomerId(id);
      c2.setCustomerName(name);
      c2.setCustomerCity(city);
      
      System.out.println(c2);
      
	}

}
