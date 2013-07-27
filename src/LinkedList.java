public class LinkedList {

    private Node head;

    public LinkedList(){

    }
    public LinkedList(Node n){
	head = n;
    }
    public LinkedList(int x){
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
	if (n.getData() < current.getData()) { // case 1: new node becomes head
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
    public Node replace(int x, Node y){  //Lewis Matos replace Method
	Node swp1 = new Node();
	Node current = head;
	while(current.getNext() != null){
	    if(current.getData()==x){//x is 3
		System.out.println("x is " + current.getData());
		swp1 = current.getNext();
		current = y;
		head.getNext().setNext(current);//6
		current.setNext(swp1);
		return head;
	    }
	    current = current.getNext();
	}//end of loop
	return current;
    }
    public int sum(){
	Node current = head;
	int sum = 0;
	while(current != null)
	{
	    sum+=current.getData();
	    current = current.getNext();
	}
	System.out.println("Sum :: " + sum);

	return sum;




    }

    public void printList(Node p ) {
	if (p != null) {
	    System.out.println(p.getData());
	    printList( p.getNext() );
	}
    }
}



