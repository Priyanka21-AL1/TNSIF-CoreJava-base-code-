package Day5Project2;

 //child class
public class Student extends Citizen {
	
	//data members
   
    private int rollNo;
    private String clgName;
	
    
    //non para constructor
    public Student() {
		super();     // not removing super keyword bcoz i have super class citizen
	}


    //para constructor
	public Student(int rollNo, String clgName,String name, String adharNo, String address, long phone) {
		super( name,  adharNo,  address,  phone);
		this.rollNo = rollNo;
		this.clgName = clgName;
	}

	 // getter-setter

	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getClgName() {
		return clgName;
	}


	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	
	// to-String

	@Override           // access the data which inside the student memory
	public String toString() {
		return "Student [rollNo=" + rollNo + ", clgName=" + clgName + ", getName()=" + getName() + ", getAdharNo()="
				+ getAdharNo() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone() + "]";
	}



	
	
	
	
	
    
	
	
    
    
    
    
}
