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

import gui.RoundedButton;
import gui.menuActions.JoinGameAction;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 * 
 * @author Petri Tuononen
 * TODO: Finish the layout. This is currently an early concept.
 *
 */
public class JoinGame extends JFrame implements Runnable {

	private static final long serialVersionUID = 774976258560771941L;

	/**
	 * Constructor.
	 */
	public JoinGame() {
		//setup JFrame 
		setVisible(true);
		setTitle("Join a game");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setSize(400, 300);
		//set center of the screen
		setLocationRelativeTo(null);
		
		//create panels with layout
		JPanel titlePanel = new JPanel(new BorderLayout());
		JPanel ipPanel = new JPanel(new FlowLayout());
		JPanel pwPanel = new JPanel(new FlowLayout());
		JPanel btnPanel = new JPanel(new BorderLayout());
		
		//create labels
		JLabel joinLbl = new JLabel("Join a game");
		JLabel ipLbl = new JLabel("IP");
		JLabel pwLbl = new JLabel("PW");
		
		//set join a game label font
		joinLbl.setFont(new Font("Verdana", Font.BOLD, 20));
		
		//create text fields
		JTextField ipFld = new JTextField();
		JTextField pwFld = new JTextField();
		
		//set text field sizes
		ipFld.setPreferredSize(new Dimension(100, 20));
		pwFld.setPreferredSize(new Dimension(100, 20));
		
		//create a connect button
        JButton cntBtn = new JButton("Connect");
        cntBtn.setFont(new Font("Verdana", Font.BOLD, 14));
        cntBtn.setForeground(Color.BLACK);
        cntBtn.setBorder(new RoundedButton(0)); 
        //add action listener for the button
        cntBtn.addActionListener(
        		new JoinGameAction("Connect", KeyEvent.VK_C));
        
        //add components to panels
        titlePanel.add(joinLbl);
        ipPanel.add(ipLbl);
        ipPanel.add(ipFld);
        pwPanel.add(pwLbl);
        pwPanel.add(pwFld);
        btnPanel.add(cntBtn);
        
        //add panels to content pane
        getContentPane().add(titlePanel);
        getContentPane().add(ipPanel);
        getContentPane().add(pwPanel);
        getContentPane().add(btnPanel);
        
        //set layout for the content pane
        getContentPane().setLayout(new GridLayout(4, 0));
	}
	
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new JoinGame());
	}

	@Override
	public void run() {
		JFrame.setDefaultLookAndFeelDecorated(false);
	}
	
}
