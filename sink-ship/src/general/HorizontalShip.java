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
public class HorizontalShip extends Ship {
	
	/**
	 * Constructor.
	 * @param size
	 */
	public HorizontalShip(int size) {
		super(size);
	}

	/**
	 * @uml.property  name="startX"
	 */
	private String startX;
	
	/**
	 * @uml.property  name="y"
	 */
	private String y;

	/**
	 * Get y coordinate.
	 * @return
	 */
	public String getY() {
		return y;
	}

	/**
	 * Set y coodinate.
	 * @param y
	 */
	public void setY(String y) {
		this.y = y;
	}

	/**
	 * Getter of the property <tt>startX</tt>
	 * @return  Returns the startX.
	 * @uml.property  name="startX"
	 */
	public String getStartX() {
		return startX;
	}

	/**
	 * Setter of the property <tt>startX</tt>
	 * @param startX  The startX to set.
	 * @uml.property  name="startX"
	 */
	public void setStartX(String startX) {
		this.startX = startX;
	}

	/**
	 * @uml.property  name="endX"
	 */
	private String endX;

	/**
	 * Getter of the property <tt>endX</tt>
	 * @return  Returns the endX.
	 * @uml.property  name="endX"
	 */
	public String getEndX() {
		return endX;
	}

	/**
	 * Setter of the property <tt>endX</tt>
	 * @param endX  The endX to set.
	 * @uml.property  name="endX"
	 */
	public void setEndX(String endX) {
		this.endX = endX;
	}

}
