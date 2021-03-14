package doubly_linked_list;

import java.util.Iterator;

public class DoublyList<T> implements Iterable<T>{
	
	Node<T> head;
	Node<T> tail;
	int size = 0;
	
	public void addToFront(T data) {
		
		Node<T> newNode = new Node<T>();
		newNode.data = data;
		
		if(size != 0) {
			Node<T> current = head;
			
			newNode.next = current;
			current.prev = newNode;
			
			head = newNode;
		}	
		else {
			head = newNode;
			
			tail = head;
		}
		
		size++;		
	}
	
	public void addToRear(T data) {
		
		Node<T> newNode = new Node<T>();
		newNode.data = data;
		
		if(size != 0) {
			Node<T> current = tail;
			
			current.next = newNode;
			newNode.prev = current;
			
			tail = newNode;
		}
		else {
			tail = newNode;	
			head = tail;
		}
				
		size++;		
	}
	
	
	public void removeFromFront() throws Exception {
		
		if(isEmpty())
			throw new Exception("It is empty!");
		
		Node<T> current = head;
		
		head = current.next;
		current.next = null;
		
		if(size != 1)
			head.prev = null;
		
		size--;				
	}
	
	public void removeFromRear() throws Exception {
		
		if(isEmpty())
			throw new Exception("It is empty!");
		
		if(size == 1) {
			
			tail = null;
			head = tail;
		}		
		else {
			
			tail = tail.prev;
			tail.next = null;
		}
		
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
		return new ListIterator();
	}
	
	
	@SuppressWarnings("hiding")
	private class ListIterator<T> implements Iterator<T>{
			
		@SuppressWarnings("unchecked")
		private Node<T> current = (Node<T>) head;
		
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
