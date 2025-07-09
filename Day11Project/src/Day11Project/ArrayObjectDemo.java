package Day11Project;

public class ArrayObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student []arry; //= new Student[5];
		
		//declaare memmory for 5 obj 
		
		arry = new Student[5];
		
		arry[0] = new Student(101,"priyanka" );	
		arry[1] = new Student(102,"rushikesh" );	
		arry[2] = new Student(105,"sneha" );	
		arry[3] = new Student(103,"shinu" );	
		arry[4] = new Student(104,"raj" );	
		
		for(int i=0;i<arry.length;i++) {
			System.out.println("element at" +i + ":"+ arry[i].getRollNumber()+"\t" +arry[i].getName());
		}
		
	}

}
