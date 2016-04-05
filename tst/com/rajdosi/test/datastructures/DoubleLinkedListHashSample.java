package com.rajdosi.test.datastructures;

import com.rajdosi.ds.hashmapdoublylinkedlist.HashOperationOnDoublyLinkedList;

public class DoubleLinkedListHashSample {

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
