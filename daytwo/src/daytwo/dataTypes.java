package daytwo;

public class dataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //variable declaration.......
		
		//  int for = 1;        error bcoz we can declare variable as key word
		
		// int num 1 =34;          no any spaces allowed in between variable name
		
		// int @num =12;    Special symboles are not allowed only ($ and _ ) are allowed
		
		String $name = " priyanka";
		
		System.out.println("name is :" + $name );
		
		int a =4/3;
		System.out.println("the value of a :" + a);
		float b= 12f/34f;
		System.out.println("the value of b:" + b);
		double c = 12d/32d;
		System.out.println("the value of c :" + c);
		
		int rd =10;
		double percentage =3.14*rd*rd;
		System.out.println("Area of circle :" + percentage);
		
		char ch1 =65;
		System.out.println("the value of ch1:" + ch1);
		
		int name = 'a';
		System.out.println("the value of name :" + name);
		
		// try to assign unicode to char 
		
		 char var1= '\u00A7';
		 System.out.println("the value of unicode value :" + var1);
		 
		 
		 byte byteMax= 127;
		 byte byteMin = -128;
		 System.out.println("the min range of byte :" + byteMin  + "   "+ "the max range of byte:" + byteMax);
		 
		 //int -----4byte
		 int maxint =2147483647;
		 int minint=-2147483647;
		 System.out.println("the min range of INT :" + minint  + "   "+ "the max range of INT:" + maxint);
		 
		 //long-----8byte
		 
		 long maxlong=9223372036854775807l;
		 long minlong= -9223372036854775807l;
		 System.out.println("the min range of LONG :" + minlong  + "   "+ "the max range of LONG:" + maxlong);
		 
		 //float ---4byte
		 
		 float f = 3234.141243278345f;
		 System.out.println("the value of  f :" + f);
		 double d= 3234.141243278345678902345678914f;
		 System.out.println("the value of d :" + d);
		 
		 boolean flage = false;
		 boolean falge2 = true;
		 
		 
	}
	
	

}
