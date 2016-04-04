package com.rajdosi.ds.hashmapdoublylinkedlist;

import java.util.NoSuchElementException;

public class DoublyLinkedList<E> {

	private Node head;
	private Node tail;
	private int size;

	public DoublyLinkedList() {
		size = 0;
	}

	public class Node {
		E element;
		Node next;
		Node previous;

		public Node(E element, Node next, Node previous) {
			this.element = element;
			this.next = next;
			this.previous = previous;
		}
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	/**
	 * According to the use case node will be only entered at the end of the
	 * doubly linked list.
	 * 
	 * @param element
	 */
	public Node addNode(E element) {
		Node tmp = new Node(element, null, tail);
		if (tail != null) {
			tail.next = tmp;
		}
		tail = tmp;
		if (head == null) {
			head = tmp;
		}
		size++;
		return tmp;
	}

	/**
	 * This function will delete the node with the address/reference provided.
	 * 
	 * @param node
	 */
	public void deleteNode(Node node) {

		if (isEmpty()){
			throw new NoSuchElementException();
		}
		
		if (node == head && node == tail) {
			head = tail = null;
		}
		else if (node == head) {
			head = head.next; 
			head.previous = null;
		}
		else if (node == tail) {
			tail = tail.previous;
			tail.next = null;
		}
		else {
			Node nextNode = node.next;
			Node prevNode = node.previous;
			
			prevNode.next = nextNode;
			nextNode.previous = prevNode;
		}
		
	}

	/**
	 * This function will display all the nodes in the Doubly Linked List
	 * created so far.
	 */
	public void display() {

		for (Node tempNode = head; tempNode != null; tempNode = tempNode.next) {
			System.out.println(tempNode.element);
		}
	}
}
