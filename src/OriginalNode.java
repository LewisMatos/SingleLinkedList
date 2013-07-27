
public class OriginalNode {

    private int data;
    private Node next;

    public OriginalNode(int d, Node n){
	data = d;
	next = n;

    }
    public OriginalNode(int d){
	data = d;
    }

    public OriginalNode(){}

    public int getData() {return data;}

    public Node getNext() {return next;}

    public void setNext(Node n){ next = n;}

}
