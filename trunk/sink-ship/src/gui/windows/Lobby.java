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
package gui.windows;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

import types.Size;

import gui.Gui;
import gui.RoundedButton;
import gui.actionListeners.TextFieldActionListener2;
import gui.menuActions.DisconnectAction;
import gui.menuActions.JoinGameAction;
import gui.panels.Chat;
import gui.panels.ChatInput;
import gui.panels.Players;

/**
 * Shows a lobby view.
 * 
 * @author Petri Tuononen
 */
public class Lobby extends Gui {

	private static final long serialVersionUID = 2856107391014496766L;
	
	private static LayoutManager layout;
	
	public Lobby(Dimension d, LayoutManager layout) {
		super(new Dimension(800, 800), new BorderLayout());
		Lobby.layout=layout;
		
		//add players panel to the frame
		getFrame().add(new Players(new Size(100, 200)), BorderLayout.WEST);
		
		//create a chat panel
		JPanel chatPanel = new JPanel(new BorderLayout());
		
		//create a chat window
		Chat chat = new Chat();
		//add the chat window to chat panel
		chatPanel.add(chat, BorderLayout.NORTH);
		//create an input field
		ChatInput inputField = new ChatInput();
		//add a key listener for the input field
		ChatInput.getInputField().addKeyListener(
				new TextFieldActionListener2(inputField, chat));
//		inputField.getInputField().addKeyListener(
//				new TextFieldActionListener(inputField.getInputField(),
//						chat.getTextArea()));
		//add the input field to the chat panel
		chatPanel.add(inputField, BorderLayout.SOUTH);
		
		//create a button panel
		JPanel btnPanel = new JPanel(new BorderLayout());
		
		//create buttons
		//##############
		//create a ready button
        JButton readyBtn = new JButton("Ready");
        readyBtn.setFont(new Font("Verdana", Font.BOLD, 14));
        readyBtn.setForeground(Color.BLACK);
        readyBtn.setBorder(new RoundedButton(0)); 
        readyBtn.setPreferredSize(new Dimension(100, 40));
        //add action listener for the button
        readyBtn.addActionListener(
        		new JoinGameAction("Ready", KeyEvent.VK_R));
		//create a disconnect button       
        JButton disconnectBtn = new JButton("Disconnect");
        disconnectBtn.setFont(new Font("Verdana", Font.BOLD, 14));
        disconnectBtn.setForeground(Color.BLACK);
        disconnectBtn.setBorder(new RoundedButton(0)); 
        disconnectBtn.setPreferredSize(new Dimension(100, 40));
        //add action listener for the button
        disconnectBtn.addActionListener(
        		new DisconnectAction("Disconnect", KeyEvent.VK_D));
        
        //add buttons to the button panel
        btnPanel.add(readyBtn, BorderLayout.WEST);
        btnPanel.add(disconnectBtn, BorderLayout.EAST);
        
        //add button panel to the frame
        getFrame().add(btnPanel, BorderLayout.SOUTH);
        
		//add the chat panel to the frame
		getFrame().add(chatPanel, BorderLayout.EAST);
		
		getFrame().pack();
		Gui.centerPanelToScreen();
	}

	/**
	 * Main method.
	 * @param args
	 */
	public static void main(String[] args) {
		new Lobby(getDimension(), layout);
	}

}
