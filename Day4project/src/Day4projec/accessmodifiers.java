package Day4projec;

public class accessmodifiers {
                // declare default .\ , private , protected and public variables
	
	int varDefault = 10;
	public int varPublic =20;
	private int  varPrivate=30;   // giving remainder only for private class and not for other bcozz other can used in diff classes 
	protected int varProtected =40;
	
	
	//declare default  , private , protected and public variables
	
	void methodfault()
	{
		System.out.println("default access base class");
		System.out.println("default variable:" + varDefault);
	}
	
	public void methodPublic()
	{
		System.out.println("Public access base class");
		System.out.println("public variable:" + varPublic);
	}
	
	void methodPrivate()
	{
		System.out.println("Private access base class");
		System.out.println("private variable:" + varPrivate);
	}
	
	void methodProtected()
	{
		System.out.println("Protected access base class");
		System.out.println("Protected variable:" + varProtected);
	}
}
