package mera;

public class DoublyLinkedList {
	
	Node head, tail=head=null;
	private static final String invalidHead="Can not initialize singly linked list with null head",
			invalidAppend="Can not append null node";
	
	DoublyLinkedList(Node head){
		if(head==null){
			throw new IllegalArgumentException(invalidHead);
		}
		
		tail=this.head=head;
	}
	
//	public void append(int data){
//		tail.next=new Node(data);
//		tail=tail.next;
//	}
	
	public void append(Node node){
		if(node==null){
			throw new IllegalArgumentException(invalidAppend);
		}
		
		tail.next=node;
		node.previous=tail;
		node.next=null;
		tail=tail.next;
	}
	
	public void traverse(){
		System.out.println("**Normal**");
		Node tnode=head;
		
		while(tnode!=null){
			System.out.println(tnode.data);
			tnode=tnode.next;
		}
	}
	
	public void traverseBackwards(){
		System.out.println("**Backwards**");
		Node tnode=tail;
		
		while(tnode!=null){
			System.out.println(tnode.data);
			tnode=tnode.previous;
		}
	}
	
	public void move(Node n, Node place){
		n.previous.next=n.next;
		n.next.previous=n.previous;
		
		Node pNext=place.next;
		place.next=n;
		n.previous=place;
		n.next=pNext;
		
		if(pNext!=null){
			pNext.previous=n;
		}else{
			tail=tail.next;
		}
	}

}
