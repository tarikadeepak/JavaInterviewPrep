package coding.interview.binarytree;

public class MyBinaryTree {
	Node root;
	void insert(int data) {
		if(root == null) {
			root = new Node(data);
		}else {
			boolean nodeCreated = false;
			Node currentNode = root;
			while(nodeCreated == false) {
				if(currentNode.data > data) {
					if(currentNode.left ==null) {
						currentNode.left = new Node(data);
						nodeCreated = true;
						System.out.println("Created left node");
					}
					currentNode = currentNode.left;
				}else {
					if(currentNode.right ==null) {
						currentNode.right = new Node(data);
						nodeCreated = true;						
						System.out.println("Created right node");
					}
					currentNode = currentNode.right;
				}
			}
		}
	}
	void preOrderTraversal() {
		preOrderTraversal(root);
	}
	void preOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		System.out.println(root.data);
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	
	void postOrderTraversal() {
		postOrderTraversal(root);
	}
	
	void postOrderTraversal(Node node) {
		if(node == null) {
			return;
		}
		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.println(node.data);
	}
	
	void inOrderTraversal() {
		inOrderTraversal(root);
	}
	
	void inOrderTraversal(Node node) {
		if(node == null) {
			return;
		}
		postOrderTraversal(node.left);
		System.out.println(node.data);
		postOrderTraversal(node.right);
	}
}

class Node{
	Node left;
	Node right;
	int data;
	Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
