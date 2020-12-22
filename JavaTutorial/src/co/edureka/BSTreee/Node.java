package co.edureka.BSTreee;

public class Node {
	
	int value;
	
	public Node leftNode;
	public Node rightNode;
	
	Node(int value){
		this.value=value;
	}
	
	public void displayNode() {
		System.out.println("{" +value+"}");
	}

}
