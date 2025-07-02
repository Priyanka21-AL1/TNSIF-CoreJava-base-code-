package com.Day3Projec;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int  i=95; /// users values / user input
           // int j[]= {10,20,30,40,50};
            
            whilee(95);
            dowhile(11);
         //  foreach(j[]);
	}
	
	public static void dowhile(int n) { // if the condition is false then it will print at console
		do {
			System.out.println(n);
		}while(n<=10);
	}
	
	public static void whilee(int i) {  // if the condition is not true then nothing print anything at console
		
		while(i<=100) {
        	System.out.println(i);
        	i++;
        }
	}
	
	
		
		
		
	
}


