package Day13Project;

public class SynchronizationDriver  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Account heti= new Account(1001,"heti",56000);
		System.out.println(heti);
		//heti.withdraw(7856);
		
		AccountThred t[] = new AccountThred[10];
		for(int i=0;i<10;i++) {
			t[i]= new AccountThred(heti,1000*(i+1));
		}
		try
		{
			for(int i=0;i<10;i++)
			{
				t[i].join();
			}
		}
		catch(InterruptedException e)
		{
			System.err.println(e.getMessage());
		}
		
		System.out.println("................................");
		System.out.println(heti);
	}

}
