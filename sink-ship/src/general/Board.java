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
 * @author Petri Tuononen
 */
public class Board {

	/**
	 * Constructor.
	 */
	public Board(int horizontalBlocksAmount, int verticalBlocksAmount) {
		horizontalBlocks = horizontalBlocksAmount;
		verticalBlocks = verticalBlocksAmount;
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

	/**
	 * @uml.property  name="shipAmount"
	 */
	private String shipAmount;

	/**
	 * Getter of the property <tt>shipAmount</tt>
	 * @return  Returns the shipAmount.
	 * @uml.property  name="shipAmount"
	 */
	public String getShipAmount() {
		return shipAmount;
	}

	/**
	 * Setter of the property <tt>shipAmount</tt>
	 * @param shipAmount  The shipAmount to set.
	 * @uml.property  name="shipAmount"
	 */
	public void setShipAmount(String shipAmount) {
		this.shipAmount = shipAmount;
	}

	/**
	 * @uml.property  name="verticalShips"
	 */
	private String verticalShips;

	/**
	 * Getter of the property <tt>verticalShips</tt>
	 * @return  Returns the verticalShips.
	 * @uml.property  name="verticalShips"
	 */
	public String getVerticalShips() {
		return verticalShips;
	}

	/**
	 * Setter of the property <tt>verticalShips</tt>
	 * @param verticalShips  The verticalShips to set.
	 * @uml.property  name="verticalShips"
	 */
	public void setVerticalShips(String verticalShips) {
		this.verticalShips = verticalShips;
	}

	/**
	 * @uml.property  name="horizzontalShips"
	 */
	private String horizzontalShips;

	/**
	 * Getter of the property <tt>horizzontalShips</tt>
	 * @return  Returns the horizzontalShips.
	 * @uml.property  name="horizzontalShips"
	 */
	public String getHorizzontalShips() {
		return horizzontalShips;
	}

	/**
	 * Setter of the property <tt>horizzontalShips</tt>
	 * @param horizzontalShips  The horizzontalShips to set.
	 * @uml.property  name="horizzontalShips"
	 */
	public void setHorizzontalShips(String horizzontalShips) {
		this.horizzontalShips = horizzontalShips;
	}

}
