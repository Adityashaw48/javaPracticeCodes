package co.edureka.MyLinkedList;

public class Node {
	
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
	}
	
	public void display() {
		System.out.println("Data for this node:"+data);
	}

}
