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

import types.Coordinates;
import types.Direction;

/**
 * Defines a ship.
 * 
 * @author  Petri Tuononen
 * 
 */
public class Ship {

	/**
	 * @uml.property  name="direc"
	 * @uml.associationEnd  
	 */
	Direction direc;
	
	/**
	 * @uml.property  name="coords"
	 * @uml.associationEnd  
	 */
	Coordinates coords;
	
	/**
	 * @uml.property  name="size"
	 */
	private int size;
	
	/**
	 * @uml.property  name="status"
	 */
	types.FieldStatus[] status;

	/**
	 * Constructor.
	 * @param size
	 */
	public Ship(int size) {
		this.size=size;
	}

	/**
	 * Constructor.
	 * 
	 * @param size
	 * @param direc
	 * @param coords
	 * @param status
	 */
	public Ship(int size, Direction direc, Coordinates coords) {
		this.size = size;
		this.direc = direc;
		this.coords = coords;
	}

	/**
	 * Getter of the property <tt>size</tt>
	 * @return  Returns the size.
	 * @uml.property  name="size"
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Setter of the property <tt>size</tt>
	 * @param size  The size to set.
	 * @uml.property  name="size"
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * Get direction of the ship.
	 * @return  Direction
	 * @uml.property  name="direc"
	 */
	public Direction getDirec() {
		return direc;
	}

	/**
	 * Set direction of the ship.
	 * @param  direc
	 * @uml.property  name="direc"
	 */
	public void setDirec(Direction direc) {
		this.direc = direc;
	}

	/**
	 * Get coordinates of the ship.
	 * @return  Coordinates
	 * @uml.property  name="coords"
	 */
	public Coordinates getCoords() {
		return coords;
	}

	/**
	 * Set coordinates of the ship.
	 * @param  coords
	 * @uml.property  name="coords"
	 */
	public void setCoords(Coordinates coords) {
		this.coords = coords;
	}

}
