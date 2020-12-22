package co.edureka.MyLinkedList;

import java.util.Scanner;

public class LinkedListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList l=new MyLinkedList();
	/*	
		l.insertNode(43);
		l.insertNode(31);
		l.insertNode(35);
		l.displayNode();
		l.deleteNode();
	*/	
		int inp=0;
		System.out.println("********Welcome to LinkedList*********");
		while(inp!=4) {
		System.out.println("LinkedList Operations:");
		System.out.println("1.Insertion");
		System.out.println("2.Display");
		System.out.println("3.Delete");
		System.out.println("4.Exit");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice:");
		inp=sc.nextInt();
		//MyLinkedList l=new MyLinkedList();
		switch(inp) {
		case 1:
			System.out.println("Enter Node to be Added: ");
			int data=sc.nextInt();
			l.insertNode(data);
			break;
		case 2:
			System.out.println("----Displaying Linked List----");
			l.displayNode();
			System.out.println("------------------------------");
			break;
		case 3:
			l.deleteNode();
			break;
		case 4:
			System.out.println("Thank You!!");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Entry!! Please Try Again.");
		}
		}	
	}

}
