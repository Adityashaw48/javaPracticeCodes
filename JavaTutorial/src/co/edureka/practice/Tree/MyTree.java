package co.edureka.practice.Tree;

import java.util.Stack;

public class MyTree {
	Node root;
	
	MyTree(){
		root=null;
	}
	
	public void insertNode(int value) {
		Node newNode=new Node(value);
		if(root==null) {
			System.out.println("This is the first Node");
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
				else if(value>current.value) {
					current=current.rightNode;
					if(current==null) {
						parent.rightNode=newNode;
						return;
					}
					
				}
			}
		}
	}
	public void displayTree()
    {
           Stack globalStack = new Stack();
           globalStack.push(root);
           int nBlanks = 32;
           boolean isRowEmpty = false;
           System.out.println("......................................................");
           while(isRowEmpty==false)
           {
                  Stack localStack = new Stack();
                  isRowEmpty = true;
                  for(int j=0; j<nBlanks; j++)
                          System.out.print(' ');
                          
                  while(globalStack.isEmpty()==false)
                  {
                     Node temp = (Node)globalStack.pop();
                     if(temp != null)
                        {
                            System.out.print(temp.value);
                            localStack.push(temp.leftNode);
                            localStack.push(temp.rightNode);
                            if(temp.leftNode != null || temp.rightNode != null)
                                      isRowEmpty = false;
                        }
                     else
                        {
                            System.out.print("--");
                            localStack.push(null);
                            localStack.push(null);
                        }
                     for(int j=0; j<nBlanks*2-2; j++)
                           System.out.print(' ');
                  }  // end while globalStack not empty
           
                  System.out.println();
                  nBlanks /= 2;
                  while(localStack.isEmpty()==false)
                         globalStack.push( localStack.pop() );
                 
           }  // end while isRowEmpty is false
           System.out.println("......................................................");
       
    } 
	
	public boolean deleteNode(int value) {
		Node current=root;
		Node parent=root;
		boolean isLeftChild=true;
		
		if(current.value!=value) {
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
		else { //both children available || Replace with inorder successor
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
	public void traverse(String traverseType) {
		if(traverseType.equals("pre")) {
			preOrder(root);
		}
		else if(traverseType.equals("post")) {
			postOrder(root);
		}
		else if(traverseType.equals("in")) {
			inOrder(root);
	
		}
	}
	
	public void preOrder(Node localNode) {
		if(localNode!=null) {
			System.out.print(localNode.value+" ");
			preOrder(localNode.leftNode);
			preOrder(localNode.rightNode);
		}
	}
	public void postOrder(Node localNode) {
		if(localNode!=null) {
			postOrder(localNode.leftNode);
			postOrder(localNode.rightNode);
			System.out.print(localNode.value+" ");
			
		}
	}
	public void inOrder(Node localNode) {
		if(localNode!=null) {
			inOrder(localNode.leftNode);
			System.out.print(localNode.value+" ");
			inOrder(localNode.rightNode);
			
			
		}
	}

}
