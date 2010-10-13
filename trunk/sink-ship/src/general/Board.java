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
 * @author  Petri Tuononen  TODO: To play against AI or to debug the enemy ships could be placed using the random matrix placement.
 * @author Matej Pristak
 */
public class Board {

	/**
	 * @param blockSize
	 * @param matrixSize
	 */
	public Board(Size blockSize, Size matrixSize) {
		super();
		this.blockSize = blockSize;
		this.matrixSize = matrixSize;
	}

	/**
	 * @param ships
	 * @param blockHeight
	 * @param blockWidth
	 * @param matrixSize
	 */
	protected Board(Ship[] ships, Size blockSize, Size matrixSize) {
		super();
		this.ships = ships;
		this.setBlockSize(blockSize);
		this.matrixSize = matrixSize;
	}

	private Ship[] ships;
	
	//this should be in GUI:
	private Size blockSize;
	
	private Size matrixSize; 
	

	/**
	 *  Deploy the ships randomly on the board.
	 */
	public void randomlyDeployShips() {
		
	}

	/**
	 * @param ships the ships to set
	 */
	public void setShips(Ship[] ships) {
		this.ships = ships;
	}

	/**
	 * @return the ships
	 */
	public Ship[] getShips() {
		return ships;
	}

	/**
	 * @param matrixSize the matrixSize to set
	 */
	public void setMatrixSize(Size matrixSize) {
		this.matrixSize = matrixSize;
	}

	/**
	 * @return the matrixSize
	 */
	public Size getMatrixSize() {
		return matrixSize;
	}

	/**
	 * @param blockSize the blockSize to set
	 */
	public void setBlockSize(Size blockSize) {
		this.blockSize = blockSize;
	}

	/**
	 * @return the blockSize
	 */
	public Size getBlockSize() {
		return blockSize;
	}
	
	/**
	 * 
	 */
	public FieldStatus[][] toArray(){
		return null;
	}

}
