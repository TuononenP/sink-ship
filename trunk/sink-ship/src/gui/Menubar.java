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
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 * @author Petri Tuononen
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
	 * Constructor.
	 */
	public Menubar() {
	}
	
	/**
	 * Menubar.
	 */
	public JMenuBar getMenuBar() {
		//======== menuBar ========
		{
			menuBar = new JMenuBar();
			//======== menu ========
			{
				menu = new JMenu("File");

				//---- menuItem4 ----
				menuItem4 = new JMenuItem("New Game");
				menuItem4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//implement
					}
				});
				menuItem4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
				menu.add(menuItem4);

				//---- menuItem5 ----
				menuItem5 = new JMenuItem("Settings");
				menuItem5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//implement
					}
				});
				menuItem5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0));
				menu.add(menuItem5);

				//---- menuItem ----
				menuItem = new JMenuItem("Quit");
				menuItem.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						MenuActions.quitMenuItemActionPerformed(e);
					}
				});
				menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, 0));
				menu.add(menuItem);

				menuBar.add(menu);

				//======== menu2 ========
				{
					menu2 = new JMenu("Info");

					//---- menuItem2 ----
					menuItem2 = new JMenuItem("Help");
					menuItem2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							MenuActions.helpMenuItemActionPerformed(e);
						}
					});
					//shortcut for help F11
					menuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0));
					menu2.add(menuItem2);

					//---- menuItem3 ----
					menuItem3 = new JMenuItem("About");
					menuItem3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							MenuActions.aboutMenuItemActionPerformed(e);
						}
					});
					menuItem3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, 0));
					menu2.add(menuItem3);
				}
				menuBar.add(menu2);
			}
		}
		return menuBar;
	}

}
