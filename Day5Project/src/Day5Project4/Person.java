package Day5Project4;

public class Person {
       private String name;
       private String city;
       
       //default constructor
	   public Person() {
		System.out.println("person class default value...");
		name ="priya";
		city = "mumbai";
	   }
  // para constructor
	   public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	   }
// getter-setter
	   public String getName() {
		   return name;
	   }

	   public void setName(String name) {
		   this.name = name;
	   }

	   public String getCity() {
		   return city;
	   }

	   public void setCity(String city) {
		   this.city = city;
	   }
	   
	   
	   //to-String
	   @Override
	   public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	   }
	   
	   
	   
	   
	   
       
      
}
