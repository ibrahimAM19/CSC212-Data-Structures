package queue;

public class ArrayQueue<T> implements Queue<T> {
	private int head,tail,maxsize,size;
	private T[] nodes;
	public ArrayQueue(int max) {
		head = tail = size = 0;
		maxsize = max;
		nodes  = (T[]) new Object[max];
	}
	public boolean full () {
		return size == maxsize;
	}
	public int length () {
		return size;
	}
	public void enqueue(T e) {
		nodes[tail] = e;
		tail  = (tail +1 ) % maxsize;
		size++;
	}
	public T serve() {
		T data = nodes[head];
		head = (head +1) & maxsize;
		size--;
		return data;
	}
}
