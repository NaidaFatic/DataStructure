package queue;

import java.util.Iterator;

public class Queue<T> implements Iterable<T>{
	private Node<T> first;
	private Node<T> last;
	private int size = 0;
	
	public void enqueue(T data) {
		Node<T> newNode = new Node<T>();
		newNode.data = data;
		
		if(size == 0) {
			first = newNode;
			last = first;
		}
		else {
			last.next = newNode;
			last = newNode;
		}
		
		size++;		
	}
	
	public void dequeue() {
		Node<T> current = new Node<T>();
		
		current = first;
		first = first.next;
		current.next = null;
		
		size--;
		
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	

	@Override
	public Iterator<T> iterator() {
		return new QueueIterator();
	}
	
	private class QueueIterator implements Iterator<T> {
		private Node<T> current = first;

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public T next() {
			T data = current.data;
			current = current.next;
			return data;
		}
		
	}
	
	
 }
