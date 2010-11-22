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
import gui.menuActions.JoinGameAction;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import types.Size;

/**
 * Join a game panel.
 * 
 * @author Petri Tuononen
 *
 */
public class JoinPanel extends JPanel {

	private static final long serialVersionUID = 5349286414627145516L;

	/**
	 * Default constructor.
	 */
	public JoinPanel() {
		init(new Size(400, 300));
	}

	/**
	 * Constructor.
	 * @param size Size of the panel.
	 */
	public JoinPanel(Size size) {
		init(size);
	}
	
	/**
	 * Initializes the join a game panel.
	 * @param size
	 */
	private void init(Size size) {
        //set layout for the panel
        setLayout(new GridLayout(4, 0));
        
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
        
        //add panels to panel
        add(titlePanel);
        add(ipPanel);
        add(pwPanel);
        add(btnPanel);
	}
	
}
