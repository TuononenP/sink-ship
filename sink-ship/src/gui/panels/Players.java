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

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import types.Size;

/**
 * Players panel.
 * Shows players currently in the game.
 * 
 * @author Petri Tuononen
 *
 */
public class Players extends JPanel {
	
	private static final long serialVersionUID = 9190972272373542235L;

	private JTextArea textArea;
	
	private final static String newline = "\n";
	
	/**
	 *  Default constructor.
	 */
	public Players() {
		init(new Size(200, 400));
	}
	
	/**
	 * Constructor with size parameter.
	 * @param size Size size of the players text area
	 */
	public Players(Size size) {
		init(size);
	}
	
	/**
	 * Initializes the players text area.
	 * @param size Size of the text area
	 */
	public void init(Size size) {
		//set layout
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		//create title
		JLabel lbl = new JLabel("Players");
		lbl.setFont(new Font("Arial", Font.BOLD, 18));
		//add title to panel
		add(lbl);
		textArea = new JTextArea("Player 1", 5, 20); //TODO: Change text later to ""
		textArea.setPreferredSize(new Dimension(size.getWidth(), size.getHeight()));
		textArea.setFont(new Font("Arial", Font.PLAIN, 14));
		textArea.setBackground(new Color(154, 166, 171));
		//don't allow editing
		textArea.setEditable(false);
        //add text area to the panel
        add(textArea);
	}
	
	/**
	 * Get JTextArea.
	 * @return JTextArea
	 */
	public JTextArea getTextArea() {
		return textArea;
	}

	/**
	 * Set JTextArea.
	 * @param textArea
	 */
	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	/**
	 * Get players from the text area.
	 * @return String
	 */
	public String getPlayers() {
		return textArea.getText();
	}
	
	/**
	 * Add a new player to text area.
	 * @param player String
	 */
	public void addPlayer(String player) {
		textArea.setText(getPlayers()+newline+player);
	}	

	/**
	 * Remove a player name from the text area.
	 */
	public void removePlayer(String player) {
		//TODO: Implement removePlayer()
		getPlayers().replaceAll(player, "");
	}

}
