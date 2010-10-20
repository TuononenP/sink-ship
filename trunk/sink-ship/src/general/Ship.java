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
 * @author Matej Pristak
 */
public class Ship {
	
	/**
	 * @param size
	 * @param direction
	 * @param startingPoint
	 * @param hits
	 * @param sunken
	 */
	public Ship(int size, Direction direction, Coordinates startingPoint,
			FieldStatus[] status, Boolean sunken) {
		super();
		this.size = size;
		this.direction = direction;
		this.startingPoint = startingPoint;
		this.status = status;
		this.sunken = sunken;
	}
	
	
	/**
	 * @param size
	 * @param direction
	 * @param startingPoint
	 */
	public Ship(int size, Direction direction, Coordinates startingPoint) {
		super();
		this.size = size;
		this.direction = direction;
		this.startingPoint = startingPoint;
		
		//defaults:
		//this.status = status;
		this.sunken = false;
	}

	//server & client:
	private int size;
	private Direction direction;
	private Coordinates startingPoint;
	private FieldStatus[] status;
	private Boolean sunken;

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
	 * @param direction the direction to set
	 */
	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	/**
	 * @return the direction
	 */
	public Direction getDirection() {
		return direction;
	}

	/**
	 * @param startingPoint the startingPoint to set
	 */
	public void setStartingPoint(Coordinates startingPoint) {
		this.startingPoint = startingPoint;
	}

	/**
	 * @return the startingPoint
	 */
	public Coordinates getStartingPoint() {
		return startingPoint;
	}

	/**
	 * @param hits the hits to set
	 */
	public void setStatus(FieldStatus[] status) {
		this.status = status;
	}

	/**
	 * @return the hits
	 */
	public FieldStatus[] getStatus() {
		return status;
	}

	/**
	 * @param sunken the sunken to set
	 */
	public void setSunken(Boolean sunken) {
		this.sunken = sunken;
	}

	/**
	 * @return the sunken
	 */
	public Boolean getSunken() {
		return sunken;
	}

}
