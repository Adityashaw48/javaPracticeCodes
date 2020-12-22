package co.edureka.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteration {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Integer> data = new ArrayList<>();
		for(int i=11;i<=16;i++) {
			data.add(i);
		}
		System.out.println(data);
		
		iterate1(data);
		Thread.sleep(1500);
		iterate2(data);
		Thread.sleep(1500);
		iterate3(data);
		Thread.sleep(1500);
		iterate4(data);
		Thread.sleep(1500);
		iterate5(data);

	}
	static void iterate1(List<Integer> data) {
		System.out.println("1. List Iterator using For loop with get() method- only for list");
		for(int i=0;i<data.size();i++) {
			System.out.print(data.get(i)+" ");
		}
		System.out.println("\n");
	}
	static void iterate2(List<Integer> data) {
		System.out.println("2. List Iterator using enhanced For loop");
		for(Integer n:data) {
			System.out.print(n+" ");
		}
		System.out.println("\n");
	}
	
	static void iterate3(List<Integer> data) {
	System.out.println("3. List Iteration using java.util.Iterator");
	Iterator<Integer> it=data.iterator();
	while(it.hasNext()) {
		System.out.print(it.next()+" ");
	}
	System.out.println("\n");
	}
	
	static void iterate4(List<Integer> data) {
	System.out.println("4. List Iteration using java.util.ListIterator--only for List");
	ListIterator<Integer> lit= data.listIterator();
	while(lit.hasNext()) {
		System.out.print(lit.next()+" ");
	}
	System.out.println("\n");
	System.out.println("To print in Reverse order:");
	while(lit.hasPrevious()) {
		System.out.print(lit.previous()+" ");
	}
	System.out.println("\n");
	}
	
	static void iterate5(List<Integer> data) {
		System.out.println("5. List Iteration using Enumeration--Old Method");
		Enumeration<Integer> en=Collections.enumeration(data);
		while(en.hasMoreElements()) {
			System.out.print(en.nextElement()+" ");
		}
		System.out.println("\n");
		
	}
}
