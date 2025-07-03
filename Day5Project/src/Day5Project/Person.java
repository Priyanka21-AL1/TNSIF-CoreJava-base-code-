package Day5Project;

public class Person {
          private String name;
          private Address address;
          
          
          
          //para constructor
		  public Person(String name, Address address) {
			super();
			this.name = name;
			this.address = address;
		  }



		  public String getName() {
			  return name;
		  }



		  public void setName(String name) {
			  this.name = name;
		  }



		  public Address getAddress() {
			  return address;
		  }



		  public void setAddress(Address address) {
			  this.address = address;
		  }
		  
		  // method to display person info
		  
		  public void displayInfo()
		  {
			  System.out.println("name :" + name);
			  System.out.println("Address :" + address.getStreet()+ address.getState() + address.getCity() + address.getPostalCode());	
			  }


         // to String method
		  @Override
		  public String toString() {
			return "Person [name=" + name + ", address=" + address + "]";
		  }
		  
		  
		  
          
          
         
          
          
}
