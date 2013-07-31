package mera;

public class DoublyLinkedList {

	Node head, tail = head = null;
	private static final String invalidHead = "Can not initialize singly linked list with null head",
			invalidAppend = "Can not append null node";

	DoublyLinkedList(Node head) {
		if (head == null) {
			throw new IllegalArgumentException(invalidHead);
		}

		tail = this.head = head;
	}

	public void append(Node node) {
		if (node == null) {
			throw new IllegalArgumentException(invalidAppend);
		}

		tail.next = node;
		node.previous = tail;
		node.next = null;
		tail = tail.next;
	}

	public void traverse() {
		Node tnode = head;

		while (tnode != null) {
			System.out.println(tnode.data);
			tnode = tnode.next;
		}
	}

	public void traverseBackwards() {
		Node tnode = tail;

		while (tnode != null) {
			System.out.println(tnode.data);
			tnode = tnode.previous;
		}
	}

	public void move(Node n, Node where) {
		remove(n);
		insert(n, where);
	}

	public Node remove(Node n) {
		if (n == head) { // moving the first node
			head = head.next;
			head.previous = null;
		} else if (n == tail) { // moving the last node
			tail = tail.previous;
			tail.next = null;
		} else { // moving some node in the middle
			n.previous.next = n.next; // n.getPrevious().setNext(n.getNext());
			n.next.previous = n.previous; // n.getNext().setPrevious(n.getPrevious());
		}

		n.next = null;
		n.previous = null;

		return n;
	}

	/**
	 * Inserts a Node, node, in front of another, where.
	 * 
	 * @param node
	 *            The node to be inserted
	 * @param where
	 *            The node in front of which 'node' will be inserted.
	 */
	public void insert(Node node, Node where) {
		if (where == null) {
			return;
		}

		Node tmpNext = where.next;
		where.next = node;
		node.previous = where;
		node.next = tmpNext;

		if (tmpNext != null) {
			tmpNext.previous = node;
		} else {
			node.next=null;
			tail = node;
		}
	}
}
