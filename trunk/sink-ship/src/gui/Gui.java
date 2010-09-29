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
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

	//global variables
	private static Board board;
	private String clickedSquare;
	private JFrame f;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenu menu2;
	private JMenuItem menuItem;
	private JMenuItem menuItem2;
	private JMenuItem menuItem3;
	private JMenuItem menuItem4;
	private JMenuItem menuItem5;
	private int cellWidth;
	private int cellHeight;
	
	/**
	 * Constructor.
	 */
	public Gui() {
		 //set panel size
		setSize(500, 500);
		board = new Board(500, 500);
		//set cell width and height
		setCellWidth(20);
		setCellHeight(20);
		//add mouse listener to the panel
		addMouseListener(this);	
		Dimension d = new Dimension(board.getWidth(), board.getHeight());
		setPreferredSize(d);
		createMenubar();
	}

	/**
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
	 * Draws board.
	 * @param g
	 */
	public void drawBoard(Graphics g) {
		int menuHeight = menuBar.getHeight();
		
		//draw the background sea color
		int width = board.getWidth()*getCellWidth();
		int height = board.getHeight()*getCellHeight();
		Color seaColour = new Color(81,167,255);
		g.setColor(seaColour);
		int x=0, y=menuHeight;
		g.fillRect(x, y, width, height);
		
		//draw the horizontal lines
		Color verticeColor = new Color(67,104, 142);
		g.setColor(seaColour);
		width = board.getWidth()*getCellWidth();
		height = 2;
		//loop
		x=0; y=0; //starting point
		y=menuBar.getHeight();
		g.fillRect(x, y, width, height);
		
		//draw the vertical lines
		height = board.getHeight()*getCellHeight();
		width = 2;
		//loop
		x=0; y=0; //starting point
		
		
	}

	/**
	 * Responsible for drawing graphics on the screen.
	 * Paint method is run every time repaint() is called.
	 */
	protected void paintComponent(Graphics g) {
		setG1(g);
		drawBoard(getG1());
	}

	/**
	 */
	public void drawShips() {

	}

	public int getCellWidth() {
		return cellWidth;
	}

	public void setCellWidth(int cellWidth) {
		this.cellWidth = cellWidth;
	}

	public int getCellHeight() {
		return cellHeight;
	}

	public void setCellHeight(int cellHeight) {
		this.cellHeight = cellHeight;
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
	 * Get clicked square.
	 * @return
	 */
	public String getClickedSquare() {
		return clickedSquare;
	}

	/**
	 * Set clicked square.
	 * @param clickedSquare
	 */
	public void setClickedSquare(String clickedSquare) {
		this.clickedSquare = clickedSquare;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

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
		Dimension d = new Dimension(board.getWidth(), board.getHeight()/*+menuBar.getHeight()*/);
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
				"Info: This software is a part of Advanced Software Engineering" +
				"course at Sungkyunkwan University.\n" +
				"Feedback: petri.tuononen@gmail.com", "About",
				JOptionPane.PLAIN_MESSAGE);
	}

}
