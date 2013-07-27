public class LLExample {


    public static LinkedList list = new LinkedList();
    /**
     * @param args
     */
    public static void main(String[] args) {
	Node dummy = new Node();
	LinkedList list1 = new LinkedList(dummy);
	Node l = new Node(6);
	Node x = new Node(1);
	Node y = new Node(5);
	Node z = new Node(3);
	Node b = new Node(4);
	Node e = new Node(8);
	list1.insert(x);
	list1.insert(y);
	list1.insert(z);
	list1.insert(b);
	list1.insert(e);
	list1.printList(x);
	Node swap = new Node();
	swap = list1.replace(3, l); //look for 3 and replace with 6
	System.out.println("list");
	list1.printList(swap);
	//Node n = list1.find(6);
	// Node n = list1.find(6): //0
	/*if (n.getData() == 0){
        System.out.println("that node was not found");
    }else {
        System.out.println("We found the node with a value of" + n.getData());
    }*/
	//System.out.println();
	//    /list1.sum();



    }

}