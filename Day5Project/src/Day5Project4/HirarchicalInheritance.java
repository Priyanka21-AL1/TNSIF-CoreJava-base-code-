package Day5Project4;

public class HirarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Person p1 = new Person();
       System.out.println("-------------allocate defaultfor p1----------");
       System.out.println(p1);
       
       System.out.println("-----------------------------------");
       
       
       
       
       // bye using dynamic binding which is use to save memory 
       
       Person p;
       p=new Person("Priyanka", "pune");
       
       System.out.println("person details " + p);
       
       p=new Student("priyanka","pune", "be", 80f);
       System.out.println("Student details:" + p);
       
       p=new Employee(101,346798.6f,"Computer", "priyanka","pune");
       System.out.println("Student details:" + p);
	}

}
