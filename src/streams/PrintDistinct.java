package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class PrintDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(2,3,5,2,3,1));
//		arr.stream()
//			.distinct()
//			.forEach(System.out::println);
		
		System.out.println(arr.stream().count());		
		

	}

}
