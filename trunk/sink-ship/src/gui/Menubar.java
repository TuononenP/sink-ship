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

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * @author  Petri Tuononen
 */
public class Menubar extends JMenuBar {

	private static final long serialVersionUID = -6944618364437540845L;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenu menu2;
	private JMenuItem menuItem;
	private JMenuItem menuItem2;
	private JMenuItem menuItem3;
	private JMenuItem menuItem4;
	private JMenuItem menuItem5;

	/**
	 * Default constructor.
	 */
	public Menubar() {
	}
	
	/**
	 * Menubar.
	 * @uml.property  name="menuBar"
	 */
	public JMenuBar getMenuBar() {
		//======== menuBar ========
		{
			menuBar = new JMenuBar();
			//======== menu ========
			{
				menu = new JMenu("File");

				//---- menuItem4 ----
				NewGameMenuAction newGameAction = new NewGameMenuAction("New Game", KeyEvent.VK_F1);
				menuItem4 = new JMenuItem(newGameAction);
				menu.add(menuItem4);

				//---- menuItem5 ----
				SettingsMenuAction settingsAction = new SettingsMenuAction("Settings", KeyEvent.VK_F2);
				menuItem5 = new JMenuItem(settingsAction);
				menu.add(menuItem5);

				//---- menuItem ----
				QuitMenuAction quitAction = new QuitMenuAction("Quit", KeyEvent.VK_Q);
				menuItem = new JMenuItem(quitAction);
				menu.add(menuItem);

				menuBar.add(menu);

				//======== menu2 ========
				{
					menu2 = new JMenu("Info");

					//---- menuItem2 ----
					HelpMenuAction helpAction = new HelpMenuAction("Help", KeyEvent.VK_F11);
					menuItem2 = new JMenuItem(helpAction);
					menu2.add(menuItem2);

					//---- menuItem3 ----
					AboutMenuAction aboutAction = new AboutMenuAction("About", KeyEvent.VK_A);
					menuItem3 = new JMenuItem(aboutAction);
					menu2.add(menuItem3);
				}
				menuBar.add(menu2);
			}
		}
		return menuBar;
	}

}
