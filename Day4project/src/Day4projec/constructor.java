package Day4projec;

public class constructor {

	
		
        private String customerName;
        private int customerId;
        private String customerCity;
        
        
        
        //default constructor
        
        public constructor()
        {
        	System.out.println(" hello this is Default Constructor");
        }


   

		//parametric Constructor  // works like an setter method
		public constructor(String customerName, int customerId, String customerCity)
		{
			
			//this ();  //calling default constructor
			
			System.out.println("hello is this para constructor");
			this.customerName = customerName;
			this.customerId = customerId;
			this.customerCity = customerCity;
		}
		
		
	    public String getCustomerName() {
				return customerName;
			}


			public void setCustomerName(String customerName) {
				this.customerName = customerName;
			}


			public int getCustomerId() {
				return customerId;
			}


			public void setCustomerId(int customerId) {
				this.customerId = customerId;
			}


			public String getCustomerCity() {
				return customerCity;
			}


			public void setCustomerCity(String customerCity) {
				this.customerCity = customerCity;
			}




			@Override
			public String toString() {
				return "constructor [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
						+ customerCity + "]";
			}




			

        
        
        
        
	

}
