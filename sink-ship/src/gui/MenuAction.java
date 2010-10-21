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
package gui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

/**
 * Customized action class for this project's purposes.
 * 
 * @author Petri Tuononen
 *
 */
public class MenuAction extends AbstractAction {

	private static final long serialVersionUID = -3533127027966807015L;

	/**
	 * Constructor for a menu action.
	 * 
	 * @param text
	 * @param mnemonic
	 */
    public MenuAction(String text, Integer mnemonic) {
        super(text);
        putValue(MNEMONIC_KEY, mnemonic);
    }
    
	@Override
	/**
	 * This method needs to be implemented by a inheriting class.
	 */
	public void actionPerformed(ActionEvent e) {
	}
	
}
