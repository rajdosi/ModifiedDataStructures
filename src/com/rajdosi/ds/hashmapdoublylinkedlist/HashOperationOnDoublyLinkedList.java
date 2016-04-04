package com.rajdosi.ds.hashmapdoublylinkedlist;

import java.util.HashMap;

import com.rajdosi.ds.hashmapdoublylinkedlist.DoublyLinkedList.Node;

public class HashOperationOnDoublyLinkedList {

	public static void checkDoubleLinkedList() {
		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();		
		Node node1 = doublyLinkedList.addNode(2);
		Node node2 = doublyLinkedList.addNode(4);
		Node node3 = doublyLinkedList.addNode(3);
		doublyLinkedList.display();
		doublyLinkedList.deleteNode(node3);
		doublyLinkedList.deleteNode(node1);
		doublyLinkedList.deleteNode(node2);
		System.out.println("The doubly linked list after removal:\n");
		doublyLinkedList.display();
	}
	
	public static void main(String a[]){
		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
		HashMap< Integer , Node > doublyLinkedListMap = new HashMap<>();
		
		for (int i = 0; i < 100; i++) {
			Node node =doublyLinkedList.addNode(i);
			doublyLinkedListMap.put(i, node);
		}
		
		for (int i=0; i < 100; i++){
			System.out.println(doublyLinkedListMap.get(i).element);
		}
		
	}
	
}
