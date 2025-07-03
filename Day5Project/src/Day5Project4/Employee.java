package Day5Project4;

public class Employee extends Person {
	private int empid;
	private float salary;
	private String dep;
	
	
	//default
	public Employee() {
		super();
		
		System.out.println("the default values are ..");
		empid= 101;
		salary=30076677.5f;
		dep= "it";
	}
	
	


public Employee(int empid, float salary, String dep,String name, String city) {
		super( name,  city);
		this.empid = empid;
		this.salary = salary;
		this.dep = dep;
	}




//getter-setter
	public int getEmpid() {
		return empid;
	}



	public void setEmpid(int empid) {
		this.empid = empid;
	}



	public float getSalary() {
		return salary;
	}



	public void setSalary(float salary) {
		this.salary = salary;
	}



	public String getDep() {
		return dep;
	}



	public void setDep(String dep) {
		this.dep = dep;
	}



	// to string
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", dep=" + dep + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + "]";
	}



	
	
	
	

}
