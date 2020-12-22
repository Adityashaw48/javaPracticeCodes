package co.edureka.util;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> data=new HashSet<>();
		data.add("Hi");
		data.add("Hello");
		data.add("Hello");//false
		data.add("aditya");
		data.add("qwewqe");
		data.add("cksdjbv");
		System.out.println(data);
		System.out.println(data +" Size:"+data.size());
		Iterator<String> it=data.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		data.add(null);
		System.out.println(data);

	}

}
