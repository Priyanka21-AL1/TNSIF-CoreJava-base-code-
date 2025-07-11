package Day12Project;

import java.util.Scanner;

public class UsingThorow {
	static int acceptNumber() 
{
 Scanner sc = new Scanner(System.in);	
 int n =sc.nextInt();
 sc.close();
 return n;
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int per;
    System.out.println("enter your percentage ..");
    per=acceptNumber();
    try
    {
    	if(per<0)
    		throw new negativevalueException();
    	else if(per>100)
    		throw new gretervalueException();
    	else
    		System.out.println("valid percentage");
    }
    catch(negativevalueException | gretervalueException e)
    {
    	System.err.print("Error............message" + e.getMessage());
    }
    
    }

}
