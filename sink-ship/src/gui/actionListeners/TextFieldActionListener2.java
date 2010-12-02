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
package gui.actionListeners;

import gui.panels.Chat;
import gui.panels.ChatInput;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Key listener for a text field.
 * 
 * @author Petri Tuononen
 *
 */
public class TextFieldActionListener2 implements KeyListener {

	//global variables
	private ChatInput input;
	private Chat chat;

	/**
	 * Constructor.
	 * @param inout ChatInput
	 * @param chat Chat
	 */
	public TextFieldActionListener2(ChatInput input, Chat chat)
	{
		this.input = input;
		this.chat = chat;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getModifiers();
		//if Enter key pressed
		if (key == KeyEvent.VK_ENTER) {
			System.out.println("WORKS!");
			//add a new line from text field to text area
			chat.setText(input.getText());
			//clear text field
			input.setText("");
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

}
