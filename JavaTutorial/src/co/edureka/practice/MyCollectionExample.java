package co.edureka.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MyCollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l=new ArrayList<String>();
		
		l.add("Aditya");
		l.add("Yash");
		l.add("Bholu");
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.contains("Bholu"));
		
		Iterator<String> itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ArrayList<String> l2=new ArrayList<String>();
		l2.add("Aditya");
		l2.add("Yash");
		l2.add("Bholu");
		System.out.println(l2);
		System.out.println(l2.size());
		System.out.println(l2.contains("Bholu"));
	
		LinkedList<String> ll2=new LinkedList<String>();
		ll2.add("Aditya");
		ll2.add("Yash");
		ll2.add("Bholu");
		System.out.println(ll2);
		System.out.println(ll2.size());
		System.out.println(ll2.contains("Bholu"));
	
		Set<String> s=new HashSet<String>();
		
		s.add("Aditya");
		s.add("XASDEF");
		s.add("ZASDEF");
		s.add("Aditya");
		System.out.println(s);

		Set<String> s1=new LinkedHashSet<String>();
		
		s1.add("Aditya");
		s1.add("XASDEF");
		s1.add("ZASDEF");
		s1.add("Aditya");
		System.out.println(s1);
		
		Set<String> s2=new TreeSet<String>();
		
		s2.add("Aditya");
		s2.add("XASDEF");
		s2.add("ZASDEF");
		s2.add("Aditya");
		System.out.println(s2);
		
		SortedSet<String> s3=new TreeSet<String>();
		
		s3.add("Aditya");
		s3.add("XASDEF");
		s3.add("ZASDEF");
		s3.add("Aditya");
		System.out.println(s3);
	}

}
