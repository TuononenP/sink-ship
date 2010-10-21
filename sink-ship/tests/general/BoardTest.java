package general;

import static org.junit.Assert.*;

import general.FieldStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BoardTest {
Board board;

	@Before
	public void setUp() throws Exception {
		board = new Board(new Size(3,3));
	}

	@After
	public void tearDown() throws Exception {
		board = null;
	}

	@Test
	public void testRandomlyDeployShips() {
		fail("Not yet implemented");
	}

	@Test
	public void testToArray() {
		FieldStatus[][] array = new FieldStatus[][]{
				new FieldStatus[]{FieldStatus.FREE,FieldStatus.FREE,FieldStatus.FREE},
				new FieldStatus[]{FieldStatus.FREE,FieldStatus.FREE,FieldStatus.FREE},
				new FieldStatus[]{FieldStatus.FREE,FieldStatus.FREE,FieldStatus.FREE}};
		assertArrayEquals("free 3x3 board test",array,board.toArray());
		array[0][1] = FieldStatus.SHIP;
		array[1][1] = FieldStatus.SHIP;
		array[2][0] = FieldStatus.SHIP;
		Ship ship1 = new Ship(1, Direction.EAST, new Coordinates(0, 1));
		Ship ship2 = new Ship(2, Direction.NE, new Coordinates(2, 0));
		board.setShips(new Ship[]{ship1,ship2});
		assertArrayEquals("board with 2 ships test", array,board.toArray());
		
	}

}
