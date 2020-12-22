package co.edureka.util;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> data=new LinkedHashSet<>();//Same as Hashset but order is maintained
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


	}

}
