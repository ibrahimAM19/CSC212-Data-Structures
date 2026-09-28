package List;



public class LinkedList<T> implements List<T> {
	Node<T> head;
	Node<T> current;
	public LinkedList() {
		head = current = null;
	}
	
	public boolean empty() {
		return head ==null;
	}
	public boolean last() {
		return current.next == null;
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
	
	public T retrieve() {
		return current.data;
	}
	
	public void update(T val) {
		current.data = val;
	}
	
	public void insert(T val) {
		Node<T> newNode = new Node<T>(val);
		if (empty()) {
			head = current = newNode;
		}
		else {
			Node<T> tmp = current.next;
			current.next = newNode;
			current = current.next;
			current.next = tmp;
		}
	}
	
	public void remove() {
		if (current == head) {
			head = head.next;
		}
		Node<T> previous = head;
		
		while (previous.next != current) {
			previous = previous.next;
		}
		previous.next = current.next;
		
		
		if (current.next == null) {
			current = head;
		}
		else {
			current = current.next;
		}
			
		}
	
	public void print() {
		findFirst();
		while (!last()) {
			System.out.println(current.data);
			current = current.next;
		}
		System.out.println(current.data);
	}
	public void rev() {
		Node<T> prev = null,cur  =head,next = null;
		if ( head == null || head.next == null) {
			return;
		}
		while( cur != null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		head = prev;
		
	}
public void removeBetween(T e1,T e2) {
		
	}
	public static void main(String[] args) {
		LinkedList<Double> l =new LinkedList<Double>();
		l.insert(5.5);l.insert(2.3);l.insert(10.2);
		l.rev();
		l.print();
	}
	
}
class x{
	public static <T>void circularShitfLift(List <T> l,int n){
		for (int i =0; i< n;i++) {
			l.findFirst();
			T tmp = l.retrieve();
			l.remove();
			while( ! l.last()) {
				l.findNext();
			}
		l.insert(tmp);
		}
		
	}
	
}
