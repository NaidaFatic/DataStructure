package doubly_linked_list;

public class Main {

	public static void main(String[] args) throws Exception {
		
		DoublyList<Integer> list = new DoublyList<Integer>();
		
		list.addToRear(3);
		list.addToFront(1);
		list.addToFront(2);
		
		
		for(Integer i : list) {
			System.out.println(i);
		}
		

	}

}
