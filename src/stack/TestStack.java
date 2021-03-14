package stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStack {
	private static Stack<Integer> stak;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		stak = new Stack<Integer>();
	}

	@AfterEach
	void tearDown() throws Exception {
		stak = null;
	}

	@Test
	void testEmpty() {
		assertTrue(stak.isEmpty());
	}
	
	@Test
	void testPush() {		
		stak.push(1);
		
		assertFalse(stak.isEmpty());
		assertEquals(1, stak.size());
	}
	
	@Test
	void testPop() {
		
		stak.push(1);
		
		assertFalse(stak.isEmpty());
		assertEquals(1, stak.size());
		
		stak.pop();
		
		assertTrue(stak.isEmpty());		
	}

}
