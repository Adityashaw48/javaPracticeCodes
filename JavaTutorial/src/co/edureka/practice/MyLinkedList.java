package co.edureka.practice;

public class MyLinkedList {
	LinkedNode firstNode,lastNode;
	
	MyLinkedList(){
		firstNode=null;
		lastNode=null;
	}
	
	public void insertNode(int data) {
		LinkedNode node=new LinkedNode(data);
		node.next=null;
		
		if(firstNode==null) {
			firstNode=node;
			lastNode=node;
			System.out.println("first Node Added!!");
		}
		else {
			lastNode.next=node;
			lastNode=node;
			System.out.println("New Node Added!!");
		}
		
	}
	
	public void displayNode() {
		LinkedNode node=firstNode;
		if(node==null) {
			System.out.println("Empty LinkedList!!");
		}
		else {
			while(node!=null) {
				System.out.println("Data for this Node:"+node.data);
				node=node.next;
			}
		}
	}
	
	public void deleteNode() {
		
		
	}
}
