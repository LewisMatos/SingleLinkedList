package mera;

public class Main {
	public static void main(String[] args){
		
		// play around with it here
		SinglyLinkedList sll=new SinglyLinkedList(new Node(-1));
		
		sll.append(2);
		sll.append(3);
		sll.append(4);
		
		System.out.println(sll.replace(-1, -3));
		
		sll.traverse();
		
		System.out.println(sll.sum());
	}

}