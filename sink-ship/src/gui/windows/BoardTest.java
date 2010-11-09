package gui.windows;

import java.awt.EventQueue;

import gui.Gui;
import gui.panels.BoardPanel;

//should show the board
public class BoardTest extends Gui {

	private static final long serialVersionUID = -1853410790696067722L;

	public BoardTest() {
		add(new BoardPanel());
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new BoardTest());
	}

}
