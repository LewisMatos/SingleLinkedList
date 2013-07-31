public class LinkedList {

	private Node head;
	private final Node tail = head = null;

	public LinkedList() {

	}

	public LinkedList(Node n) {
		head = n;
	}

	public LinkedList(int x) {
		head = new Node(x);
	}

	public void append(Node n) {
		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();

		}// while
		current.setNext(n);
	}// append

	public void insert(Node n) {
		Node current = head;
		boolean flag = false;
		if (n.getData() < current.getData()) { // case 1: new node becomes head
			n.setNext(head);
			head = n;
		}/* if */else {
			while (current.getNext() != null && !flag) {
				if (n.getData() <= current.getNext().getData()) { // case2:
					// insert mode
					// in the
					// middle
					n.setNext(current.getNext()); // Set Fat to point to hat
					current.setNext(n); // Test what would happen if you change
					// current.setNext(n) with
					// n.setNext(current.getNext())
					flag = true;
				}// if(n.getData()<=
				else {
					current = current.getNext();
				}// if/else (n<current.getNext())
			}// while(current.getNext()!=null)
			if (!flag) { // case 3: new node gets appended
				current.setNext(n);
			}
		}// if/else
	}// insert(Node n)

	public Node find(int x) {
		Node current = head;
		if (current.getData() == x) {
			return current;
		} else {
			while (current.getNext() != null) {
				current = current.getNext();
				if (current.getData() == x) {
					return current;
				}// if
			}// while
		}// if/else
		return new Node(); // red flag
	}// Method find

	public void delete(int x) {
		Node current = head;
		Node previous;
		if (current.getData() == x) { // Case 1: delete the head
			head = head.getNext();
		} else {
			while (current.getNext() != null) {
				previous = current;
				current = current.getNext();
				if (current.getData() == x) { // Case 2: delete the middle or
					// end
					previous.setNext(current.getNext()); // skipping over the
					// node
				} // if

			}// while
				// System.out.println("Nothing to print");
		}// if/else

	}

	public boolean replace(int x, int y) { // Lewis Matos replace

		if (head.getData() == x) {
			Node n = new Node(y);
			n.setNext(head.getNext());
			head = n;
			// System.out.println("x is " + x);
			return true;
		}
		Node tNode = head;
		while (tNode.getNext() != null) {
			if (tNode.getNext().getData() == x) {
				Node n = new Node(y);
				n.setNext(tNode.getNext().getNext());
				tNode.setNext(n);
				// System.out.println("x is " + x);
				return true;

			}
			tNode = tNode.getNext();
		}

		return false;

	}

	public int sum() { // Lewis Sum
		Node current = head;
		int sum = 0;
		while (current != null) {
			sum += current.getData();
			current = current.getNext();
		}
		System.out.println("Sum :: " + sum);

		return sum;

	}

	public void printList(Node p) { // Lewis Print
		if (p != null) {
			System.out.println(p.getData());
			printList(p.getNext());
		}
	}
}
