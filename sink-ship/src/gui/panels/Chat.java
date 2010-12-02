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

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * A chat text area with a scroll panel.
 * 
 * @author Petri Tuononen
 *
 */
public class Chat extends JPanel {

	private static final long serialVersionUID = 3263760057578866398L;
	
	private JTextArea textArea;
	
	private String text;
	
	private final static String newline = "\n";
	
	/**
	 * Default Constructor.
	 */
	public Chat() {
		init(new Dimension(550, 200));
	}

	/**
	 * Constructor.
	 * @param Dimension
	 */
	public Chat(Dimension dimension) {
		init(dimension);
	}
	
	/**
	 * Initializes the Chat frame.
	 */
	private void init(Dimension dimension) {
		textArea = new JTextArea("", 20, 40);
		textArea.setPreferredSize(new Dimension(100, 100));
		textArea.setFont(new Font("Arial", Font.PLAIN, 14));
		JScrollPane scrollPane = new JScrollPane(textArea,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setPreferredSize(dimension); //TODO check size later
		//don't allow editing
		textArea.setEditable(false);
		//wraps lines that are too long for the display area
		textArea.setLineWrap(true);
		//wrap line after a word
		textArea.setWrapStyleWord(true);
        //add scroll pane to the panel
        add(scrollPane, BorderLayout.CENTER);	
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
	 * Get text from the chat window.
	 * @return String
	 */
	public String getText() {
		return textArea.getText();
	}
	
	/**
	 * Add a new line to the chat window.
	 * @param add
	 */
	public void setText(String add) {
		//add a new line of text
		text = text+newline+add;
		//scroll automatically to the bottom of the conversation
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}	

	/**
	 * Erase everything on the chat window.
	 */
	public void erase() {
		textArea.setText("");
	}	
	
}
