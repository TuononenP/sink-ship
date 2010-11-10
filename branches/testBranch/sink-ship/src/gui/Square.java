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
package gui;

import types.Coordinates;

/**
 * Defines a one cell (square) on the board.
 * 
 * @author Petri Tuononen
 *
 */
public class Square {

	/**
	 * @uml.property  name="clickedSquare"
	 * @uml.associationEnd  
	 */
	private static Coordinates clickedSquare;
	
	/**
	 * @uml.property  name="squareSelected"
	 */
	private static boolean squareSelected = false;
	
	/**
	 * Get clicked square.
	 * @return clickedSquare
	 * @uml.property  name="clickedSquare"
	 */
	public static Coordinates getClickedSquare() {
		return clickedSquare;
	}

	/**
	 * Set clicked square.
	 * @param  clickedSquare
	 * @uml.property  name="clickedSquare"
	 */
	public static void setClickedSquare(Coordinates clickedSquare) {
		Square.clickedSquare = clickedSquare;
	}

	/**
	 * Returns true if square is selected, false otherwise.
	 * @return squareSelected
	 * @uml.property  name="squareSelected"
	 */
	public static boolean isSquareSelected() {
		return squareSelected;
	}

	/**
	 * Set selected square.
	 * @param  squareSelected
	 * @uml.property  name="squareSelected"
	 */
	public static void setSquareSelected(boolean squareSelected) {
		Square.squareSelected = squareSelected;
	}
	
}
