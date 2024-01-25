package collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
public class ToArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue<Integer> arr=new ArrayDeque<>();
		PriorityQueue<Integer> arr=new PriorityQueue<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
//
//		Object []a=arr.toArray();
//		for(Object x:arr)
//		{
//			System.out.println(x);
//		}
		
//		Integer a[]=arr.toArray(new Integer[0]);
//		for(Integer x: a)
//		{
//			System.out.println(x);
//		}
		
		arr.removeIf(n->n<20);
		System.out.println(arr);
		
	}

}
