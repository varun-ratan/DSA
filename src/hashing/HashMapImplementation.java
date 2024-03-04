package hashing;

import java.util.HashMap;

public class HashMapImplementation {
	public static void main(String []args)
	{
		HashMap<String,Integer> hash=new HashMap<>();
		hash.put("ide", 10);
		hash.put("gfg", 20);
		hash.put("hello", 5);
		System.out.println(hash);
		System.out.println(hash.remove("gfg"));
		System.out.println(hash.containsKey("gfg"));
		System.out.println(hash.remove("gfg"));
		System.out.println(hash.get("hello"));
	}

}
