package mera;

public class Main {
	public static void main(String[] args) {
		
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);		
		Node nine = new Node(9);

		DoublyLinkedList dll = new DoublyLinkedList(one);
		dll.append(two);
		dll.append(three);
		dll.append(nine);

		dll.move(three, nine);
		dll.traverse();
		dll.traverseBackwards();

	}

}
