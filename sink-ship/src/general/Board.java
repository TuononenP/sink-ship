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
 */
public class Board {

	/**
	 * Size of the gaming board.
	 */
	int[][] boardMatrix;
	
	/**
	 * The amount of different size of the ships on the boards.
	 * @uml.property  name="twoBlockShips"
	 */
	private int twoBlockShips;

	/**
	 * The amount of three block ships on the board
	 */
	private int threeBlockShips;

	/**
	 * The amount of four block ships on the board.
	 * @uml.property  name="fourBlockShips"
	 */
	private int fourBlockShips;
	
	/**
	 * The amount of five block ships on the board.
	 */
	private int fiveBlockShips;
	
	/**
	 * Constructor.
	 * The amount of different sized ships are not initialized.
	 */
	public Board(int horizontalBlocksAmount, int verticalBlocksAmount) {
		setHorizontalBlocks(horizontalBlocksAmount);
		setVerticalBlocks(verticalBlocksAmount);
		//create a new board size
		boardMatrix = new int[horizontalBlocks][verticalBlocks];
	}
	
	/**
	 * Constructor.
	 * The amount of different sized ships are set.
	 */
	public Board(int horizontalBlocksAmount, int verticalBlocksAmount, int twoBlockShips, int threeBlockShips, int fourBlockShips, int fiveBlockShips) {
		setHorizontalBlocks(horizontalBlocksAmount);
		setVerticalBlocks(verticalBlocksAmount);
		setTwoBlockShips(twoBlockShips);
		setThreeBlockships(threeBlockShips);
		setFourBlockShips(fourBlockShips);
		setFiveBlockships(fiveBlockShips);
	} 

	/**
	 * Get the amount of the block ships on the board.
	 * @return
	 * @uml.property  name="twoBlockShips"
	 */
	public int getTwoBlockShips() {
		return twoBlockShips;
	}

	/**
	 * Set the amount of the block ships on the board.
	 * @param  twoBlockShips
	 * @uml.property  name="twoBlockShips"
	 */
	public void setTwoBlockShips(int twoBlockShips) {
		this.twoBlockShips = twoBlockShips;
	}

	/**
	 * Get the amount of three block ships on the board.
	 * @return
	 */
	public int getThreeBlockships() {
		return threeBlockShips;
	}

	/**
	 * Set the amount of three block ships son the board.
	 * @param threeBlockShips
	 */
	public void setThreeBlockships(int threeBlockShips) {
		this.threeBlockShips = threeBlockShips;
	}

	/**
	 * Get the amount of four block ships on the board.
	 * @return  fourBlockShips
	 * @uml.property  name="fourBlockShips"
	 */
	public int getFourBlockShips() {
		return fourBlockShips;
	}

	/**
	 * Set the amount of four block ships on the board.
	 * @param  fourBlockShips
	 * @uml.property  name="fourBlockShips"
	 */
	public void setFourBlockShips(int fourBlockShips) {
		this.fourBlockShips = fourBlockShips;
	}

	/**
	 * Set the amount of five block ships on the board.
	 * @param fiveBlockships
	 */
	public void setFiveBlockships(int fiveBlockships) {
		this.fiveBlockShips = fiveBlockships;
	}

	/**
	 * Get the amount of five block ships on the board.
	 * @return fiveBlockShips
	 */
	public int getFiveBlockships() {
		return fiveBlockShips;
	}

	/**
	 * @uml.property  name="blockHeight"
	 */
	private static int blockHeight=20;

	/**
	 * Getter of the property <tt>blockHeight</tt>
	 * @return  Returns the blockHeight.
	 * @uml.property  name="blockHeight"
	 */
	public int getBlockHeight() {
		return blockHeight;
	}

	/**
	 * Setter of the property <tt>blockHeight</tt>
	 * @param blockHeight  The blockHeight to set.
	 * @uml.property  name="blockHeight"
	 */
	public void setBlockHeight(int blockHeight) {
		Board.blockHeight = blockHeight;
	}

	/**
	 * @uml.property  name="blockWidth"
	 */
	private static int blockWidth=20;	

	/** 
	 * Getter of the property <tt>blockWidth</tt>
	 * @return  Returns the blockWidth.
	 * @uml.property  name="blockWidth"
	 */
	public int getBlockWidth() {
		return blockWidth;
	}

	/** 
	 * Setter of the property <tt>blockWidth</tt>
	 * @param blockWidth  The blockWidth to set.
	 * @uml.property  name="blockWidth"
	 */
	public void setBlockWidth(int blockWidth) {
		Board.blockWidth = blockWidth;
	}

	/**
	 * @uml.property  name="HorizontalBlocks"
	 */
	private static int horizontalBlocks;

	/** 
	 * Getter of the property <tt>horizontalSize</tt>
	 * @return  Returns the horizontalSize.
	 * @uml.property  name="HorizontalBlocks"
	 */
	public int getHorizontalBlocks() {
		return horizontalBlocks;
	}

	/** 
	 * Setter of the property <tt>horizontalSize</tt>
	 * @param horizontalSize  The horizontalSize to set.
	 * @uml.property  name="HorizontalBlocks"
	 */
	public void setHorizontalBlocks(int horizontalBlocks) {
		Board.horizontalBlocks = horizontalBlocks;
	}

	/**
	 * @uml.property  name="VerticalBlocks"
	 */
	private static int verticalBlocks;

	/** 
	 * Getter of the property <tt>verticalSize</tt>
	 * @return  Returns the verticalSize.
	 * @uml.property  name="VerticalBlocks"
	 */
	public int getVerticalBlocks() {
		return verticalBlocks;
	}

	/** 
	 * Setter of the property <tt>verticalSize</tt>
	 * @param verticalSize  The verticalSize to set.
	 * @uml.property  name="VerticalBlocks"
	 */
	public void setVerticalBlocks(int verticalBlocks) {
		Board.verticalBlocks = verticalBlocks;
	}

//	/**
//	 * @uml.property  name="verticalShips"
//	 */
//	private String verticalShips;
//
//	/**
//	 * Getter of the property <tt>verticalShips</tt>
//	 * @return  Returns the verticalShips.
//	 * @uml.property  name="verticalShips"
//	 */
//	public String getVerticalShips() {
//		return verticalShips;
//	}
//
//	/**
//	 * Setter of the property <tt>verticalShips</tt>
//	 * @param verticalShips  The verticalShips to set.
//	 * @uml.property  name="verticalShips"
//	 */
//	public void setVerticalShips(String verticalShips) {
//		this.verticalShips = verticalShips;
//	}
//
//	/**
//	 * @uml.property  name="horizontalShips"
//	 */
//	private String horizontalShips;
//
//	/**
//	 * Getter of the property <tt>horizzontalShips</tt>
//	 * @return  Returns the horzzontalShips.
//	 * @uml.property  name="horizontalShips"
//	 */
//	public String getHorizontalShips() {
//		return horizontalShips;
//	}
//
//	/**
//	 * Setter of the property <tt>horizzontalShips</tt>
//	 * @param horizzontalShips  The horizzontalShips to set.
//	 * @uml.property  name="horizzontalShips"
//	 */
//	public void setHorizontalShips(String horizontalShips) {
//		this.horizontalShips = horizontalShips;
//	}
	
	/**
	 *  Deploy the ships randomly on the board.
	 */
	public void randomlyDeployShips() {
		
	}

}