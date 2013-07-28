package mera;

public class Node{
	int data;
	Node next=null;
	
	Node(int data){
		this.data=data;
	}
	
	void setData(int data){
		this.data=data;
	}
	
	int getData(){
		return data;
	}
	
	void setNext(Node next){
		this.next=next;
	}
}
