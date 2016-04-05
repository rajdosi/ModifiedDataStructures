package com.rajdosi.ds.hashmapdoublylinkedlist;

import java.util.NoSuchElementException;

public class DoublyLinkedList<E> {

	private DLLNode<E> head;
	private DLLNode<E> tail;
	private int size;

	public DoublyLinkedList() {
		size = 0;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	/**
	 * This method returns the first element of the doubly linked list created
	 * 
	 * @return Node
	 */
	public DLLNode<E> getHead() {
		return head;
	}
	
	/**
	 * According to the use case node will be only entered at the end of the
	 * doubly linked list.
	 * 
	 * @param element
	 * @return Node
	 */
	public DLLNode<E> addNode(E element) {
		DLLNode<E> tmp = new DLLNode<E>(element, null, tail);
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
	public void deleteNode(DLLNode<E> node) {

		if (isEmpty()) {
			throw new NoSuchElementException();
		}

		if (node == head && node == tail) {
			head = tail = null;
		} else if (node == head) {
			head = head.next;
			head.previous = null;
		} else if (node == tail) {
			tail = tail.previous;
			tail.next = null;
		} else {
			DLLNode<E> nextNode = node.next;
			DLLNode<E> prevNode = node.previous;

			prevNode.next = nextNode;
			nextNode.previous = prevNode;
		}

	}

	/**
	 * This function will display all the nodes in the Doubly Linked List
	 * created so far.
	 */
	public void display() {
		System.out.println("The nodes in Doubly Linked List are:");
		for (DLLNode<E> tempNode = head; tempNode != null; tempNode = tempNode.next) {
			System.out.println(tempNode.element);
		}
	}
}
