package co.edureka.practice;

public class LinkedNode {
	
	int data;
	LinkedNode next;
	
	LinkedNode(int data){
		this.data=data;
	}
 
	public void display() {
		System.out.println("Data for this Node:"+data);
	}
	
}
