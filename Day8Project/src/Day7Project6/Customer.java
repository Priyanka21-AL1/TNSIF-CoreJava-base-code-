package Day7Project6;

public class Customer {

	
	 private String name;
	 private String City;
	 
	 
	 // getter-setter
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getCity() {
		 return City;
	 }
	 public void setCity(String city) {
		 City = city;
	 }
	 
	 //para
	 
	 public Customer(String name, String city) {
		super();
		this.name = name;
		City = city;
	 }
	 
	 //non para
	 
	 public Customer() {
		
		 
	 }
	 
	 
	 
}
