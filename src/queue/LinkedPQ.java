package queue;

public class LinkedPQ<T>{
	private PQNode<T> head;
	private int size;
	
	LinkedPQ(){
		head = null;
		size = 0;
	}
	public int length (){
		return size;
	}
	public boolean full () {
		return false;
	}
	public  void enqueue(T e,int p) {
		PQNode<T> newNode = new PQNode<T>(e,p);
		if (size == 0 || p > head.priority) {
			newNode.next = head;
			head = newNode;
		}
		else {
			PQNode<T> cur = head;
			PQNode<T> pre = null;
			while(cur != null && cur.priority >= p) {
				pre = cur;
				cur = cur.next;	
			}
			newNode.next = cur;
			pre.next = newNode;
		}
		size++;
	}
	
	public PQElement<T> serve(){
		T data = head.data;
		int pty = head.priority;
		head= head.next;
		size--;
		return new PQElement<T>(data, pty);
	}
}
class PQElement<T>{
	public T data;
	public int p;
	
	public PQElement(T e, int pr){
	data=e;
	p=pr;
	}
}