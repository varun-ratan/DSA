package mutithreading;

public class ThreadMain {
	public static void main(String []args)
	{
		MyThread th=new MyThread(10,20);
		th.run();
		
	}

}
