import java.util.LinkedList;

public class SLL {
	
	
	
	//create private variable
	private Node head;
	
	//create the constructor
	public SLL() {
		head = null; //head begins as null value
	}
	
	//create method getHead(), type Node
	public Node getHead() {
		
		return head;
	}
	
	//create method setHead, argument Node head, type void
	public void setHead(Node head) {
		this.head = head;
	}
	
	
	//create method print, type void
	public void print() {
		//create Node object
		Node node = head;
		
		//if node is null, print empty
		if (node == null) {
			System.out.println("empty...No values in linked list, please add");
		}//else print the node
			while (node!= null) {
				System.out.println(node.getElement() + " ");
				node = node.getNext();
			}
			System.out.println();
		
	}
	
	//create method add, argument Node n, type void
	public void add(Node n) {
		if (head == null) {
			head = n; //if nothing, head is n
		}else {
			//create a new Node object, put its value to head
			Node node = head;
			//if node has a next, then get next and set it
			while (node.getNext() != null) {
				node = node.getNext();
			}
			node.setNext(n);
		}
	}
	
	//create method remove, type void
	public void remove() {
		
		//first check if head is null,return nothing
		if (head == null) {
			return;
		}
		//check if get next is null,  head as null
		else if (head.getNext() == null) {
			 head = null;
		}
		//if create  node for if get next is not null, the remove
		Node node = head;
		if (node.getNext()!= null) {
			node= node.getNext(); //here we get the next value, then we set that to null 
		}
			node.setNext(null);
	}
	
	//create method reverse, type void
	public void reverse() {
		
		//first create current node
		//then create a previous node
		//then an incrementer node
		//finally set head to what previous was 
		
		Node currentNode =head; //start with value of head
		Node previousNode = null; //we start with a null
		Node next; // this will be used for increment;
		
		//prints if nothing to reverse
		if (currentNode == null) {
			System.out.println("Nothing to print");
		}
		
		while (currentNode != null) {
			
			//increment
			next = currentNode.getNext();
			//put previous node as current node
			currentNode.setNext(previousNode);
			previousNode = currentNode;
			
			//now create the new head
			currentNode = next;
			
		}
		
		head = previousNode;
	}
	
	public boolean find (Node search) { //can we talk about this? It is finding b, but not the other element
		if (head == null) {
			return false;
		}
		Node current = head;
		while (current != null) {
			if (current.getNext() == search) {
				return true;
			}
			current = current.getNext();
		}
		//current.setNext(search);
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create 3 nodes a through c, 1 through 3
		Node a = new Node (1,null);
		Node b = new Node (2,null);
		Node c = new Node (3,null);
		
		//Create the SingleLinkList s
		SLL s = new SLL();
		
		s.print();
		s.add(a);
		s.add(b);
		s.add(c);
		s.print();
		
		System.out.println("Now reverse");
		s.reverse();
		s.print();
		
		System.out.println("Now remove, should now be 3 2, versus 3 2 1");
		s.remove();
		s.print();	   
		
		System.out.println("Now for the find method");
		if (s.find(a)) {
			System.out.println("Element a was found"); //why isn't A being found?
		}  
		if (s.find(b)){
			System.out.println("Element b was found");
		}
		if (s.find(c)) {
			System.out.println("Element c was found");
		}
		

	

	}

}
