package queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {
	private static Queue<Integer> q;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		q = new Queue<Integer>();
	}

	@AfterEach
	void tearDown() throws Exception {
		q = null;
	}

	@Test
	void testIsEmpty() {
		assertTrue(q.isEmpty());
	}
	
	@Test
	void testEnqueue() {
		q.enqueue(1);
		
		assertFalse(q.isEmpty());
		assertEquals(1, q.size());
		
		q.enqueue(2);
		assertEquals(2, q.size());
	}
	
	@Test
	void testDequeue() {
		q.enqueue(1);
		q.dequeue();
		
		assertTrue(q.isEmpty());
		assertEquals(0, q.size());
		
	}

}
