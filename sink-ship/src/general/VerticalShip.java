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
public class VerticalShip extends Ship {

	/**
	 * Constructor.
	 * @param size
	 */
	public VerticalShip(int size) {
		super(size);
	}

	/**
	 * @uml.property  name="startY"
	 */
	private String startY;

	/**
	 * Getter of the property <tt>startY</tt>
	 * @return  Returns the startY.
	 * @uml.property  name="startY"
	 */
	public String getStartY() {
		return startY;
	}

	/**
	 * Setter of the property <tt>startY</tt>
	 * @param startY  The startY to set.
	 * @uml.property  name="startY"
	 */
	public void setStartY(String startY) {
		this.startY = startY;
	}

	/**
	 * @uml.property  name="endY"
	 */
	private String endY;

	/**
	 * Getter of the property <tt>endY</tt>
	 * @return  Returns the endY.
	 * @uml.property  name="endY"
	 */
	public String getEndY() {
		return endY;
	}

	/**
	 * Setter of the property <tt>endY</tt>
	 * @param endY  The endY to set.
	 * @uml.property  name="endY"
	 */
	public void setEndY(String endY) {
		this.endY = endY;
	}
	
}
