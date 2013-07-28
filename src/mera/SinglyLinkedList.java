package mera;

public class SinglyLinkedList{
	Node head, tail=head=null;
	private static final String invalidHead="Can not initialize singly linked list with null head",
			invalidAppend="Can not append null node";
	
	SinglyLinkedList(Node head){
		if(head==null){
			throw new IllegalArgumentException(invalidHead);
		}
		
		tail=this.head=head;
	}
	
	public void append(int data){
		tail.next=new Node(data);
		tail=tail.next;
	}
	
	public void append(Node node){
		if(node==null){
			throw new IllegalArgumentException(invalidAppend);
		}
		
		tail.next=node;
		tail=tail.next;
	}
	
	public boolean replace(int what, int with){
		// check if it's the head we need to replace
		if(head.data==what){
			Node n=new Node(with);
			n.next=head.next;
			head=n;
			
			return true;
		}
		
		Node tnode=head;
		while(tnode.next!=null){
			if(tnode.next.data==what){
				// we've found what we're looking for
				Node n=new Node(with);
				n.next=tnode.next.next;
				tnode.next=n;
				
				return true;
			}
			
			// check the next node;
			tnode=tnode.next;
		}
		
		// we didn't find what we we're looking for
		return false;
	}
	
	public void traverse(){
		Node tnode=head;
		
		while(tnode!=null){
			System.out.println(tnode.data);
			tnode=tnode.next;
		}
	}
	
	public int sum(){
		Node tnode=head;
		
		int sum=0;
		while(tnode!=null){
			sum+=tnode.data;
			tnode=tnode.next;
		}
		
		return sum;
	}
}
