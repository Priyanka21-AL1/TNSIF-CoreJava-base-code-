package Day13Project;

public class Account implements Bank {

	
	 private int accno;
	 private String name;
	 private float Balance;
	 
	 
	public Account(int accno, String name, float balance) {
		super();
		this.accno = accno;
		this.name = name;
		Balance = balance;
	}
	
	
	public Account() {
		super();
	}
	
	


	public int getAccno() {
		return accno;
	}


	public void setAccno(int accno) {
		this.accno = accno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getBalance() {
		return Balance;
	}


	public void setBalance(float balance) {
		Balance = balance;
	}
	
	


	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", Balance=" + Balance + "]";
	}


	
	@Override
	public void deposite(int amt) throws DepositeLimitException {
		// TODO Auto-generated method stub
		 if(amt>25000)
			 throw new  DepositeLimitException("daily limit expire....");
		 else
		 {
			 Balance += amt;
			 System.out.println("amount deposited");
		 }
	}
	@Override
	public synchronized void withdraw(int amt) throws InsuficientBalanceException {
		// TODO Auto-generated method stub
		 if(Balance-amt<MINBAL)
			 throw new InsuficientBalanceException();
		 else
		 {
			 Balance=Balance-amt;
			 System.out.println("after the withdraw RS : " + amt + " the current blance is "+ Balance);
		 }
	}

}
