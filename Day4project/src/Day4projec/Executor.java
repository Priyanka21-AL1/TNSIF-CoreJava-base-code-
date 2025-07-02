package Day4projec;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    accessmodifiers a1 = new accessmodifiers();
    a1.methodfault();
    a1.methodProtected();
    a1.methodPublic();
    a1.methodPrivate();
    
    
    a1.varDefault= 11;
    a1.methodfault();
    
    a1.varProtected=100;
    a1.methodProtected();
    
    
	}

}
