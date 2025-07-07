package Day7Project5;

public abstract class Shape {
	
	protected float area;
                 //abstract method ===  a body is not there
	
	public abstract void calArea();
	
	//solid maethod 
	
	public void show()
	{
		System.out.println("area of shape is :" + area);
	}
}
