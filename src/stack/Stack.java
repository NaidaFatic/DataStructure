package stack;

import java.util.Iterator;

public class Stack<T> implements Iterable<T>{
	
	@SuppressWarnings("unchecked")
	private T[] stack = (T[]) new Object[1];	
	private int size = 0;
	
	public void resize(int length) {
		@SuppressWarnings("unchecked")
		T[] copy = (T[]) new Object[length];
		for(int i = 0; i < size; i++) {
			copy[i] = stack[i];
		}
				
		stack = copy;
 	}
	
	public void push(T data) {
		if(size == stack.length)
			resize(2 * stack.length);
		
		stack[size++] = data;
	}
	
	public void pop() {
		size --;
		if(size>0 && size == stack.length/4)
			resize(stack.length/2);
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
			
	

	@Override
	public Iterator<T> iterator() {
		return new StackIterator();
	}
	
	private class StackIterator implements Iterator<T>{
		private int i = 0;
		
		@Override
		public boolean hasNext() {
			return i != size;
		}

		@Override
		public T next() {
			T data = stack[i];
			i++;
			return data;
		}
		
	}
	
	

}
