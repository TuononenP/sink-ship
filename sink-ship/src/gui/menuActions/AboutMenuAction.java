/*
	Copyright (C) 2010 Petri Tuononen

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package gui.menuActions;

import gui.Gui;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

/**
 * Action that happens when user clicks about menu item.
 * 
 * @author Petri Tuononen
 *
 */
public class AboutMenuAction extends MenuAction {
	
	private static final long serialVersionUID = 8750638352780743718L;

	/**
	 * Constructor for about menu action.
	 * 
	 * @param text
	 * @param mnem
	 */
    public AboutMenuAction(String text, Integer mnem) {
        super(text, mnem);
    }
    
    /**
     * Perform action.
     */
    public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(Gui.getFrame(),
		"Authors:\n" +
			     "Petri Tuononen\n" +
				 "Matej Pristak\n" +
				 "Andre Wagner\n" +
				 "Kim, Hyuk-joong\n" +
				 "Yu, Hyun-chul\n" +
		"Date: 10/2010\n" +
		"Version: 1.0\n" +
		"Info: This software is a part of Advanced Software Engineering " +
		"course at Sungkyunkwan University.\n" +
		"Feedback: petri.tuononen@gmail.com", "About",
		JOptionPane.PLAIN_MESSAGE);
    }
    
}
