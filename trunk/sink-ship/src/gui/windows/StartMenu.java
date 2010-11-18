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
package gui.windows;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;

import gui.Gui;
import gui.panels.StartPanel;

/**
 * The start screen of the application.
 * 
 * @author Petri Tuononen
 */
public class StartMenu extends Gui {

	private static final long serialVersionUID = -8871608265061270446L;
	
	/**
	 * Default constructor.
	 */
	public StartMenu() {
		super(new Dimension(500, 300), new BorderLayout());
		getFrame().add(new StartPanel());
	}
	
	/**
	 * Constructor.
	 * @param d Dimension
	 * @param layout LayoutManager
	 */
	public StartMenu(Dimension d, LayoutManager layout) {
		super(d, layout);
		getFrame().add(new StartPanel());
	}

	public static void main(String[] args) {
		new StartMenu();
	}

}
