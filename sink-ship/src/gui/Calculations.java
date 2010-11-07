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
 * Mathematical calculations related to the GUI.
 * 
 * @author Petri Tuononen
 *
 */
public class Calculations {

	/**
	 * Calculate the upper left corner cell coordinates.
	 */
	public static Coordinates getUpperLeftCornerCoordinates(int x, int y) {
		//calculate upper-left cell coordinates
		int xPos = (x/BoardPanel.getBoard().getBlockSize().getWidth())*
		BoardPanel.getBoard().getBlockSize().getWidth();
		int yPos = (y/BoardPanel.getBoard().getBlockSize().getHeight())*
		BoardPanel.getBoard().getBlockSize().getHeight();
		return new Coordinates(xPos, yPos);
	}
	
}
