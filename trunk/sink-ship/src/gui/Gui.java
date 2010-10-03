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

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

/**
 * @author Petri Tuononen
 */
public class Gui extends JPanel implements Runnable, MouseListener {

	private static final long serialVersionUID = 8491464846988855678L;
	//global variables
	private static Board board;
	private Coordinates clickedSquare;
	private boolean squareSelected = false;
	private Color seaColor = new Color(81,167,255);
	private Color selectedSquareColor = new Color(159, 227, 126);
	private Color verticeColor = new Color(67,104, 142);
	private int lineWidth = 2;
	private JFrame f;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenu menu2;
	private JMenuItem menuItem;
	private JMenuItem menuItem2;
	private JMenuItem menuItem3;
	private JMenuItem menuItem4;
	private JMenuItem menuItem5;
	
	/**
	 * Constructor.
	 */
	public Gui() {
		 //set panel size
		board = new Board(30, 30);
		//add mouse listener to the panel
		addMouseListener(this);	
		Dimension d = new Dimension(board.getBlockWidth()*board.getHorizontalBlocks(), board.getBlockHeight()*board.getVerticalBlocks());
		setPreferredSize(d);
		createMenubar();
	}

	/**
	 * Main method.
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Gui());
	}

	/**
	 * Menubar.
	 */
	public void createMenubar() {
		//======== menuBar ========
		{
			menuBar = new JMenuBar();
			//======== menu ========
			{
				menu = new JMenu("File");

				//---- menuItem4 ----
				menuItem4 = new JMenuItem("New Game");
				menuItem4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//implement
					}
				});
				menuItem4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
				menu.add(menuItem4);

