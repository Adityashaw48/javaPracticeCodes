package co.edureka.util;

import java.util.ArrayList;

public class ArrayL {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		System.out.println("Names: "+names + "| Size: "+names.size());
		names.add("Aditya");
		names.add("Abhisek");
		names.add("Aman");
		System.out.println("Names: "+names + "| Size: "+names.size());
		System.out.println(names.contains("Aditya"));
		names.remove("Abhisek");
		names.add(1, "Abhi");
		System.out.println(names);
		System.out.println(names.get(2));

	}

}
