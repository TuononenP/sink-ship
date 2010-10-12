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
import general.Coordinates;
import general.Size;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author  Petri Tuononen
 */
public class Gui extends JPanel implements Runnable, MouseListener {

	private static final long serialVersionUID = 8491464846988855678L;
	//global variables
	/**
	 * @uml.property  name="board"
	 * @uml.associationEnd  
	 */
	private static Board board;
	/**
	 * @uml.property  name="clickedSquare"
	 * @uml.associationEnd  
	 */
	private Coordinates clickedSquare;
	/**
	 * @uml.property  name="squareSelected"
	 */
	private boolean squareSelected = false;
	/**
	 * @uml.property  name="seaColor"
	 */
	private Color seaColor = new Color(81,167,255);
	/**
	 * @uml.property  name="selectedSquareColor"
	 */
	private Color selectedSquareColor = new Color(159, 227, 126);
	/**
	 * @uml.property  name="lineColor"
	 */
	private Color lineColor = new Color(67,104, 142);
	/**
	 * @uml.property  name="shipColor"
	 */
	private Color shipColor = new Color(217, 56, 56);
	private int lineWidth = 2;
	/**
	 * @uml.property  name="frame"
	 */
	public JFrame frame;
	/**
	 * @uml.property  name="menuBar"
	 * @uml.associationEnd  
	 */
	private static Menubar menuBar;
//	private JMenu menu;
//	private JMenu menu2;
//	private JMenuItem menuItem;
//	private JMenuItem menuItem2;
//	private JMenuItem menuItem3;
//	private JMenuItem menuItem4;
//	private JMenuItem menuItem5;

	/**
	 * Constructor.
	 */
	public Gui() {
		//set panel size
		board = new Board(new Size(20,20), new Size(30,30));
		//add mouse listener to the panel
		addMouseListener(this);	
		//set dimensions for the board.
		Dimension d = new Dimension(board.getMatrixSize().getWidth()*board.getBlockSize().getWidth(), board.getMatrixSize().getHeight()*board.getBlockSize().getHeight());
		//set the size for the board.
		setPreferredSize(d);
		//create a menubar
		setMenubar(new Menubar());
	}

	/**
	 * Main method.
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Gui());
	}

	/**
	 * Draws the board.
	 * @param g Graphics
	 */
	public void drawBoard(Graphics g) {
		int menuHeight = getMenubar().getHeight();
		
		//draw the background sea color
		int width = board.getMatrixSize().getWidth()*board.getBlockSize().getWidth();
		int height = board.getMatrixSize().getHeight()*board.getBlockSize().getHeight();
		g.setColor(getSeaColor());
		int x=0, y=menuHeight; //take an account the height of the menubar
		g.fillRect(x, y, width, height);

		//draw the horizontal lines
		g.setColor(getLineColor());
		for (int i=1; i<=board.getMatrixSize().getWidth(); i++) {
			g.fillRect(x, i*board.getBlockSize().getHeight()-getLineWith(), width, getLineWith());
		}

		//draw the vertical lines
		for (int i=1; i<=board.getMatrixSize().getHeight(); i++) {
			g.fillRect(i*board.getBlockSize().getWidth()-getLineWith(), x, getLineWith(), width);
		}
	}
	
	/**
	 * Draws an x on top of the selected square.
	 * @param g Graphics
	 */
	public void drawX(Graphics g) {
		
	}

	/**
	 * Responsible for drawing graphics on the screen.
	 * Paint method is run every time repaint() is called.
	 * @param g Graphics
	 */
	protected void paintComponent(Graphics g) {
		setG1(g);
		drawBoard(getG1());
//		drawHorizontalShip(getG1(), 10, 30, getShipColor());
		if (isSquareSelected()) {
			//paint the selected square
			paintSelectedSquare();
		}
	}

	/**
	 * Draws ships.
	 * @param g Graphics
	 */
	public void drawShips(Graphics g) {

	}

	/**
	 * Draws a horizontal aligned ship.
	 * @param g Graphics
	 * @param startX
	 * @param endX
	 * @param color
	 */
	public void drawHorizontalShip(Graphics g, int startX, int endX, Color color) {
		paintSquare(startX, endX, color);
		Coordinates coords = getUpperLeftCornerCoordinates(startX, endX);
		paintSquare(coords.getX(), coords.getY(), color);
	}	

	/**
	 * Draws a vertical aligned ship.
	 * @param g Graphics
	 * @param startY
	 * @param endY
	 * @param color Color
	 */
	public void drawVerticalShip(Graphics g, int startY, int endY, Color color) {
		//redraw square  color
		paintSquare(startY, endY, color);
	}	

