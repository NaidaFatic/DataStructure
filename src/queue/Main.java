package queue;

public class Main {

	public static void main(String[] args) {
		Queue<Integer> q = new Queue<Integer>();
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		for (Integer i : q) {
			System.out.println(i);
		}
		
		System.out.print(q.size());
		
	}

}
