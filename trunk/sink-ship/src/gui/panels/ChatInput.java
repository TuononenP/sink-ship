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

import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * @author Petri Tuononen
 *
 */
public class ChatInput extends JPanel {
	
	private static final long serialVersionUID = -7760630614307106453L;
	
	private JTextField input;
	
	/**
	 * Constructor.
	 */
	public ChatInput() {
		//create an input field
		input = new JTextField();
		//add input field to the panel
	    add(input, BorderLayout.EAST);
	}

	/**
	 * Get input.
	 * @return
	 */
	public JTextField getInput() {
		return input;
	}

	/**
	 * Set input.
	 * @param input
	 */
	public void setInput(JTextField input) {
		this.input = input;
	}
	
}