	/**
	 * Get frame.
	 * @return  frame
	 * @uml.property  name="frame"
	 */
	public JFrame getFrame() {
		return frame;
	}
	
	/**
	 * Set frame.
	 * @return  frame
	 * @uml.property  name="frame"
	 */
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	/**
	 * Get the menubar.
	 * @return
	 */
	public static Menubar getMenubar() {
		return menuBar;
	}

	/**
	 * Set the menubar.
	 * @param menuBar
	 */
	public static void setMenubar(Menubar menuBar) {
		Gui.menuBar = menuBar;
	}

	/**
	 * @uml.property  name="g1"
	 */
	private Graphics g1;

	/**
	 * Getter of the property <tt>g1</tt>
	 * @return  Returns the g1.
	 * @uml.property  name="g1"
	 */
	public Graphics getG1() {
		return g1;
	}

	/**
	 * Setter of the property <tt>g1</tt>
	 * @param g1  The g1 to set.
	 * @uml.property  name="g1"
	 */
	public void setG1(Graphics g1) {
		this.g1 = g1;
	}

	/**
	 * Get width of the line.
	 * @return lineWidth
	 */
	public int getLineWith() {
		return lineWidth;
	}

	/**
	 * Set width of the line.
	 * @param  lineWidth
	 * @uml.property  name="lineWidth"
	 */
	public void setLineWidth(int lineWidth) {
		this.lineWidth = lineWidth;
	}

	/**
	 * Get color of the sea.
	 * @return  seaColor Color
	 * @uml.property  name="seaColor"
	 */
	public Color getSeaColor() {
		return seaColor;
	}

	/**
	 * Set color of the sea.
	 * @param seaColor  Color
	 * @uml.property  name="seaColor"
	 */
	public void setSeaColor(Color seaColor) {
		this.seaColor = seaColor;
	}

	/**
	 * Get color of the selected square.
	 * @return  selectedSquareColor Color
	 * @uml.property  name="selectedSquareColor"
	 */
	public Color getSelectedSquareColor() {
		return selectedSquareColor;
	}

	/**
	 * Set color for the selected square.
	 * @param  selectedSquareColor
	 * @uml.property  name="selectedSquareColor"
	 */
	public void setSelectedSquareColor(Color selectedSquareColor) {
		this.selectedSquareColor = selectedSquareColor;
	}

	/**
	 * Get the color of the ship.
	 * @return  shipColor
	 * @uml.property  name="shipColor"
	 */
	public Color getShipColor() {
		return shipColor;
	}

	/**
	 * Set the color for the ship.
	 * @param  shipColor
	 * @uml.property  name="shipColor"
	 */
	public void setShipColor(Color shipColor) {
		this.shipColor = shipColor;
	}

	/**
	 * Get color of the line.
	 * @return  verticeColor Color
	 * @uml.property  name="lineColor"
	 */
	public Color getLineColor() {
		return lineColor;
	}

	/**
	 * Set color of the line..
	 * @param lineColor  Color
	 * @uml.property  name="lineColor"
	 */
	public void setLineColor(Color lineColor) {
		this.lineColor = lineColor;
	}

	/**
	 * Get clicked square.
	 * @return
	 * @uml.property  name="clickedSquare"
	 */
	public Coordinates getClickedSquare() {
		return clickedSquare;
	}

	/**
	 * Set clicked square.
	 * @param  clickedSquare
	 * @uml.property  name="clickedSquare"
	 */
	public void setClickedSquare(Coordinates clickedSquare) {
		this.clickedSquare = clickedSquare;
	}

	/**
	 * Returns true if square is selected, false otherwise.
	 * @return
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
	public void setSquareSelected(boolean squareSelected) {
		this.squareSelected = squareSelected;
	}

	/**
	 * Calculate the upper left corner cell coordinates.
	 */
	public Coordinates getUpperLeftCornerCoordinates(int x, int y) {
		//calculate upper-left cell coordinates
		int xPos = (x/board.getBlockSize().getWidth())*board.getBlockSize().getWidth();
		int yPos = (y/board.getBlockSize().getHeight())*board.getBlockSize().getHeight();
		return new Coordinates(xPos, yPos);
	}

	/**
	 * Paint the defined square on the board.
	 */
	public void paintSquare(int x, int y, Color color) {
		//redraw square color
		getG1().setColor(color);
		getG1().fillRect(x, y, board.getBlockSize().getWidth()-getLineWith(), board.getBlockSize().getHeight()-getLineWith());
	}

