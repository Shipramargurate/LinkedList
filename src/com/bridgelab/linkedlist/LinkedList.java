package com.bridgelab.linkedlist;

//creating a simple Linked List of 56, 30 and 70

public class LinkedList {

	Node head = null;

	public void createLinkedList() {
		Node firstNode = new Node(56);
		Node secondNode = new Node(30);
		Node thirdNode = new Node(70);
		head = firstNode;
		firstNode.next = secondNode;
		secondNode.next = thirdNode;
		thirdNode.next = null;
	}

	public void displayLinkedList() {
		if (head == null)
			System.out.println("Linked list is empty!");
		else {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + " -> ");
				current = current.next;
			}

		}
	}

}
