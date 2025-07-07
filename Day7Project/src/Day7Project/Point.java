package Day7Project;


  // Constructor Overloading == withod return method and diff parameters
public class Point {
           
	
	private float x;
	private float y;
	
	
	public Point()
	{
		x=0.0f;
		y=0.0f;
	}

/// para constructor for x only 
	public Point(float x) {
		
		this.x = x;
	}
// para cons for x and y
public Point(float x, float y) {
	super();
	this.x = x;
	this.y = y;
}
// to -String
@Override
public String toString() {
	return "Point [x=" + x + ", y=" + y + "]";
}
	


	
}
