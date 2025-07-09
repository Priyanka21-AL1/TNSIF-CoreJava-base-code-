package Day11Project3;

public class NestedTryCatch {
 public static void check()
 {
	 String str = "TNS";
	 int slength = str.length();
	 System.out.println("String length : " + slength);
	 
	 String anotherString = null;
	 
	 int y=6;
	 try {
		 try {
			 System.out.println(str.charAt(y));
		 
		 }
		 catch(StringIndexOutOfBoundsException e)
		 {
			 System.err.print(e.getMessage());
		 }
		 
		 System.out.println("the another String: " + anotherString);
		 
	 }
		 catch(Exception e)
		 {
			 System.out.print(e.getMessage());
		 }
		
	 }
	 }

