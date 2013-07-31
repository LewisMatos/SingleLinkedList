public class LLExample {

	public static LinkedList list = new LinkedList();
	static LinkedList list1;

	public static void main(String[] args) {
		Node dummy = new Node();
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);

		list1 = new LinkedList(dummy);
		list1.insert(a);
		list1.insert(b);
		list1.insert(c);
		list1.insert(d);
		list1.insert(e);
		list1.insert(f);
		System.out.println("list Orignal");
		list1.printList(dummy); // Print the list dummy node is the head

		Node swap = new Node();
		list1.replace(6, 7); // look for 3 and replace with 6
		System.out.println("list replaced");
		list1.printList(dummy); // Print out swapped list

		list1.sum(); // Add up the nodes

	}

}