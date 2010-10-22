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
import java.awt.event.MouseListener;

/**
 * 
 * @author Petri Tuononen
 *
 */
public class MouseActions implements MouseListener {

	@Override
	/**
	 * Mouse event handler for clicked buttons.
	 */
	public void mouseClicked(MouseEvent e) {
		//identify the mouse button pressed
		switch(e.getModifiers()) {
		//left mouse button pressed
		case InputEvent.BUTTON1_MASK: {
			//set the clicked square
			Gui.setClickedSquare(new Coordinates(e.getX(), e.getY()));
			Gui.setSquareSelected(true);
			Gui.getFrame().repaint();
		}
		//right mouse button pressed
		case InputEvent.BUTTON3_MASK: {
			//clear the square selection
			Gui.setSquareSelected(false);
			Gui.getFrame().repaint();
			break;
		}
		}
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}
	
}
