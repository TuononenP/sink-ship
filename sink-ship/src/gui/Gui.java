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
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
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
public class Gui extends JPanel implements Runnable {

	private static final long serialVersionUID = 8491464846988855678L;
	
	/**
	 * @uml.property  name="board"
	 * @uml.associationEnd  
	 */
	private static Board board;
	
	/**
	 * @uml.property  name="clickedSquare"
	 * @uml.associationEnd  
	 */
	private static Coordinates clickedSquare;
	
	/**
	 * @uml.property  name="squareSelected"
	 */
	private static boolean squareSelected = false;
	
	/**
	 * @uml.property  name="lineWidth"
	 */
	private static int lineWidth = 2;
	
	/**
	 * @uml.property  name="frame"
	 */
	public static JFrame frame;
	
	/**
	 * @uml.property  name="d"
	 */
	private Dimension dim;
	
	private DrawComponents components = new DrawComponents();
	
	/**
	 * @uml.property  name="menuBar"
	 * @uml.associationEnd  
	 */
	private static JMenuBar menuBar = new JMenuBar();

	/**
	 * Default Constructor.
	 * 'Factory set' board and block sizes.
	 */
	public Gui() {
		//set panel size
		board = new Board(new Size(20,20), new Size(30,30));
		//initialize the gui components
		init();
	}
	
	/**
	 * Constructor.
	 * Manual size of the board and block size.
	 */
	public Gui(Size s1, Size s2) {
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
		setMenubar(new Menubar().getMenuBar());		
	}

	/**
	 * Main method.
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Gui());
	}

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
		if (isSquareSelected()) {
			//paint the selected square
//			paintSelectedSquare();
			components.drawX();
		}
	}

	/**
	 * Get frame.
	 * @return  frame
	 * @uml.property  name="frame"
	 */
	public static JFrame getFrame() {
		return frame;
	}

	/**
	 * Set frame.
	 * @uml.property  name="frame"
	 */
	public static void setFrame(JFrame frame) {
		Gui.frame = frame;
	}

	/**
	 * Get the menubar.
	 * @return menuBar
	 */
	public static JMenuBar getMenubar() {
		return menuBar;
	}

	/**
	 * Set the menubar.
	 * @param menuBar
	 */
	public void setMenubar(JMenuBar menuBar) {
		Gui.menuBar = menuBar;
	}

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
		Gui.g1 = g1;
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
		Gui.board = board;
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
		Gui.lineWidth = lineWidth;
	}

	/**
	 * Get clicked square.
	 * @return clickedSquare
	 * @uml.property  name="clickedSquare"
	 */
	public static Coordinates getClickedSquare() {
		return clickedSquare;
	}

	/**
	 * Set clicked square.
	 * @param  clickedSquare
	 * @uml.property  name="clickedSquare"
	 */
	public static void setClickedSquare(Coordinates clickedSquare) {
		Gui.clickedSquare = clickedSquare;
	}

	/**
	 * Returns true if square is selected, false otherwise.
	 * @return squareSelected
	 * @uml.property  name="squareSelected"
	 */
	public boolean isSquareSelected() {
		return squareSelected;
	}

	/**
	 * Set selected square.
	 * @param  squareSelected
	 * @uml.property  name="squareSelected"
	 */
	public static void setSquareSelected(boolean squareSelected) {
		Gui.squareSelected = squareSelected;
	}

	/**
	 * Paint the selected square on the board.
	 */
	public void paintSelectedSquare() {
		//get the coordinates of the upper left corner of the clicked square
		Coordinates coords = Calculations.getUpperLeftCornerCoordinates(
				getClickedSquare().getX(), getClickedSquare().getY());
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
	
	/**
	 * Centers the panel to the center of the screen.
	 */
	public void centerPanelToScreen() {
		//TODO: Doesn't work as indented
//		// Get the size of the screen
//		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//
//		// Determine the new location of the frame
//		int w = getFrame().getSize().width;
//		int h = getFrame().getSize().height;
//		int x = (dim.width-w)/2;
//		int y = (dim.height-h)/2;
//
//		// Move the frame to the center of the screen
//		getFrame().setLocation(x, y);
	}
	
	/**
	 * Loads an image to menubar.
	 * 
	 * @param loc Destination of the image.
	 */
	public void loadIconImage(String loc) {
		//TODO: try to load an icon image
//		try {
//			getFrame().setIconImage(new ImageIcon(loc).getImage());
//		}catch (Exception e) {
//			//icon load error
//		}
	}

	/**
	 * This method is run automatically when the object is created.
	 */
	@Override
	public void run() {
		//create new frame
		frame = new JFrame("Sink a Ship");
		//set frame
		setFrame(frame);
		//close frame when pressing close button
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//add content pane to frame
		getFrame().getContentPane().add(new Gui());
		//add menubar to the frame
		getFrame().setJMenuBar(getMenubar());
		loadIconImage("./graphics/icon.jpg");
		//make frame visible
		getFrame().setVisible(true);
		/*
		 * create frame same size same as panel and take menubar height
		 * into an account
		 */
		Dimension d = new Dimension(
				board.getBlockSize().getWidth(),
				board.getBlockSize().getHeight()
				);
		//set the frame size
		getFrame().setSize(d);
		//don't allow to change the frame size to keep it fixed
		getFrame().setResizable(false);
		centerPanelToScreen();
		//pack frame
		getFrame().pack();
	}

}
