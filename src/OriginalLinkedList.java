
public class OriginalLinkedList {

    private Node head;

    public OriginalLinkedList(){

    }
    public OriginalLinkedList(Node n){
	head = n;
    }
    public OriginalLinkedList(int x){
	head = new Node(x);
    }

    public void append(Node n){
	Node current = head;
	while(current.getNext()!=null){
	    current = current.getNext();

	}//while
	current.setNext(n);
    }// append
    public void insert(Node n){
	Node current = head;
	boolean flag = false;
	if (n.getData()<current.getData()) { // case 1: new node becomes head
	    n.setNext(head);
	    head = n;
	}/*if*/ else{
	    while(current.getNext()!=null && !flag){
		if(n.getData()<= current.getNext().getData()){ // case2: insert mode in the middle
		    n.setNext(current.getNext()); //Set Fat to point to hat
		    current.setNext(n); // Test what would happen if you change current.setNext(n) with n.setNext(current.getNext())
		    flag = true;
		}//if(n.getData()<=
		else{
		    current = current.getNext();
		}//if/else (n<current.getNext())
	    }//while(current.getNext()!=null)
	    if(!flag){ //case 3: new node gets appended
		current.setNext(n);
	    }
	}//if/else
    }//insert(Node n)
    public Node find(int x){
	Node current = head;
	if (current.getData()==x){
	    return current;
	}else{
	    while (current.getNext()!=null){
		current = current.getNext();
		if (current.getData()==x){
		    return current;
		}//if
	    }//while
	}//if/else
	return new Node(); //red flag
    }//Method find
    public void delete(int x){
	Node current = head;
	Node previous;
	if(current.getData()==x){ //Case 1: delete the head
	    head = head.getNext();
	}else {
	    while(current.getNext()!=null){
		previous = current;
		current = current.getNext();
		if(current.getData()==x){ //Case 2: delete the middle or end
		    previous.setNext(current.getNext()); //skipping over the node
		} //if

	    }//while
	    System.out.println("Nothing to print");
	}//if/else
	//replace method
	//step 1 create the pointer, change previous pointer,

	//circular linked list

    }// method delete
}


