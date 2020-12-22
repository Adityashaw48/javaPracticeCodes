package co.edureka.linkedlist;

import java.util.Scanner;

/* 1. Insert a Node -- insertNode()
 * 2. Delete a Node -- deleteNode()
 * 3. Display the existing Node --displayNode()
 */

public class MyLinkedList {

	Node firstNode,lastNode;
	
	MyLinkedList(){
		firstNode=null;
		lastNode=null;
	}
	
	public void insertNode(int value) {
		Node node= new Node(value);
		node.next=null;
		
		if(firstNode==null) {
			firstNode=node;
			lastNode=node;
			System.out.println("List is Created and first value is inserted");
		}
		else {
			lastNode.next=node;
			lastNode=node;
			System.out.println("Node inserted successfully!!");
		}
	}
	
	public void displayNode() {
		Node node=firstNode;
		System.out.println("List of Nodes:");
		int counter=0;
		while(node!=null) {
			counter++;
			System.out.print(counter+".");
			node.display();
			node=node.next;
		}
	}
	
	public void deleteNode() {
		int count=0;
		int i;
		Node node,bufferNode;
		Scanner st=new Scanner(System.in);
		
		for(node=firstNode;node!=null;node=node.next) {
			count++;
		}
		displayNode();
		node=firstNode;
		bufferNode=firstNode;
		System.out.println(count+" Nodes are available!");
		System.out.println("Enter the node number you want to delete:");
		int del=st.nextInt();
		if(del!=1) {
			if(del<=count) {
				for(i=2;i<=del;i++) {
					node=node.next;
				}
				for(i=2;i<=del-1;i++) {
					bufferNode=bufferNode.next;
				}
				bufferNode.next=node.next;
				node.next=null;
				node=null;
			}
			else {
				System.out.println("Invalid Number!!");
			}
		}
		else {
			firstNode=node.next;
			node=null;
		}
		System.out.println("Node deleted Successfully!!");
		//st.close(); //Throwing error NosuchElement Exception
		//st.close();
	}

}
