import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BlockTheSquareTest {
	
	@Test
	public void blockPlayerTest1() {
		assertEquals(BlockTheSquare.blockPlayer(0, 3), 6);
	}
	
	@Test
	public void blockPlayerTest2() {
		assertEquals(BlockTheSquare.blockPlayer(0, 4), 8);
	}
	
	@Test
	public void blockPlayerTest3() {
		assertEquals(BlockTheSquare.blockPlayer(3, 5), 4);
	}
	
}
