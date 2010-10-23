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

/**
 * Defines the size.
 * 
 * @author  Matej Pristak
 * 
 */
public class Size {

	/**
	 * @uml.property  name="width"
	 */ 
	private int width;
	
	/**
	 * @uml.property  name="height"
	 */
	private int height;
	
	/**
	 * @param width
	 * @param height
	 */
	public Size(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	/**
	 * @param width  the width to set
	 * @uml.property  name="width"
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	
	/**
	 * @return  the width
	 * @uml.property  name="width"
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * @param height  the height to set
	 * @uml.property  name="height"
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	/**
	 * @return  the height
	 * @uml.property  name="height"
	 */
	public int getHeight() {
		return height;
	}

}
