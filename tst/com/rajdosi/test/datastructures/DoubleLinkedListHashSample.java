package com.rajdosi.test.datastructures;

import com.rajdosi.ds.hashmapdoublylinkedlist.HashOperationOnDoublyLinkedList;

/**
 * @author wazza
 */
public class DoubleLinkedListHashSample {

	/**
	 * This is a test class to test the HashOperations on Doubly Linked lists.
	 * 
	 * @param a
	 */
	public static void main(String a[]) {
		HashOperationOnDoublyLinkedList<Integer> hashDLL = new HashOperationOnDoublyLinkedList<>();
		hashDLL.addElement(2);
		hashDLL.addElement(1);

		System.out
				.println("The remaining nodes in the doubly linked list are :"
						+ hashDLL.searchNextInDoublyLinkedList());

		System.out.println("");
		hashDLL.doublyLinkedList.display();
	}
}
