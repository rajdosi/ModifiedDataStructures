package com.rajdosi.ds.hashmapdoublylinkedlist;

public class DLLNode<E> {
	E element;
	DLLNode<E> next;
	DLLNode<E> previous;

	public DLLNode(E element, DLLNode<E> next, DLLNode<E> previous) {
		this.element = element;
		this.next = next;
		this.previous = previous;
	}
}
