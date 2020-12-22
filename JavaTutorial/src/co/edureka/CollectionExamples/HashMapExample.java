package co.edureka.CollectionExamples;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> studentsMap=new HashMap<Integer,String>();
		studentsMap.put(1,"Aditya");
		studentsMap.put(2,"Rahul");
		studentsMap.put(3,"Khushi");
		studentsMap.put(4,"Aman");
		studentsMap.put(5,"Saurav");
		studentsMap.put(6,"Pulkit");
		
		System.out.println(studentsMap);
		
		Set<Integer> mapKeys=studentsMap.keySet();
		
		Iterator<Integer> sitr=mapKeys.iterator();
		while(sitr.hasNext()) {
			System.out.println(sitr.next());
		}
		
		System.out.println("----------------------");
		Collection mapValues=studentsMap.values();
		
		Iterator<String> vitr=mapValues.iterator();
		
		while(vitr.hasNext()) {
			System.out.println(vitr.next());
		}
		
		for(Map.Entry<Integer, String> m:studentsMap.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
	}

}
