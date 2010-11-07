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

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

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
	
	/**
	 * Constructor.
	 */
	public Chat(Size size) {
		//set panel size
//		chat = new Chat(size);
	}
	
	/**
	 * Constructor.
	 */
	public Chat() {
		//set panel size
//		chat = new Chat(new Size(100, 100));
		
		Container container = getRootPane();
		container.setLayout(new FlowLayout());
		
		String text = "Some sample text just to demonstrate that the" +
				"text area works as intended.";
		JTextArea textArea = new JTextArea(text, 5, 10);
		textArea.setPreferredSize(new Dimension(100, 100));
		JScrollPane scrollPane = new JScrollPane(textArea,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		textArea.setLineWrap(true);

		container.add(textArea);
		container.add(scrollPane);
	}	
	
//	/**
//	 * Main method.
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Chat());
//	}
	
}
