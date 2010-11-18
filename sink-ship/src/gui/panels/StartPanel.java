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

import gui.RoundedButton;
import gui.menuActions.HostGameAction;
import gui.menuActions.JoinGameAction;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Start menu panel.
 * 
 * @author Petri Tuononen
 *
 */
public class StartPanel extends JPanel {

	private static final long serialVersionUID = -2191383677154073954L;

	/**
	 * Constructor.
	 */
	public StartPanel() {
		//set layout for the panel
		setLayout(new GridLayout(2, 0));
		
		//create a font for the buttons
		Font font = new Font("Verdana", Font.BOLD, 24);
		
		//create a join game button
        JButton joinBtn = new JButton("Join a game");
        joinBtn.setFont(font);
        joinBtn.setForeground(Color.BLACK);
        joinBtn.setBorder(new RoundedButton(0)); 
        //add action listener for the button
        joinBtn.addActionListener(
        		new JoinGameAction("Join a game", KeyEvent.VK_J));
        
		//create a host game button
        JButton hostBtn = new JButton("Host a game");
        hostBtn.setFont(font);
        hostBtn.setForeground(Color.BLACK);
        hostBtn.setBorder(new RoundedButton(0)); 
        //add action listener for the button
        hostBtn.addActionListener(
        		new HostGameAction("Host a game", KeyEvent.VK_H));
		
		//add buttons to the panel
		add(joinBtn);
		add(hostBtn);
	}
	
}
