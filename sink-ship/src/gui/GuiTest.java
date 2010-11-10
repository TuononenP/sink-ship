package gui;

import gui.panels.BoardPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;

public class GuiTest {
	
	public static void main(String[] args) {
		new Gui(new Dimension(800, 800), new BorderLayout());
		Gui.getFrame().add(new BoardPanel());
		Gui.getFrame().pack();
	}

}
