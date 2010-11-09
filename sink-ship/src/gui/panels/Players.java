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
package gui.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

import types.Coordinates;
import types.Size;

/**
 * 
 * @author Petri Tuononen
 *
 */
public class Players extends JPanel {
	
	private static final long serialVersionUID = -8414044164218806272L;
	
	private static Graphics g1;
	
	/**
	 * Constructor.
	 */
	public Players(Size size) {
		try {
			setLayout(new BorderLayout());
			setBackground(Color.BLUE); //TODO: Change color to RGB
			if (size!=null) { //TODO: Remove this later
				setSize(200, 600);
			}
			//draw horizontal line
			getG1().drawLine(0, 20, size.getWidth(), 20);
			//draw "Players" text
			drawString(getG1(), "Players", new Font("Arial", Font.BOLD, 30),
					Color.BLACK, new Coordinates(10, 10));
		} catch (Exception e) {
			// TODO: handle exception
			//Size not set
		}
	}

	//TODO: Move this to more generic GUI class.
	/**
	 * Draws a String using the Graphics class.
	 * 
	 * @param g Graphics
	 * @param text String
	 * @param font Font style and font styles
	 * @param fontColor Color of the font
	 * @param coords Coordinates of the position where the text will be drawn
	 */
	private void drawString(Graphics g, String text, Font font, Color fontColor,
			Coordinates coords) {
		//set font style
		g.setFont(font);
		//set font color
		g.setColor(fontColor);
		//draw String
		g.drawString(text, coords.getX(), coords.getY());
	}

	/**
	 * Get graphics object.
	 * @return
	 */
	public static Graphics getG1() {
		return g1;
	}

	/**
	 * Set Graphics object.
	 * @param g1
	 */
	public void setG1(Graphics g1) {
		Players.g1 = g1;
	}

	/**
	 * Paints components.
	 */
	protected void paintComponent(Graphics g) {
		setG1(g);
	}
	
}
