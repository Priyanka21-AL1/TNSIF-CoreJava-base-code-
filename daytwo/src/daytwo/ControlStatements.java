package daytwo;

import java.util.Scanner;

public class ControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of n :");
      int n = sc.nextInt();
      System.out.println("Enter the age");
      int age = sc.nextInt();
    num(n);
     eligibility(age);
     nested(10,20,30);
      
	}
	
	public static void num(int n  ) {
		for(int i=0;i<=n;i++) {
			System.out.println(i);
		}
		return;
	}
		
	
	public static void eligibility(int age) {
	if(age>=18) {
		System.out.println("you are eligible for voting");
		
	}
	else if(age>=21) {
		System.out.println("ready for marriage");
	}
	else {
		System.out.println("not eligible for both ...");
	}
	
	return;
	}
	public static void nested(int a,int b,int c) {
		
		System.out.println("the greatest number from all is ::");
		
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}
			else {
				System.out.println(c);
			}
		}
		else {
			if(c>b) {
				System.out.println(c);
			}
			else {
				System.out.print(b);
			}
		}
	}
	
	

}

