package co.edureka.MyLinkedList;

import java.util.Scanner;

public class MyLinkedList {
	
	Node firstNode;
	Node lastNode;
	
	MyLinkedList(){
		firstNode=null;
		lastNode=null;
	}
	
	
	public void insertNode(int data) {
		Node node = new Node(data);
		node.next=null;
		if(firstNode==null) {
			firstNode=node;
			lastNode=node;
			System.out.println("LinkedList has been created and First Node has been inserted!!");
		}
		else {
			lastNode.next=node;
			lastNode=node;
			System.out.println("Node has been Added!");
		}
		
	}
	
	public void displayNode() {
		Node n=firstNode;
		int i=1;
		/*if(firstNode==null) {
			System.out.println("Empty LinkedList!!");
		}*/
		while(n!=null) {
			System.out.println("Data for Node "+i+" :"+n.data);
			n=n.next;
			i=i+1;
		}
	}
	
	public void deleteNode() {
		Node node,buffernode;
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		displayNode();
		
		for(node=firstNode;node!=null;node=node.next) {
			cnt++;
		}
		node=firstNode;
		buffernode=firstNode;
		System.out.println("Total Node:"+cnt);
		if(cnt==0) {
			System.out.println("No Node to be Deleted");
		}
		else {
		
		System.out.println("Enter Node Number to be Deleted: ");
		int num=sc.nextInt();
		
		
		if(num>cnt) {
			System.out.println("Invalid Entry for Deletion");
		}
		else if(num!=1) {
			for(int i=2;i<=num;i++) {
				node=node.next;
			}
			for(int i=2;i<=num-1;i++) {
				buffernode=buffernode.next;
			}
			buffernode.next=node.next;
			node.next=null;
			node=null;
			//System.out.println("Node Deleted Successfully!!");
		}
		else {
			firstNode=firstNode.next;
			node=null;
			
		}
		System.out.println("Node Deleted Successfully!!");
		//displayNode();
		
		//sc.close();
		}
	}

}
