package Day12Project;

public class gretervalueException extends Exception {

	
	 public gretervalueException(String string)
	 {
		 super(string);
	 }
	 
	 public gretervalueException()
	 {
		 super("Percentage should not be negative");
	 }
}
