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

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.border.Border;

/**
 * Creates a rounded button.
 * 
 * @author Petri Tuononen
 *
 */
public class RoundedButton implements Border {

	//radius of the button
    private int radius;

    /**
     * Constructor.
     * Sets the radius.
     * 
     * @param radius
     */
    RoundedButton(int radius) {
        this.radius = radius;
    }
    
    /**
     * Get the border insets.
     * @param Component
     */
    public Insets getBorderInsets(Component c) {
        return new Insets(
        		this.radius+1, this.radius+1,
        		this.radius+2, this.radius);
    }

    /**
     * Returns true if the border is opaque.
     */
    public boolean isBorderOpaque() {
        return true;
    }

    /**
     * Paints the boarder.
     */
    public void paintBorder(Component c, Graphics g, int x, int y,
    		int width, int height) {
        	g.drawRoundRect(x, y, width-1, height-1, radius, radius);
    }
    
}
