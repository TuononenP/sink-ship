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

import java.awt.event.ActionEvent;

/**
 * Action that happens when user clicks settings menu item.
 * 
 * @author Petri Tuononen
 *
 */
public class SettingsMenuAction extends MenuAction {
	
	private static final long serialVersionUID = 5787011487797522591L;

	/**
	 * Constructor for settings menu action.
	 * 
	 * @param text
	 * @param mnem
	 */
    public SettingsMenuAction(String text, Integer mnem) {
        super(text, mnem);
    }
    
    /**
     * Perform action.
     */
    @Override
	public void actionPerformed(ActionEvent e) {
    	//TODO: Implement
    }
    
}
