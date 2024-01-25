package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String []args)
	{
		int a[]= {5,4,4,4,1,2,3,6};
//		Arrays.sort(a);
//		int j=0;
//		for(int i=0;i<a.length-1;i++)
//		{
//			if(a[i]!=a[i+1])
//			{
//				a[j++]=a[i];
//			}
//		}
//		a[j++]=a[a.length-1];
//		for(int i=0;i<j;i++)
//		{
//			System.out.println(a[i]);
//		}
//		
//		Arrays.stream(a)
//			  .filter(i->i%2==0)
//			  .forEach(System.out::println);
		
		List<Integer> arr=new ArrayList<>();
		arr.add(2);
		arr.add(2);
		arr.add(4);
		arr.add(1);
		arr.add(1);
//		arr.stream()
//			.distinct()
//			.forEach(System.out::println);
		
//		List<Integer> arr1=new ArrayList<>();
//		
//		for(int i=0;i<arr.size();i++)
//		{
//			if(!arr1.contains(arr.get(i)))
//			{
//				arr1.add(arr.get(i));
//			}
//
//		}
//		System.out.println(arr1);
		Collections.sort(arr);
		for(int i=0;i<arr.size()-1;i++)
		{
			if(arr.get(i).equals(arr.get(i+1)))
			{
				arr.remove(i+1);
			}
		}
		System.out.println(arr	);
		


	}

}
