package co.edureka.CollectionExamples;

import java.util.*;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> numbers=new LinkedHashSet<Integer>();
		
		for (int i=1;i<20;i++) {
			numbers.add(i);
		}
		System.out.println(numbers);
		
		
		System.out.println(numbers.add(21));
		System.out.println(numbers.add(19));
		
		System.out.println("Size:"+numbers.size());
		System.out.println("Remove 5 frm set:"+numbers.remove(5));
		System.out.println("Remove 45 frm set:"+numbers.remove(45));
		System.out.println(numbers);

	}

}
