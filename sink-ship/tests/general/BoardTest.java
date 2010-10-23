/*
	Copyright (C) 2010 Matej Pristak

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package general;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import types.Coordinates;
import types.Direction;
import types.FieldStatus;
import types.Size;

/**
 * @author  Matej Pristak
 */
public class BoardTest {
	
	/**
	 * @uml.property  name="board"
	 * @uml.associationEnd  
	 */
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
