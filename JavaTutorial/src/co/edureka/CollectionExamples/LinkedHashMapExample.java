package co.edureka.CollectionExamples;

import java.util.*;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> countryMap=new LinkedHashMap<String,String>();
		
		countryMap.put("India","Delhi");
		countryMap.put("Russia","Moscow");
		countryMap.put("Zimbabwe","Harare");
		countryMap.put("UAE","Abu Dhabi");
		countryMap.put("SriLanka","Colombo");
		
		for(Map.Entry<String,String> m:countryMap.entrySet()) {
			System.out.println(m.getValue()+" is capita of "+m.getKey());
		}
		
		Map<String,String> countryMap1=new TreeMap<String,String>();
		countryMap1.put("India","Delhi");
		countryMap1.put("Russia","Moscow");
		countryMap1.put("Zimbabwe","Harare");
		countryMap1.put("UAE","Abu Dhabi");
		countryMap1.put("SriLanka","Colombo");
		
		System.out.println("-------");
		
		for(Map.Entry<String,String> m:countryMap1.entrySet()) {
			System.out.println(m.getValue()+" is capita of "+m.getKey());
		}

	}

}
