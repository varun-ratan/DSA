package comparators;

import java.util.*;
import java.util.stream.Collectors;
public class StudentMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> s=new ArrayList<>();
		Student s1=new Student("Varun");
		Student s2=new Student("Aditya");
		Student s3=new Student("Shivansh");
		s.add(s1);
		s.add(s2);
		s.add(s3);
	
		
		List<Student> k=s.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
		for(Student i:k)
		{
			System.out.println(i.getName());
		}
		//Collections.sort();
	}



}
