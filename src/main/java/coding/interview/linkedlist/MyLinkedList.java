package coding.interview.linkedlist;

public class MyLinkedList {
	Node node;
	public void insert(int data) {
		if(node == null) {
			node = new Node(data);
		}else {
			Node currentNode = node;
			Node nextNode = node.nextNode;
			while(nextNode != null) {
				currentNode = nextNode;
				nextNode = currentNode.nextNode;
			}
			currentNode.nextNode = new Node(data);
		}
	}
	public int get(int index) {
		if (index == 0 && node!= null){
			return node.data;
		}
		int currentIndex = 1;
		Node nextNode = node.nextNode;
		while (currentIndex < index) {
			nextNode = nextNode.nextNode;
			currentIndex++;
		}
		return nextNode.data;
	}
	public int getMiddleElement() {
		if (node == null){
			return (Integer) null;
		}
		Node slowNode = node;
		Node fastNode = node;
		while (fastNode.nextNode != null) {
			slowNode = slowNode.nextNode;
			fastNode = fastNode.nextNode;
			fastNode = fastNode.nextNode;
		}
		return slowNode.data;
	}
}
class Node{
	int data;
	Node nextNode;
	Node(int data){
		this.data = data;
		nextNode = null;
	}
}
