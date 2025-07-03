package Day5Project4;

public class Student extends Person{
     private String clas;
     private float percent;
     
     //default
	 public Student() {
		System.out.println("assign default values");
		clas = "FY";
		percent = 89f;
	 }

	//para constructor
	 public Student(String name, String city,String clas, float percent) {
		super( name,  city);
		this.clas = clas;
		this.percent = percent;
	 }
	 
	 //geter-setter

	 public String getClas() {
		 return clas;
	 }

	 public void setClas(String clas) {
		 this.clas = clas;
	 }

	 public float getPercent() {
		 return percent;
	 }

	 public void setPercent(float percent) {
		 this.percent = percent;
	 }
// to -string
	 @Override
	 public String toString() {
		return "Student [clas=" + clas + ", percent=" + percent + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	 }
	 
	 
	 
	 
	 
	 
     
     
     
     
     
     
     
}
