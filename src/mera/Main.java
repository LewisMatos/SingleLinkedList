package mera;

public class Main{
	public static void main(String[] args) {
		
		Node zero=new Node(0);
		Node one=new Node(1);

		DoublyLinkedList dll = new DoublyLinkedList(one);
		
//		dll.append(one);
		for(int i=2; i<10; i++){
			dll.append(new Node(i));
		}
		dll.append(zero);

		dll.traverse();

		dll.move(zero, one);
		dll.traverse();
		dll.traverseBackwards();
	}

}
