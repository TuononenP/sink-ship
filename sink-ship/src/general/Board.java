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
	public Board(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	/**
	 * @uml.property  name="width"
	 */
	private int width;

	/** 
	 * Getter of the property <tt>horizontalSize</tt>
	 * @return  Returns the horizontalSize.
	 * @uml.property  name="width"
	 */
	public int getWidth() {
		return width;
	}

	/** 
	 * Setter of the property <tt>horizontalSize</tt>
	 * @param horizontalSize  The horizontalSize to set.
	 * @uml.property  name="width"
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @uml.property  name="height"
	 */
	private int height;

	/** 
	 * Getter of the property <tt>verticalSize</tt>
	 * @return  Returns the verticalSize.
	 * @uml.property  name="height"
	 */
	public int getHeight() {
		return height;
	}

	/** 
	 * Setter of the property <tt>verticalSize</tt>
	 * @param verticalSize  The verticalSize to set.
	 * @uml.property  name="height"
	 */
	public void setHeight(int height) {
		this.height = height;
	}

}
