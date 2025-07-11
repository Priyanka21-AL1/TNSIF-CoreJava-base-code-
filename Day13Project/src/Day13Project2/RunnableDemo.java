package Day13Project2;

import java.util.concurrent.ForkJoinWorkerThread;

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         Runnable r= new UsingRunnable(10,1,"heyy");
//         
//         Thread t1 = new Thread(r);	
//         t1.start();
		
		Runnable r1= () -> System.out.println("Runnable with lambda");
		new Thread(r1).start();
         }

}
