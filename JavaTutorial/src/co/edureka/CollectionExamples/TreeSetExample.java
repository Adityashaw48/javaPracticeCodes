package co.edureka.CollectionExamples;

import java.util.*;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> airportCodes=new TreeSet<>();
		airportCodes.add("MAA");
		airportCodes.add("BLR");
		airportCodes.add("IXC");
		airportCodes.add("DED");
		airportCodes.add("BOM");
		airportCodes.add("DEL");
		airportCodes.add("GOI");
		airportCodes.add("PNG");
		
		Iterator<String> itr=airportCodes.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
