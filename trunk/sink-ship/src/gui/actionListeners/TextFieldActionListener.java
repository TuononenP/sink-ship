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
public class TextFieldActionListener implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		//if Enter key pressed
		if (key == KeyEvent.VK_ENTER) {
			Chat.setText(ChatInput.getText());
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

}
