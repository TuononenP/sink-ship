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

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

/**
 * @author Petri Tuononen
 */
public class MenuActions {

	/**
	 * 'Quit' File menu item pressed.
	 * @param e
	 */
	public static void quitMenuItemActionPerformed(ActionEvent e) {
//		Gui.getFrame().setVisible(false);
//		Gui.getFrame().dispose();
	}

	/**
	 * 'Help' menu item pressed.
	 * @param e
	 */
	public static void helpMenuItemActionPerformed(ActionEvent e) {
		new Help().toFront();
	}

	/**
	 * 'About' menu item pressed.
	 * @param e
	 */
	public static void aboutMenuItemActionPerformed(ActionEvent e) {
		showAbout();
	}

	/**
	 * Shows about screen.
	 */
	public static void showAbout() {
//		JOptionPane.showMessageDialog(Gui.getFrame(),
//				"Author: Petri Tuononen\n" +
//				"Date: 10/2010\n" +
//				"Version: 1.0\n" +
//				"Info: This software is a part of Advanced Software Engineering " +
//				"course at Sungkyunkwan University.\n" +
//				"Feedback: petri.tuononen@gmail.com", "About",
//				JOptionPane.PLAIN_MESSAGE);
	}

}
