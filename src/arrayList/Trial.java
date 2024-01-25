package arrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class Trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // Cat c=new Cat();
		Cat c=new Cat("Bella","Indian",5);
		Cat c1=new Cat("Uno","Indian",2);
      ArrayList<Cat> temp=new ArrayList<>();
      temp.add(c);
      temp.add(c1);
      Iterator<Cat> itr=temp.iterator();
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
      }
      
      
	}

}

class Cat{
	String name;
	String type;
	int age;
	public Cat(String name,String type,int age)
	{
		this.name=name;
		this.type=type;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", type=" + type + ", age=" + age + "]";
	}
	
}