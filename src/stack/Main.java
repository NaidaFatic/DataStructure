package stack;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> stak = new Stack<Integer>();
		
		stak.push(1);
		stak.push(2);
		stak.push(2);
		stak.push(2);
		stak.push(2);
		
		stak.pop();
		stak.pop();
		stak.pop();
		
		
		for( Integer i : stak)
			System.out.print(i);
		

	}

}
