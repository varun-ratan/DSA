package hashMap;

import java.util.HashMap;

public class HashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student, Integer> hm=new HashMap<>();
		Student s=new Student(1,"Aditya");
		Student s1=new Student(1,"Varun");
		Student s2=new Student(2,"Bella");
		Student s3=new Student(3,"Ananya");
		hm.put(s,100);
		hm.put(s1,80);
		hm.put(s2,30);
		hm.put(s3,50);
		
		
		System.out.println(hm.size());

	}

}
