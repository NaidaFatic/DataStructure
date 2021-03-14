package doubly_linked_list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DoublyTest {
	private static DoublyList<Integer> list;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		list = new DoublyList<Integer>();
	}

	@AfterEach
	void tearDown() throws Exception {
		list = null;
	}

	@Test
	void testAdd() {
		
		list.addToFront(1);		
		assertEquals(1, list.size());
		
		list.addToRear(2);
		assertEquals(2, list.size());
		
	}
	
	@Test
	void testRemove() throws Exception {
		list.addToFront(1);		
		assertEquals(1, list.size());
		
		list.removeFromFront();
		assertEquals(0, list.size());
		
		list.addToRear(2);
		assertEquals(1, list.size());
		
		list.removeFromRear();
		assertEquals(0, list.size());
	}
	
	@Test
	void testSize() {				
		assertEquals(0, list.size());
		assertTrue(list.isEmpty());
		
	}

}
