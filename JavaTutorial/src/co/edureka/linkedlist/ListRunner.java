package co.edureka.linkedlist;

import java.util.Scanner;

public class ListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner st=new Scanner(System.in);
		int option=0;
		MyLinkedList obj=new MyLinkedList();
		
		while(option!=4) {
			System.out.println("1.Insert | 2.Delete | 3.Display | 4.Exit");
			System.out.println("Enter Your Choice:");
			option=st.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("Enter the value for Node:");
				int value=st.nextInt();
				obj.insertNode(value);
				break;
			case 2:
				System.out.println("Enter the value to delete:");
				obj.deleteNode();
				break;
			case 3:
				obj.displayNode();
				break;
			case 4:
				System.out.println("Good Bye!!");
				System.exit(0);
				break;
			default:
				break;
			}
		}
		st.close();
	}

}
