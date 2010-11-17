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
	 * Constructor.
	 */
	public Chat() {
		//TODO: Change the text to "" later
		String text = "Some sample text just to demonstrate that the " +
				"text area works as intended.";
		textArea = new JTextArea(text, 20, 40);
		textArea.setPreferredSize(new Dimension(100, 100));
		textArea.setFont(new Font("Arial", Font.PLAIN, 14));
		JScrollPane scrollPane = new JScrollPane(textArea,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setPreferredSize(new Dimension(550, 250)); //TODO check size later
		//don't allow editing
		textArea.setEditable(false);
		//wraps lines that are too long for the display area
		textArea.setLineWrap(true);
		//wrap line after a word
		textArea.setWrapStyleWord(true);
		//set layout
        setLayout(new BorderLayout());
        //add scroll pane to the panel
        add(scrollPane, BorderLayout.CENTER);
	}

	/**
	 * Get JTextArea.
	 * @return
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
	 * @return
	 */
	public String getText() {
		return textArea.getSelectedText();
	}
	
	/**
	 * Add a new line to the chat window.
	 * @param text
	 */
	public void setText(String add) {
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
