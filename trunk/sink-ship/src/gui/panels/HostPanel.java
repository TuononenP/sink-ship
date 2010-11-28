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
 * Host a game panel.
 * 
 * @author Petri Tuononen
 *
 */
public class HostPanel extends JPanel {

	private static final long serialVersionUID = 7447514699077723629L;

	/**
	 * Default constructor.
	 */
	public HostPanel() {
		init(new Size(400, 500));
	}

	/**
	 * Constructor.
	 * @param size Size of the panel.
	 */
	public HostPanel(Size size) {
		init(size);
	}
	
	/**
	 * Initializes the join a game panel.
	 * @param size
	 */
	private void init(Size size) {
        //set layout for the panel
        setLayout(new GridLayout(10, 0));
        
		//create panels with layout
		JPanel titlePanel = new JPanel(new BorderLayout());
		JPanel pwPanel = new JPanel(new FlowLayout());
		JPanel matrixPanel = new JPanel(new FlowLayout());
		JPanel shipsPanel = new JPanel(new BorderLayout());
		JPanel btnPanel = new JPanel(new BorderLayout());
		JPanel oneShipPanel = new JPanel(new FlowLayout());
		JPanel twoShipPanel = new JPanel(new FlowLayout());
		JPanel threeShipPanel = new JPanel(new FlowLayout());
		JPanel fourShipPanel = new JPanel(new FlowLayout());
		JPanel fiveShipPanel = new JPanel(new FlowLayout());
		
		//create labels
		JLabel hostLbl = new JLabel("Host a game");
		JLabel pwLbl = new JLabel("PW");
		JLabel matrixLbl = new JLabel("Matrix");
		JLabel timesLbl = new JLabel("X");
		JLabel shipsLbl = new JLabel("Ships");
		JLabel oneShipLbl = new JLabel("1x Ship");
		JLabel twoShipLbl = new JLabel("2x Ship");
		JLabel threeShipLbl = new JLabel("3x Ship");
		JLabel fourShipLbl = new JLabel("4x Ship");
		JLabel fiveShipLbl = new JLabel("5x Ship");
		
		//set host a game label font
		hostLbl.setFont(new Font("Verdana", Font.BOLD, 20));
		
		//create text fields
		JTextField pwFld = new JTextField();
		JTextField matrixFldWidth = new JTextField();
		JTextField matrixFldHeight = new JTextField();
		JTextField oneShipFld = new JTextField();
		JTextField twoShipFld = new JTextField();
		JTextField threeShipFld = new JTextField();
		JTextField fourShipFld = new JTextField();
		JTextField fiveShipFld= new JTextField();
		
		//set text field sizes
		pwFld.setPreferredSize(new Dimension(100, 20));
		matrixFldWidth.setPreferredSize(new Dimension(30, 20));
		matrixFldHeight.setPreferredSize(new Dimension(30, 20));
		oneShipFld.setPreferredSize(new Dimension(30, 20));
		twoShipFld.setPreferredSize(new Dimension(30, 20));
		threeShipFld.setPreferredSize(new Dimension(30, 20));
		fourShipFld.setPreferredSize(new Dimension(30, 20));
		fiveShipFld.setPreferredSize(new Dimension(30, 20));
		
		//create a connect button
        JButton hostBtn = new JButton("Connect");
        hostBtn.setFont(new Font("Verdana", Font.BOLD, 14));
        hostBtn.setForeground(Color.BLACK);
        hostBtn.setBorder(new RoundedButton(0)); 
        //add action listener for the button
        hostBtn.addActionListener(new HostGameAction("Host", KeyEvent.VK_H));
        
        //add components to panels
        titlePanel.add(hostLbl);
        pwPanel.add(pwLbl);
        pwPanel.add(pwFld);
        matrixPanel.add(matrixLbl);
        matrixPanel.add(matrixFldWidth);
        matrixPanel.add(timesLbl);
        matrixPanel.add(matrixFldHeight);
        shipsPanel.add(shipsLbl);
        btnPanel.add(hostBtn);
        oneShipPanel.add(oneShipLbl);
        oneShipPanel.add(oneShipFld);
        twoShipPanel.add(twoShipLbl);
        twoShipPanel.add(twoShipFld);
        threeShipPanel.add(threeShipLbl);
        threeShipPanel.add(threeShipFld);
        fourShipPanel.add(fourShipLbl);
        fourShipPanel.add(fourShipFld);
        fiveShipPanel.add(fiveShipLbl);
        fiveShipPanel.add(fiveShipFld);
        
        //add panels to main panel
        add(titlePanel);
        add(pwPanel);
        add(matrixPanel);
        add(shipsPanel);
        add(oneShipPanel);
        add(twoShipPanel);
        add(threeShipPanel);
        add(fourShipPanel);
        add(fiveShipPanel);
        add(btnPanel);
	}
	
}
