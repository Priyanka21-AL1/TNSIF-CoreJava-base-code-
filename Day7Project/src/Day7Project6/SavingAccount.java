package Day7Project6;

public class SavingAccount extends Customer implements Bank{

	
	 private int Account_number;
	 private float Balance;
	 
	 //para cons
	 
	public SavingAccount(String name, String city, int account_number, float balance) {
		super(name, city);
		Account_number = account_number;
		Balance = balance;
	}
	
	//gettter-setter

	public int getAccount_number() {
		return Account_number;
	}



	public void setAccount_number(int account_number) {
		Account_number = account_number;
	}



	public float getBalance() {
		return Balance;
	}



	public void setBalance(float balance) {
		Balance = balance;
	}



	@Override
	public void deposit(float amount) {
		// TODO Auto-generated method stub
		if(amount<0 || amount > Deposit_limit)
		{
			System.out.println("plz deposite valid amount");
		}
		else
		{
			Balance+= amount; 
			System.out.println("RS :" + amount + " Deposited successfully");
		}
	}

	@Override
	public void withdraw(float amount) {
		// TODO Auto-generated method stub
		if(amount <= Balance - MINBAL)
		{
			Balance-=amount;
			System.out.println("RS :" + amount + " withdraw successfully");
		}
		else
		{
			System.out.println("insufficient Balance");
		}
	}

	@Override
	public String toString() {
		return "SavingAccount [Account_number=" + Account_number + ", Balance=" + Balance + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + "]";
	}
	
	
        
}
