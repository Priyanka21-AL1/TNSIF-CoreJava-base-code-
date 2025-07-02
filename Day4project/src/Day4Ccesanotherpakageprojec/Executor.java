package Day4Ccesanotherpakageprojec;

import Day4projec.accessmodifiers;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
                //accesssing different package class
		
		accessmodifiers a1 = new accessmodifiers();
		
		//access default ,protected and public
		     a1.methodPublic();
		     a1.varPublic=23345;
		     a1.methodPublic();
		     
	}

}
