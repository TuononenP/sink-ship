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

import gui.menuActions.HostGameAction;
import gui.menuActions.JoinGameAction;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

/**
 * The start screen of the application.
 * Uses a layout of one row and two columns.
 * 
 * @author  Petri Tuononen
 * 
 */
public class StartMenu extends JFrame implements Runnable {
	
	private static final long serialVersionUID = -5732982185534173892L;

	/**
	 * The starting menu of the game.
	 * Contains join a game and host a game buttons.
	 * 
	 * Constructor.
	 */
	public StartMenu() {
		//setup JFrame 
		setVisible(true);
		setTitle("Start Menu");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setSize(500, 300);
		//set center of the screen
		setLocationRelativeTo(null);
		
		//set layout (2 rows, 2 columns)
		setLayout(new GridLayout(2, 2));

		//create a font for the buttons
		Font font = new Font("Verdana", Font.BOLD, 24);
		
		//create a join game button
        JButton joinBtn = new JButton("Join a game");
        joinBtn.setFont(font);
        joinBtn.setForeground(Color.BLACK);
        joinBtn.setBorder(new RoundedButton(100)); 
        //add action listener for the button
        joinBtn.addActionListener(
        		new JoinGameAction("Join a game", KeyEvent.VK_J));
        
		//create a host game button
        JButton hostBtn = new JButton("Host a game");
        hostBtn.setFont(font);
        hostBtn.setForeground(Color.BLACK);
        hostBtn.setBorder(new RoundedButton(100)); 
        //add action listener for the button
        hostBtn.addActionListener(
        		new HostGameAction("Host a game", KeyEvent.VK_H));
		
		//create a container
		Container contentPane = getContentPane();
		
		//add buttons to the container
		contentPane.add(joinBtn);
		contentPane.add(hostBtn);
	}
	
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame.setDefaultLookAndFeelDecorated(false);
				new StartMenu();
			}
		});
	}

	@Override
	public void run() {
	}

}
