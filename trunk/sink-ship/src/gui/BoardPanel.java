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

import general.Board;
import gui.actionListeners.BoardMouseActionListeners;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import types.Coordinates;
import types.Size;

/**
 * The Graphical User Interface of the application.
 * 
 * @author  Petri Tuononen
 * 
 * TODO: Deploy ships
 * TODO: Pass Ship objects
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
	
//	/**
//	 * @uml.property  name="frame"
//	 */
//	public static JFrame frame;
	
	/**
	 * @uml.property  name="dim"
	 */
	private static Dimension dim;
	
	/**
	 * @uml.property  name="components"
	 */
	private DrawBoardComponents components = new DrawBoardComponents();
	
	/**
	 * Default Constructor.
	 * 'Factory set' board and block sizes.
	 */
	public BoardPanel() {
		//set panel size
		board = new Board(new Size(20,20), new Size(30,30));
		//initialize the gui components
		init();
	}
	
	/**
	 * Constructor.
	 * Manual size of the board and block size.
	 */
	public BoardPanel(Size s1, Size s2) {
		//set panel size
		board = new Board(s1, s2);
		//initialize the gui components
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
		//create a menubar
//		setMenubar(new Menubar().getMenuBar());		
	}

//	/**
//	 * Main method.
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new BoardGui());
//	}

	/**
	 * Responsible for drawing graphics on the screen.
	 * Paint method is run every time repaint() is called.
	 * @param g Graphics
	 */
	@Override
	protected void paintComponent(Graphics g) {
		setG1(g);
		components.drawBoard(getG1());
		//		drawHorizontalShip(getG1(), 10, 30, getShipColor());
		if (Square.isSquareSelected()) {
			//paint the selected square
//			paintSelectedSquare();
			components.drawX();
		}
	}

//	/**
//	 * Get frame.
//	 * @return  frame
//	 * @uml.property  name="frame"
//	 */
//	public static JFrame getFrame() {
//		return frame;
//	}
//
//	/**
//	 * Set frame.
//	 * @uml.property  name="frame"
//	 */
//	public static void setFrame(JFrame frame) {
//		BoardGui.frame = frame;
//	}

	/**
	 * @uml.property  name="g1"
	 */
	private static Graphics g1;

	/**
	 * Getter of the property <tt>g1</tt>
	 * @return  Returns the g1.
	 * @uml.property  name="g1"
	 */
	public static Graphics getG1() {
		return g1;
	}

	/**
	 * Setter of the property <tt>g1</tt>
	 * @param g1  The g1 to set.
	 * @uml.property  name="g1"
	 */
	public void setG1(Graphics g1) {
		BoardPanel.g1 = g1;
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
	 * Paint the selected square on the board.
	 */
	public void paintSelectedSquare() {
		//get the coordinates of the upper left corner of the clicked square
		Coordinates coords = Calculations.getUpperLeftCornerCoordinates(
				Square.getClickedSquare().getX(),
				Square.getClickedSquare().getY());
		//paint the clicked square
		paintSquare(
				coords.getX(), coords.getY(),
				ColorSettings.getSelectedSquareColor()
				);
	}
	
	/**
	 * Paint the defined square on the board.
	 */
	public void paintSquare(int x, int y, Color color) {
		//set color
		getG1().setColor(color);
		//redraw square color
		getG1().fillRect(
				x,
				y, 
				board.getBlockSize().getWidth()-getLineWidth(),
				board.getBlockSize().getHeight()-getLineWidth()
				);
	}
	
//	/**
//	 * This method is run automatically when the object is created.
//	 */
//	@Override
//	public void run() {
//		//create new frame
//		frame = new JFrame("Sink a Ship");
//		//set frame
//		setFrame(frame);
//		//close frame when pressing close button
//		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		//add content pane to frame
//		getFrame().getContentPane().add(new BoardGui());
//		//add menubar to the frame
////		getFrame().setJMenuBar(getMenubar());
//		//load icon image
////		loadIconImage("./graphics/icon.jpg");
//		//make frame visible
//		getFrame().setVisible(true);
//		/*
//		 * create frame same size same as panel and take menubar height
//		 * into an account
//		 */
//		Dimension d = new Dimension(
//				board.getBlockSize().getWidth(),
//				board.getBlockSize().getHeight()
//				);
//		//set the frame size
//		getFrame().setSize(d);
//		//don't allow to change the frame size to keep it fixed
//		getFrame().setResizable(false);
//		//center frame to the screen
////		centerPanelToScreen();
//		//pack frame
//		getFrame().pack();
//	}

}