				//---- menuItem5 ----
				menuItem5 = new JMenuItem("Settings");
				menuItem5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//implement
					}
				});
				menuItem5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0));
				menu.add(menuItem5);

				//---- menuItem ----
				menuItem = new JMenuItem("Quit");
				menuItem.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						quitMenuItemActionPerformed(e);
					}
				});
				menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, 0));
				menu.add(menuItem);

				menuBar.add(menu);

				//======== menu2 ========
				{
					menu2 = new JMenu("Info");

					//---- menuItem2 ----
					menuItem2 = new JMenuItem("Help");
					menuItem2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							helpMenuItemActionPerformed(e);
						}
					});
					//shortcut for help F11
					menuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0));
					menu2.add(menuItem2);

					//---- menuItem3 ----
					menuItem3 = new JMenuItem("About");
					menuItem3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							aboutMenuItemActionPerformed(e);
						}
					});
					menuItem3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, 0));
					menu2.add(menuItem3);
				}
				menuBar.add(menu2);
			}
		}
	}

	/**
	 * Draws the board.
	 * @param g Graphics
	 */
	public void drawBoard(Graphics g) {
		int menuHeight = menuBar.getHeight();
		
		//draw the background sea color
		int width = board.getBlockWidth()*board.getHorizontalBlocks();
		int height = board.getVerticalBlocks()*board.getVerticalBlocks();
		g.setColor(seaColor);
		int x=0, y=menuHeight; //take an account the height of the menubar
		g.fillRect(x, y, width, height);
		
		//draw the horizontal lines
		g.setColor(verticeColor);
		for (int i=1; i<=board.getVerticalBlocks(); i++) {
			g.fillRect(x, i*board.getBlockHeight()-getLineWith(), width, getLineWith());
		}

		//draw the vertical lines
		for (int i=1; i<=board.getHorizontalBlocks(); i++) {
			g.fillRect(i*board.getBlockWidth()-getLineWith(), x, getLineWith(), width);
		}
	}

	/**
	 * Responsible for drawing graphics on the screen.
	 * Paint method is run every time repaint() is called.
	 * @param g Graphics
	 */
	protected void paintComponent(Graphics g) {
		setG1(g);
		drawBoard(getG1());
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
	 * Draws a ship.
	 * @param g Graphics
	 */
	public void drawShip(Graphics g) {
		
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
	 * @param lineWidth
	 */
	public void setLineWidth(int lineWidth) {
		this.lineWidth = lineWidth;
	}

	/**
	 * Get color of the sea.
	 * @return seaColor Color
	 */
	public Color getSeaColor() {
		return seaColor;
	}

	/**
	 * Set color of the sea.
	 * @param seaColor Color
	 */
	public void setSeaColor(Color seaColor) {
		this.seaColor = seaColor;
	}

	/**
	 * Get color of the selected square.
	 * @return selectedSquareColor Color
	 */
	public Color getSelectedSquareColor() {
		return selectedSquareColor;
	}

	/**
	 * Set color for the selected square.
	 * @param selectedSquareColor
	 */
	public void setSelectedSquareColor(Color selectedSquareColor) {
		this.selectedSquareColor = selectedSquareColor;
	}

	/**
	 * Get color of the vertice.
	 * @return verticeColor Color
	 */
	public Color getVerticeColor() {
		return verticeColor;
	}

	/**
	 * Set color of the vertice.
	 * @param verticeColor Color
	 */
	public void setVerticeColor(Color verticeColor) {
		this.verticeColor = verticeColor;
	}

	/**
	 * Get clicked square.
	 * @return
	 */
	public Coordinates getClickedSquare() {
		return clickedSquare;
	}

	/**
	 * Set clicked square.
	 * @param clickedSquare
	 */
	public void setClickedSquare(Coordinates clickedSquare) {
		this.clickedSquare = clickedSquare;
	}

	/**
	 * Returns true if square is selected, false otherwise.
	 * @return
	 */
	public boolean isSquareSelected() {
		return squareSelected;
	}

	/**
	 * Set selected square.
	 * @param squareSelected
	 */
	public void setSquareSelected(boolean squareSelected) {
		this.squareSelected = squareSelected;
	}
	
	/**
	 * Calculate the upper left corner cell coordinates.
	 */
	public Coordinates getUpperLeftCornerCoordinates(int x, int y) {
		//calculate upper-left cell coordinates
		int xPos = (x/board.getBlockWidth())*board.getBlockWidth();
		int yPos = (y/board.getBlockHeight())*board.getBlockHeight();
		return new Coordinates(xPos, yPos);
	}
	
	/**
	 * Paint the defined square on the board.
	 */
	public void paintSquare(int x, int y, Color color) {
		//redraw square color
		getG1().setColor(color);
		getG1().fillRect(x, y, board.getBlockWidth()-getLineWith(), board.getBlockHeight()-getLineWith());
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
		f = new JFrame("Sink a Ship");
		//close frame when pressing close button
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//add content pane to frame
		f.getContentPane().add(new Gui());
		//add menubar to the frame
		f.setJMenuBar(menuBar);
		//        //try to load icon image
		//        try {
		//         f.setIconImage(new ImageIcon("./graphics/icon.jpg").getImage());
		//        }catch (Exception e) {
		//         //icon load error
		//        }
		//make frame visible
		f.setVisible(true);
		//great frame same size as panel and take menubar height into an account
		Dimension d = new Dimension(board.getBlockWidth(), board.getBlockHeight()/*+menuBar.getHeight()*/);
		//set the frame size
		f.setSize(d);
		//don't allow to change the frame size to keep it fixed
		f.setResizable(false);

		// Get the size of the screen
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

		// Determine the new location of the frame
		int w = f.getSize().width;
		int h = f.getSize().height;
		int x = (dim.width-w)/2;
		int y = (dim.height-h)/2;

		// Move the frame to the center of the screen
		f.setLocation(x, y);
		f.pack();
	}

	/**
	 * 'Quit' File menu item pressed.
	 * @param e
	 */
	private void quitMenuItemActionPerformed(ActionEvent e) {
		f.setVisible(false);
		f.dispose();
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
