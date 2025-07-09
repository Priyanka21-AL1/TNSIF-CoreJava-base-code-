package Day11Project;

public class Student {
	
	//entity
        private int rollNumber;
        private String name;
        
        
        // para constructor
		public Student(int rollNumber, String name) {
			super();
			this.rollNumber = rollNumber;
			this.name = name;
		}
		
		
		///getter setter
		public int getRollNumber() {
			return rollNumber;
		}
		public void setRollNumber(int rollNumber) {
			this.rollNumber = rollNumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
        
        
}
