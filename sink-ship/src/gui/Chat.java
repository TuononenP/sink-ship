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

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import types.Size;

/**
 * A chat textarea with a scrollpanel.
 * 
 * @author Petri Tuononen
 *
 */
public class Chat extends JPanel {

	private static final long serialVersionUID = 3263760057578866398L;
	
	JTextArea textArea;
	
	private String text;
	
	private final static String newline = "\n";
	
	/**
	 * Constructor.
	 */
	public Chat(Size size) {
	}
	
	/**
	 * Constructor.
	 */
	public Chat() {
		//TODO: Change the text to "" later
		String text = "Some sample text just to demonstrate that the" +
				"text area works as intended.";
		JTextArea textArea = new JTextArea(text, 5, 20);
		textArea.setPreferredSize(new Dimension(100, 100));
		textArea.setFont(new Font("Arial", Font.ITALIC, 12));
		JScrollPane scrollPane = new JScrollPane(textArea,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setPreferredSize(new Dimension(250, 250)); //TODO check size later
		//wraps lines that are too long for the display area
		textArea.setLineWrap(true);
		//wrap line after a word
		textArea.setWrapStyleWord(true);
		add(textArea); 
		add(scrollPane);
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
	}

	/**
	 * Get text from the chat window.
	 * @return
	 */
	public String getText() {
		return text;
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
	
}
