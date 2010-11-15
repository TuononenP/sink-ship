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

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * @author Petri Tuononen
 *
 */
public class ChatInput extends JPanel {
	
	private static final long serialVersionUID = -7760630614307106453L;
	
	private JTextField inputField;
	
	/**
	 * Constructor.
	 */
	public ChatInput() {
		//create an input field
		inputField = new JTextField();
		//set preferred size for the text field
		inputField.setPreferredSize(new Dimension(500, 20));
		//add input field to the panel
	    add(inputField);
	}

	/**
	 * Get input field.
	 * @return JTextField
	 */
	public JTextField getInputField() {
		return inputField;
	}

	/**
	 * Set input field.
	 * @param input
	 */
	public void setInputField(JTextField input) {
		this.inputField = input;
	}

	/**
	 * Get text from the JTextField.
	 * @return String
	 */
	public String getText() {
		return inputField.getSelectedText();
	}

	/**
	 * Set text for the JTextField.
	 * @param text
	 */
	public void setText(String text) {
		inputField.setText(text);
	}
	
}
