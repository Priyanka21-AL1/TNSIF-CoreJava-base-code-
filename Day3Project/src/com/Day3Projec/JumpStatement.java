package com.Day3Projec;

public class JumpStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for(int k=5;k<15;k++) {
    	   //odd no are skipped
    	   if(k%2!=0)
    		   continue;
    	   //even number are printed
    	   System.out.println(k + " ");
       }
       
       for(int i=5;i<15;i++) {
    	   //odd no are skipped
    	   if(i%2==0)
    		   break;
    	   //odd number are printed
    	   System.out.println(i + " ");
       }
       
       int userinput=1;
       switch(userinput) {
       case 1: System.out.println("current recharge details");
       break;
       
       case 2: System.out.println("current recharge expiry");
       break;
       
       case 3: System.out.println("new offer");
       break;
       
       case 4: System.out.println("talk to our customer support person");
       break;
       
       default : System.out.println("not valid");
       }
       
       
	}

}
