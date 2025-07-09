package Day11Project3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
	
	// multiple ctach
 public static void divide()
 {
	 int a,b,c;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the number:");
	 
	 try
	 {
		 a=sc.nextInt();
		 b= sc.nextInt();
		 
		 c=a/b;
		 
		 System.out.println("divion is : " + c);
				 }
	 catch(InputMismatchException e)
	 {
		 System.err.print(e.getMessage());
	 }
	 
	 catch(ArithmeticException e)
	 {
		 System.err.print(e.getMessage());
	 }
	 
	 catch(Exception e)
	 {
		 System.err.print(e.getMessage());
	 }
	 
	 finally {
		 System.out.println("// used to close the all the sources or end of the programm//    finally block");
	 }
	 
 }
}
