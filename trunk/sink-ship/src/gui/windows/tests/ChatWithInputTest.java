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
package gui.windows.tests;

import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.LayoutManager;

import gui.Gui;
import gui.actionListeners.TextFieldActionListener;
import gui.panels.Chat;
import gui.panels.ChatInput;

/**
 * Shows Chat window with an input field.
 * 
 * @author Petri Tuononen
 */
public class ChatWithInputTest extends Gui {

	private static final long serialVersionUID = -4041907827100787890L;
	
	private static LayoutManager layout;
	
	public ChatWithInputTest(Dimension d, LayoutManager layout) {
		super(new Dimension(800, 800), new BorderLayout());
		ChatWithInputTest.layout=layout;
		getFrame().add(new Chat(), BorderLayout.NORTH);
		ChatInput inputField = new ChatInput();
		inputField.addKeyListener(new TextFieldActionListener());
		getFrame().add(inputField, BorderLayout.SOUTH);
		getFrame().pack();
	}

	public static void main(String[] args) {
		new ChatWithInputTest(getDimension(), layout);
	}

}
