package co.edureka.practice.Tree;

public class TreeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTree obj=new MyTree();
		obj.insertNode(50);
		obj.insertNode(57);
		obj.insertNode(75);
		obj.insertNode(98);
		obj.insertNode(23);
		obj.insertNode(43);
		obj.insertNode(11);
		obj.insertNode(34);
		obj.insertNode(12);
		obj.insertNode(65);
		obj.displayTree();
		
		System.out.println(obj.deleteNode(11));
		
		System.out.println("tree after deleting Node");
		System.out.println("***********************************");
		obj.displayTree();
		
		Node foundNode=obj.find(34);
		if(foundNode!=null) {
			System.out.println("Node FOund");
			foundNode.displayNode();
		}
		else {
			System.out.println("Not found");
		}
		
		System.out.println("traversing");
		obj.traverse("pre");
		System.out.println("\n");
		obj.traverse("in");
		System.out.println("\n");
		obj.traverse("post");
		System.out.println("\n");
	}
	
	
	
}
