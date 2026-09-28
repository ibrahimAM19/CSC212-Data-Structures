package List;
class Node<T>{
	public T data;
	public Node<T> next;
	public Node<T> previous;
	public Node () {
	data = null;
	next = null;
	previous = null;
	}
	public Node (T val) {
	data = val;
	next = null;
	previous= null;
	}
}
public class DoubleLinkedList<T> {
	Node<T> head;
	Node<T> current;
	public DoubleLinkedList() {
	head = current = null;
	}
	
	public boolean empty() {
		return head == null;
	}
	
	public boolean last() {
		return current.next == null;
	}
	
	public boolean first() {
		return current.previous == null;
	}
	public boolean full() {
		return false;
	}
	
	public void findFirst() {
		current = head;
	}
	
	public void findNext() {
		current = current.next;
	}
	
	public void findPrevious() {
		current = current.previous;
	}
	
	public T retrieve() {
		return current.data;
	}
	
	public void update(T val) {
		current.data = val;
	}
	public void insert(T val) {
		Node<T>  newNode = new Node<>(val);
		if(empty()) {
			head = newNode;
		}
		else {
			newNode.previous = current;
			newNode.next = current.next;
			if( current.next != null) {
				current.next.previous = newNode;
			}
			current.next = newNode;
			current = newNode;
		}
		
	}
	public void remove() {
		if (current == head) {
			head = head.next;
			if (head != null) {
				head.previous = null;
			}
		}
		else {
			current.previous.next = current.next;
			if ( current.next != null) {
				current.next.previous = current.previous;
			}
			
		}
		if(current.next == null)
			current =head;
		else
			current = current.next;
		
	}
}
