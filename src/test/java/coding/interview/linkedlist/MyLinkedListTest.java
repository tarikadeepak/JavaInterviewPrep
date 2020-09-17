package coding.interview.linkedlist;

import org.junit.Test;

public class MyLinkedListTest {
	@Test
	public void Test() {
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.insert(0);
		myLinkedList.insert(1);
		myLinkedList.insert(2);
		myLinkedList.insert(3);
		myLinkedList.insert(4);
		System.out.println(myLinkedList.get(0));
		System.out.println(myLinkedList.get(2));
		System.out.println(myLinkedList.get(1));
		System.out.println(myLinkedList.get(3));
		System.out.println(myLinkedList.getMiddleElement());		
	}

}
