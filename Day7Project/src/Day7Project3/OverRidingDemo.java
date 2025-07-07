package Day7Project3;

public class OverRidingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           RBI rbi ;
           // dynamic binding assigning child obj to parent class reference variables
           
           rbi = new SBI();
           System.out.println(rbi.getRateofInterest());
           
           rbi = new ICICI();
           System.out.println(rbi.getRateofInterest());
           
          
	}

}
