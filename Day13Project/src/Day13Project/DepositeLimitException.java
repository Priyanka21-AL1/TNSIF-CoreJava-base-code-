package Day13Project;

public class DepositeLimitException extends Exception {
     public  DepositeLimitException()
     {
    	 super("enter valid amount");
     }
     public  DepositeLimitException (String messsage)
     {
   	  super("enter ");
     }
}
