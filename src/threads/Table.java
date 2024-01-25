package threads;

public class Table implements Runnable {

	int num;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread of num "+ num);
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"X"+i+"="+num*i);
		}
		

		
	}
	public Table(int num) {
		super();
		this.num = num;
	}
	public Table()
	{
		super();
	}
	

}
