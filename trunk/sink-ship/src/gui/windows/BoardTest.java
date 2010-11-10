package gui.windows;

import java.awt.EventQueue;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.LayoutManager;

import gui.Gui;
import gui.panels.BoardPanel;

//should show the board
public class BoardTest extends Gui {

	public BoardTest(Dimension d, LayoutManager layout) {
		super(new Dimension(500, 500), new BorderLayout());
		getFrame().add(new BoardPanel());
	}

	private static final long serialVersionUID = -1853410790696067722L;

	public static void main(String[] args) {
		EventQueue.invokeLater(getGui());
	}

}
