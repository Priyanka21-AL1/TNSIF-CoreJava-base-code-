package Day7Project5;

public class ShapeDemo {
	
	
       public static void main(String[] args) {
        
    	   
    	   Shape s;
    	   s= new Squar();
    	   s.calArea();
    	   s.show();
    	   System.out.println();
    	   
    	   s=new Rectangular();
    	   s.calArea();
    	   s.show();
       }
}
