package queue;

public class LinkedQueue<T> implements Queue<T> {
	private  Node<T> head,tail;
	private int size;
	public LinkedQueue() {
		head = tail = null;
		size = 0;
	}
	public boolean full() {
		return false;
	}
	public int length (){
		return size;
	}
	public void enqueue(T val) {
		Node<T> newNode = new Node<>(val);
		if (head ==null)
			head= tail = newNode;
		else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	public T serve() {
		T val = head.data;
		head= head.next;
		size--;
		if(size == 0) tail =null;
		return val;
	}
	
}
