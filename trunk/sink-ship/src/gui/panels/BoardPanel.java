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
package gui.panels;

import general.Board;
import gui.DrawBoardComponents;
import gui.Square;
import gui.actionListeners.BoardMouseActionListeners;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import types.Size;

/** 
 * Board panel.
 * 
 * @author  Petri Tuononen
 * 
 */
public class BoardPanel extends JPanel {

	private static final long serialVersionUID = 8491464846988855678L;
	
	/**
	 * @uml.property  name="board"
	 * @uml.associationEnd  
	 */
	private static Board board;
	
	/**
	 * @uml.property  name="lineWidth"
	 */
	private static int lineWidth = 2;
	
	/**
	 * @uml.property  name="boardWidth"
	 */
	private static int boardWidth;
	
	/**
	 * @uml.property  name="boardHeight"
	 */
	private static int boardHeight;
	
	/**
	 * @uml.property  name="dim"
	 */
	private static Dimension dim;
	
	/**
	 * @uml.property  name="components"
	 */
	private DrawBoardComponents components = new DrawBoardComponents(getGraphics());
	
	/**
	 * Default Constructor.
	 * 'Factory set' board and block sizes.
	 */
	public BoardPanel() {
		//set panel size
		board = new Board(new Size(20,20), new Size(30,30));
		//initialize the panel
		init();
	}
	
	/**
	 * Constructor.
	 * Manual size of the board and block size.
	 */
	public BoardPanel(Size s1, Size s2) {
		//set panel size
		board = new Board(s1, s2);
		//initialize the panel
		init();
	}
	
	/**
	 * Initializes the Gui components.
	 */
	private void init() {
		//add mouse listener to the panel
		addMouseListener(new BoardMouseActionListeners());	
		//set dimensions for the board.
		dim = new Dimension(
				board.getMatrixSize().getWidth()*board.getBlockSize().getWidth(),
				board.getMatrixSize().getHeight()*board.getBlockSize().getHeight());
		//set the size for the board.
		setPreferredSize(dim);
	}

	/**
	 * Responsible for drawing graphics on the screen.
	 * Paint method is run every time repaint() is called.
	 * @param g Graphics
	 */
	@Override
	protected void paintComponent(Graphics g) {
		components.drawBoard(g);
		if (Square.isSquareSelected()) {
			//paint the selected square
//			components.paintSelectedSquare();
			components.drawX();
		}
	}

	/**
	 * Get Board.
	 * @return
	 */
	public static Board getBoard() {
		return board;
	}

	/**
	 * Set Board.
	 * @param board
	 */
	public static void setBoard(Board board) {
		BoardPanel.board = board;
	}

	/**
	 * Get width of the line.
	 * @return lineWidth
	 */
	public static int getLineWidth() {
		return lineWidth;
	}

	/**
	 * Set width of the line.
	 * @param  lineWidth
	 * @uml.property  name="lineWidth"
	 */
	public void setLineWidth(int lineWidth) {
		BoardPanel.lineWidth = lineWidth;
	}

	/**
	 * Get dimension of the board.
	 * @return
	 */
	public static Dimension getDim() {
		return dim;
	}

	/**
	 * Set dimension of the board.
	 * @param dim
	 */
	public static void setDim(Dimension dim) {
		BoardPanel.dim = dim;
	}

	/**
	 * Get the width of the board panel.
	 * @return
	 */
	public static int getBoardWidth() {
		return boardWidth;
	}

	/**
	 * Set the width of the board panel.
	 * @param boardWidth
	 */
	public static void setBoardWidth(int boardWidth) {
		BoardPanel.boardWidth = boardWidth;
	}

	/**
	 * Get the height of the board panel.
	 * @return
	 */
	public static int getBoardHeight() {
		return boardHeight;
	}

	/**
	 * Set the height of the board panel.
	 * @param boardHeight
	 */
	public static void setBoardHeight(int boardHeight) {
		BoardPanel.boardHeight = boardHeight;
	}

}
