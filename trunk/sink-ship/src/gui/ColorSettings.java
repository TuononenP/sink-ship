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

import java.awt.Color;

/**
 * Color settings for the Gui.
 * 
 * @author Petri Tuononen
 *
 */
public class ColorSettings {

	/**
	 * @uml.property  name="seaColor"
	 */
	private static Color seaColor = new Color(81,167,255);

	/**
	 * @uml.property  name="selectedSquareColor"
	 */
	private static Color selectedSquareColor = new Color(159, 227, 126);

	/**
	 * @uml.property  name="lineColor"
	 */
	private static Color lineColor = new Color(67,104, 142);

	/**
	 * @uml.property  name="shipColor"
	 */
	private static Color shipColor = new Color(217, 56, 56);
	
	/**
	 * Get color of the sea.
	 * @return  seaColor Color
	 * @uml.property  name="seaColor"
	 */
	public static Color getSeaColor() {
		return seaColor;
	}

	/**
	 * Set color of the sea.
	 * @param seaColor  Color
	 * @uml.property  name="seaColor"
	 */
	public void setSeaColor(Color seaColor) {
		ColorSettings.seaColor = seaColor;
	}
	
	/**
	 * Get color of the selected square.
	 * @return  selectedSquareColor Color
	 * @uml.property  name="selectedSquareColor"
	 */
	public static Color getSelectedSquareColor() {
		return selectedSquareColor;
	}

	/**
	 * Set color for the selected square.
	 * @param  selectedSquareColor
	 * @uml.property  name="selectedSquareColor"
	 */
	public void setSelectedSquareColor(Color selectedSquareColor) {
		ColorSettings.selectedSquareColor = selectedSquareColor;
	}
	
	/**
	 * Get the color of the ship.
	 * @return  shipColor
	 * @uml.property  name="shipColor"
	 */
	public static Color getShipColor() {
		return shipColor;
	}

	/**
	 * Set the color for the ship.
	 * @param  shipColor
	 * @uml.property  name="shipColor"
	 */
	public static void setShipColor(Color shipColor) {
		ColorSettings.shipColor = shipColor;
	}

	/**
	 * Get color of the line.
	 * @return  verticeColor Color
	 * @uml.property  name="lineColor"
	 */
	public static Color getLineColor() {
		return lineColor;
	}

	/**
	 * Set color of the line..
	 * @param lineColor  Color
	 * @uml.property  name="lineColor"
	 */
	public static void setLineColor(Color lineColor) {
		ColorSettings.lineColor = lineColor;
	}

}
