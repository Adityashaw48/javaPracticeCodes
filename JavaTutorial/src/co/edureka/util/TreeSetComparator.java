package co.edureka.util;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<>(new MyComparator());
		ts.add("X");
		ts.add("A");
		ts.add("D");
		ts.add("M");
		ts.add("Y");
		ts.add("E");
		System.out.println(ts);

	}
}
class MyComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return -1;//value pf compare method will decide the sorting order of Treeset
		//for 0 only Root element is added
		//for negative descending order
		//for positive ascending order
	}
	
}
