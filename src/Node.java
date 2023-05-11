
public class Node {
	
	//Create private variables element: Object & 	next: Node
	
	private Object element;
	private Node next;
	
	//Create Public Class Node with arguments element and next
	public Node (Object element, Node next) {
		this.element = element;
		this.next = next;
	}
	
	//Create Public Class getElement,  type Object
	public Object getElement() {
		return element;
		}
	
	//Create public class getNext, type Node
	public Node getNext() {
		return next;
	}
	
	//Create public class setElement arguments  Object element, type void
	public void setElement(Object element) {
		this.element = element;
	}
	
	//Create public class setNext argument Node next, type void
	public void setNext (Node next) {
		this.next = next;
	}

}
