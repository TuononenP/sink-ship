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
package gui.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Key listener for a text field.
 * 
 * @author Petri Tuononen
 * TODO: Remove if unused.
 *
 */
public class ButtonListener implements ActionListener {

	//global variables
	private JTextField jtf;
	private JTextArea jta;

	/**
	 * Constructor.
	 * @param jtf JTextField
	 * @param jta JTextArea
	 */
	public ButtonListener(JTextField jtf, JTextArea jta)
	{
		this.jtf = jtf;
		this.jta = jta;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("WORKS!"); //DEBUG line TODO: remove
		//add a new line from text field to text area
		jta.setText(jta.getText() + "\n" + jtf.getSelectedText());
		//clear text field
		jtf.setText("");
	}

}
