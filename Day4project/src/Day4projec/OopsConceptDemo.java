package Day4projec;

public class OopsConceptDemo {
      private int serialnum ;
      private int age;
      private String name;
      
      
	  public int getSerialnum() {
		  return serialnum;
	  }
	  public void setSerialnum(int serialnum) {
		  this.serialnum = serialnum;
	  }
	  public int getAge() {
		  return age;
	  }
	  public void setAge(int age) {
		  this.age = age;
	  }
	  public String getName() {
		  return name;
	  }
	  public void setName(String name) {
		  this.name = name;
	  }
	  @Override
	  public String toString() {
		return "OopsConceptDemo [serialnum=" + serialnum + ", age=" + age + ", name=" + name + "]";
	  }
      
      
}
