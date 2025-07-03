package Day5Project;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Address address = new Address("405 Laxmi nagar ","pune","Maharashtra","411065");
        
        Person p = new Person("Priyanka",address);
        p.displayInfo();
        System.out.println(p);
	}

}
