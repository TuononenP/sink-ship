/*
Copyright (C) 2010 Petri Tuononen

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package general;

/**
 * Defines a game board that is basically a matrix.
 * 
 * @author	Petri Tuononen  
 * @author  Matej Pristak
 * 
 * TODO: To play against AI or to debug the enemy ships could be placed using the random matrix placement.
 */
public class Board {

	/**
	 * for backwards compatibility, don't use!
	 * @param blockSize
	 * @param matrixSize
	 */
	public Board(Size blockSize, Size matrixSize) {
		super();
		this.blockSize = blockSize;
		this.matrixSize = matrixSize;
	}

	/**
	 * creates an empty board
	 * @param matrixSize size of the board
	 */
	public Board(Size matrixSize) {
		super();
		this.matrixSize = matrixSize;
	}

	/**
	 * @param ships
	 * @param blockHeight
	 * @param blockWidth
	 * @param matrixSize
	 */
	public Board(Ship[] ships, Size blockSize, Size matrixSize) {
		super();
		this.ships = ships;
		this.setBlockSize(blockSize);
		this.matrixSize = matrixSize;
	}

	//server & client:
	/**
	 * @uml.property  name="ships"
	 * @uml.associationEnd  multiplicity="(0 -1)"
	 */
	private Ship[] ships;	
	
	/**
	 * @uml.property  name="matrixSize"
	 * @uml.associationEnd  
	 */
	private Size matrixSize;
	
	//TODO:this should be in GUI:
	/**
	 * @uml.property  name="blockSize"
	 * @uml.associationEnd  
	 */
	private Size blockSize;

	/**
	 *  Deploy the ships randomly on the board.
	 */
	public void randomlyDeployShips() {

	}

	/**
	 * @param ships  the ships to set
	 * @uml.property  name="ships"
	 */
	public void setShips(Ship[] ships) {
		this.ships = ships;
	}

	/**
	 * @return  the ships
	 * @uml.property  name="ships"
	 */
	public Ship[] getShips() {
		return ships;
	}

	/**
	 * @param matrixSize  the matrixSize to set
	 * @uml.property  name="matrixSize"
	 */
	public void setMatrixSize(Size matrixSize) {
		this.matrixSize = matrixSize;
	}

	/**
	 * @return  the matrixSize
	 * @uml.property  name="matrixSize"
	 */
	public Size getMatrixSize() {
		return matrixSize;
	}

	/**
	 * @param blockSize  the blockSize to set
	 * @uml.property  name="blockSize"
	 */
	public void setBlockSize(Size blockSize) {
		this.blockSize = blockSize;
	}

	/**
	 * @return  the blockSize
	 * @uml.property  name="blockSize"
	 */
	public Size getBlockSize() {
		return blockSize;
	}

	/**
	 * @return the board as an array
	 */
	public FieldStatus[][] toArray(){
		return null;
	}

}
