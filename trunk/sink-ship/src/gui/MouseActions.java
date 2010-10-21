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

import general.Coordinates;

import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;

/**
 * 
 * @author Petri Tuononen
 *
 */
public class MouseActions {

	/**
	 * Mouse event handler for clicked buttons.
	 */
	public void mouseClicked(MouseEvent e) {
		//identify the mouse button pressed
		switch(e.getModifiers()) {
		//left mouse button pressed
		case InputEvent.BUTTON1_MASK: {
			//set the clicked square
//			setClickedSquare(new Coordinates(e.getX(), e.getY()));
//			setSquareSelected(true);
//			repaint();
			break;
		}
		//right mouse button pressed
		case InputEvent.BUTTON3_MASK: {
			//clear the square selection
//			setSquareSelected(false);
//			repaint();
			break;
		}
		}
	}

	public void mouseEntered(MouseEvent arg0) {
	}

	public void mouseExited(MouseEvent arg0) {
	}

	public void mousePressed(MouseEvent arg0) {
	}

	public void mouseReleased(MouseEvent arg0) {
	}

}
