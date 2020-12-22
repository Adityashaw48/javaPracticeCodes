package co.edureka.util;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> data=new TreeSet<>();//Sorted Set
		data.add("Ai");
		data.add("Xello");
		data.add("Fello");//false
		data.add("Tditya");
		data.add("Uwewqe");
		data.add("Iksdjbv");
		System.out.println(data);
		System.out.println(data +" Size:"+data.size());
		Iterator<String> it=data.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//data.add(null);//Null Pointer Exception..Null reference not possible
		System.out.println(data);
		System.out.println(data.descendingSet());

	}

}
