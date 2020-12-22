package co.edureka.BSTreee;

public class MyTree {
	
	Node root;
	MyTree(){
		root=null;
	}
	
	public void insertNode(int value) {
		Node newNode=new Node(value);
		
		if(root==null) {
			System.out.println("This is my first Node");
			root=newNode;
		}
		else {
			Node current=root;
			Node parent;
			while(true) {
				parent=current;
				if(value<current.value) {
					current=current.leftNode;
					
					if(current==null) {
						parent.leftNode=newNode;
						return;
					}
				}
				else {
					current=current.rightNode;
					//if(current.value<value) {
						//current=current.rightNode;
						
						if(current==null) {
							parent.rightNode=newNode;
							return;
						}
					//}
				}
			}
			
		}
	}
	
	public boolean deleteNode(int value) {
		Node current=root;
		Node parent=root;
		
		boolean isLeftChild=true;
		while(current.value!=value) {
			parent=current;
			if(value<current.value) {
				isLeftChild=true;
				current=current.leftNode;
			}
			else {
				isLeftChild=false;
				current=current.rightNode;
			}
			if(current==null) {
				return false;
			}
		}
		
		if(current.leftNode==null & current.rightNode==null) {
			if(current==root) {
				root=null;
			}
			else if(isLeftChild) {
				parent.leftNode=null;
			}
			else {
				parent.rightNode=null;
			}
		}
		else if(current.rightNode==null) {
			if(current==root) {
				root=current.leftNode;
			}
			else if(isLeftChild) {
				parent.leftNode=current.leftNode;
			}
			else {
				parent.rightNode=current.leftNode;
			}
		}
		else if(current.leftNode==null) {
			if(current==root) {
				root=current.rightNode;
			}
			else if(isLeftChild) {
				parent.leftNode=current.rightNode;
			}
			else {
				parent.rightNode=current.rightNode;
			}
		}
		else { //right and left child present || Replace it with in order successor
			Node successor=getSuccessorNode(current);
			if(current==root) {
				root=successor;
			}
			else if(isLeftChild) {
				parent.leftNode=successor;
			}
			else {
				parent.rightNode=successor;
			}
			
			successor.leftNode=current.leftNode;
		}
		
		return true;
		
	}
	
	public Node getSuccessorNode(Node nodeToBeDeleted) {
		Node successorParent=nodeToBeDeleted;
		Node successor=nodeToBeDeleted;
		Node current=nodeToBeDeleted.rightNode;
		
		while(current!=null) {
			successorParent=successor;
			successor=current;
			current=current.leftNode;
		}
		
		if(successor!=nodeToBeDeleted.rightNode) {
			successorParent.leftNode=successor.rightNode;
			successor.rightNode=nodeToBeDeleted.rightNode;
		}
		
		return successor;
	}
	
	public Node find(int value) {
		Node current=root;
		while(current.value!=value) {
			if(value<current.value) {
				current=current.leftNode;
			}
			else {
				current=current.rightNode;
			}
			if(current==null) {
				return null;
			}
		}
		return current;
	}
	
	

}
