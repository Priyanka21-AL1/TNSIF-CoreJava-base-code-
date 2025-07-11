package Day12ProjectTHREAD;

public class ChildDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ChildThread c = new ChildThread(10,"Hello");
 c.start();
 System.out.println("end of the program");
	}

}
