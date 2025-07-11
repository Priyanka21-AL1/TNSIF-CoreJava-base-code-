package Day12ProjectTHREAD;{

public class ThreadMethodDemo {
	ChildThread t1 =  new ChildThread(5 ,"First");
	ChildThread t2 =  new ChildThread(10 ,"last");
	
	t1.start();
	t2.start();
}
}
