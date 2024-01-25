package threads;

public class TableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Table t=new Table(5);
		Thread t1=new Thread(t,"Thread-Table of 5");
		t1.start();
		System.out.println(t1.getId());
		System.out.println(t1.getName());

	}

}