	/**
	 * Paint the selected square on the board.
	 */
	public void paintSelectedSquare() {
		Coordinates coords = getUpperLeftCornerCoordinates(getClickedSquare().getX(), getClickedSquare().getY());
		paintSquare(coords.getX(), coords.getY(), getSelectedSquareColor());
	}

	/**
	 * Mouse event handler for clicked buttons.
	 */
	public void mouseClicked(MouseEvent e) {
		//identify the mouse button pressed
		switch(e.getModifiers()) {
		//left mouse button pressed
		case InputEvent.BUTTON1_MASK: {
			//set the clicked square
			setClickedSquare(new Coordinates(e.getX(), e.getY()));
			setSquareSelected(true);
			repaint();
			break;
		}
		//right mouse button pressed
		case InputEvent.BUTTON3_MASK: {
			//clear the square selection
			setSquareSelected(false);
			repaint();
			break;
		}
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * This method is run automatically when the object is created.
	 */
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
		//        //try to load icon image
		//        try {
		//         f.setIconImage(new ImageIcon("./graphics/icon.jpg").getImage());
		//        }catch (Exception e) {
		//         //icon load error
		//        }
		//make frame visible
		getFrame().setVisible(true);
		//great frame same size as panel and take menubar height into an account
		Dimension d = new Dimension(board.getBlockSize().getWidth(), board.getBlockSize().getHeight()/*+menuBar.getHeight()*/);
		//set the frame size
		getFrame().setSize(d);
		//don't allow to change the frame size to keep it fixed
		getFrame().setResizable(false);

		// Get the size of the screen
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

		// Determine the new location of the frame
		int w = getFrame().getSize().width;
		int h = getFrame().getSize().height;
		int x = (dim.width-w)/2;
		int y = (dim.height-h)/2;

		// Move the frame to the center of the screen
		getFrame().setLocation(x, y);
		getFrame().pack();
	}

//	/**
//	 * Menubar.
//	 */
//	public void createMenubar() {
//		//======== menuBar ========
//		{
//			menuBar = new JMenuBar();
//			//======== menu ========
//			{
//				menu = new JMenu("File");
//
//				//---- menuItem4 ----
//				menuItem4 = new JMenuItem("New Game");
//				menuItem4.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//						//implement
//					}
//				});
//				menuItem4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
//				menu.add(menuItem4);
//
//				//---- menuItem5 ----
//				menuItem5 = new JMenuItem("Settings");
//				menuItem5.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//						//implement
//					}
//				});
//				menuItem5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0));
//				menu.add(menuItem5);
//
//				//---- menuItem ----
//				menuItem = new JMenuItem("Quit");
//				menuItem.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//						quitMenuItemActionPerformed(e);
//					}
//				});
//				menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, 0));
//				menu.add(menuItem);
//
//				menuBar.add(menu);
//
//				//======== menu2 ========
//				{
//					menu2 = new JMenu("Info");
//
//					//---- menuItem2 ----
//					menuItem2 = new JMenuItem("Help");
//					menuItem2.addActionListener(new ActionListener() {
//						public void actionPerformed(ActionEvent e) {
//							helpMenuItemActionPerformed(e);
//						}
//					});
//					//shortcut for help F11
//					menuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0));
//					menu2.add(menuItem2);
//
//					//---- menuItem3 ----
//					menuItem3 = new JMenuItem("About");
//					menuItem3.addActionListener(new ActionListener() {
//						public void actionPerformed(ActionEvent e) {
//							aboutMenuItemActionPerformed(e);
//						}
//					});
//					menuItem3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, 0));
//					menu2.add(menuItem3);
//				}
//				menuBar.add(menu2);
//			}
//		}
//	}
	
	/**
	 * 'Quit' File menu item pressed.
	 * @param e
	 */
	private void quitMenuItemActionPerformed(ActionEvent e) {
		frame.setVisible(false);
		frame.dispose();
	}

	/**
	 * 'Help' menu item pressed.
	 * @param e
	 */
	private void helpMenuItemActionPerformed(ActionEvent e) {
		new Help().toFront();
	}

	/**
	 * 'About' menu item pressed.
	 * @param e
	 */
	private void aboutMenuItemActionPerformed(ActionEvent e) {
		showAbout();
	}

	/**
	 * Shows about screen.
	 */
	private void showAbout() {
		JOptionPane.showMessageDialog(this,
				"Author: Petri Tuononen\n" +
				"Date: 10/2010\n" +
				"Version: 1.0\n" +
				"Info: This software is a part of Advanced Software Engineering " +
				"course at Sungkyunkwan University.\n" +
				"Feedback: petri.tuononen@gmail.com", "About",
				JOptionPane.PLAIN_MESSAGE);
	}

}
