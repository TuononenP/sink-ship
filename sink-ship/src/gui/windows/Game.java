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
import gui.panels.BoardPanel;
import gui.panels.Chat;
import gui.panels.ChatInput;
import gui.panels.Players;

/**
 * Shows a game view.
 * 
 * @author Petri Tuononen
 */
public class Game extends Gui {

	private static final long serialVersionUID = 2856107391014496766L;
	
	private static LayoutManager layout;
	
	public Game(Dimension d, LayoutManager layout) {
		super(new Dimension(1200, 1000), new BorderLayout());
		Game.layout=layout;
		
		//create panels for left and right side
		JPanel leftPanel = new JPanel(new BorderLayout());
		JPanel rightPanel = new JPanel(new BorderLayout());
		
		//add players panel to the left panel
		leftPanel.add(new Players(new Size(100, 200)));

		//create a board panel with vertical spacing
		JPanel boardPanel = new JPanel(new BorderLayout(10, 0));
		
		//add board panels to the frame
		boardPanel.add(new BoardPanel(new Size(20,20), new Size(20,20)),
				BorderLayout.EAST);
		boardPanel.add(new BoardPanel(new Size(20,20), new Size(20,20)),
				BorderLayout.WEST);
		
		//add board panels to the rightPanel
		rightPanel.add(boardPanel, BorderLayout.NORTH);
		
		//create a chat panel
		JPanel chatPanel = new JPanel(new BorderLayout());
		
		//create a chat window
		Chat chat = new Chat(new Dimension(550, 100));
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
		
		//add chat area and input field to the middle of the right panel
		rightPanel.add(chatPanel, BorderLayout.CENTER);
		
		//create a button panel
		JPanel btnPanel = new JPanel(new BorderLayout());
		
		//create buttons
		//##############
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
        btnPanel.add(disconnectBtn, BorderLayout.EAST);
        
        //add buttons to south of the right panel
        rightPanel.add(btnPanel, BorderLayout.SOUTH);
        
		//add left panel to the frame
		getFrame().add(leftPanel, BorderLayout.WEST);

		//add right panel to the frame
		getFrame().add(rightPanel, BorderLayout.EAST);
		
		//resize the window according to the contents
		getFrame().pack();
		//center the frame to the middle of the physical screen
		Gui.centerPanelToScreen();
	}

	/**
	 * Main method.
	 * @param args
	 */
	public static void main(String[] args) {
		new Game(getDimension(), layout);
	}

}
