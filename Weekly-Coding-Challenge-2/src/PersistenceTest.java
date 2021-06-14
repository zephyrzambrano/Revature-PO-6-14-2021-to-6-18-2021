import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersistenceTest {
	
	@Test
	public void additivePersistenceTest1() {
		assertEquals(Persistence.additivePersistence(1679583), 3);
	}
	
	@Test
	public void additivePersistenceTest2() {
		assertEquals(Persistence.additivePersistence(123456), 2);
	}
	
	@Test
	public void additivePersistenceTest3() {
		assertEquals(Persistence.additivePersistence(6), 0);
	}
	
	@Test
	public void multiplicativePersistenceTest1() {
		assertEquals(Persistence.multiplicativePersistence(77), 4);
	}
	
	@Test
	public void multiplicativePersistenceTest2() {
		assertEquals(Persistence.multiplicativePersistence(123456), 2);
	}
	
	@Test
	public void multiplicativePersistenceTest3() {
		assertEquals(Persistence.multiplicativePersistence(4), 0);
	}
	
}
