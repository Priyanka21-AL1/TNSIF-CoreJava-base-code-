package Day12Project;

public class negativevalueException extends Exception {

	 public negativevalueException(String string)
	 {
		 super(string);
	 }
	 
	 public negativevalueException() {
	
		 super("Percentage should not be negative");
	 }
}
