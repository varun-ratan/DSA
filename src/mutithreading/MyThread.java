package mutithreading;

public class MyThread implements A, B,Runnable{
	int a,b;


	@Override
	public int sum(int a, int b) {
		System.out.println(a+b);
		return 0;
	}
	
	MyThread()
	{
		super();
	}
	MyThread(int a,int b)
	{
		this.a=a;
		this.b=b;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		sum(a,b);
		
	}
	

}
