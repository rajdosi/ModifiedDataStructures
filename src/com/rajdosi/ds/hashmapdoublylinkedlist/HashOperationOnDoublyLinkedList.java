package com.rajdosi.ds.hashmapdoublylinkedlist;

import java.util.HashMap;

import com.rajdosi.ds.hashmapdoublylinkedlist.DoublyLinkedList.Node;

public class HashOperationOnDoublyLinkedList<E> {

	public DoublyLinkedList<E> doublyLinkedList = new DoublyLinkedList<>();
	public HashMap<E, Node> doublyLinkedListMap = new HashMap<>();

	/**
	 * This method adds an element into Doubly Linked List and Hash Map created
	 * 
	 * @param element
	 */
	public void addElement(E element) {
		Node node = doublyLinkedList.addNode(element);
		doublyLinkedListMap.put(element, node);
	}

	/**
	 * This method removes an element from Doubly Linked List and the Hash Map
	 * created
	 * 
	 * @param element
	 */
	public void retrieveElement(E element) {
		System.out.println("The node to be deleted is:"
				+ doublyLinkedListMap.get(element).element);
		doublyLinkedList.deleteNode(doublyLinkedListMap.get(element));
		doublyLinkedListMap.remove(element);
	}

	/**
	 * This method only returns the next head node of the Doubly Linked List
	 * that can be removed directly using delete Element
	 * 
	 * @return
	 */
	public Node searchNextInDoublyLinkedList() {
		if (!doublyLinkedList.isEmpty()) {
			Node node = doublyLinkedList.getHead();
			retrieveElement(doublyLinkedList.getHead().element);
			return node;
		} else
			return null;
	}
}
