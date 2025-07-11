package Day13Project;

public class AccountThred  extends Thread{
 private Account acc;
 private  int amt;
 
 //para
 public AccountThred(Account acc, int amt) {
	super();
	this.acc = acc;
	this.amt = amt;
	start();
 }
 
 @Override
	public void run()
	{
		try
		{
			acc.withdraw(amt);
		}
		catch(InsuficientBalanceException e)
		{
			System.err.println(e.getMessage());
		}
	}

 
 //getter-setter
 public Account getAcc() {
	return acc;
 }

 public void setAcc(Account acc) {
	this.acc = acc;
 }

 public int getAmt() {
	return amt;
 }

 public void setAmt(int amt) {
	this.amt = amt;
 }
 
 
 
 
}
