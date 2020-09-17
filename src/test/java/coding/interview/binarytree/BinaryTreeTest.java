package coding.interview.binarytree;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void test() {
		MyBinaryTree  myBinaryTree = new MyBinaryTree();
		myBinaryTree.insert(10);
		myBinaryTree.insert(5);
		myBinaryTree.insert(15);
		myBinaryTree.insert(6);
		myBinaryTree.insert(14);
		myBinaryTree.preOrderTraversal();
		System.out.println("--------");
		myBinaryTree.postOrderTraversal();
	}
}
