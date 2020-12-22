package co.edureka.linkedlist;

public class Node {
	
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
	}
	
	public void display() {
		System.out.println("Data For this Node:"+data);
	}

}
