package co.edureka.CollectionExamples;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> names=new HashSet<>();
		names.add("Monica");
		names.add("Chandler");
		names.add("Phoebe");
		names.add("Joey");
		names.add("Rachel");
		names.add("Ross");
		
		System.out.println(names);
		
		System.out.println("Does names contains Sheldon:"+names.contains("Sheldon"));
		System.out.println("Does names contains Sheldon:"+names.contains("Joey"));
		
		names.add("Janice");
		
		System.out.println(names);
		
		names.remove("Janice");
		
		System.out.println(names);
		
		Iterator<String> itr =names.iterator();
		while(itr.hasNext()) {
			System.out.println("Names: "+itr.next());
		}
		
	}
}
