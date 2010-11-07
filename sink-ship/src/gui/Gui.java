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

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

/**
 * The main GUI component that contains the whole layout
 * for every panel.
 * 
 * @author Petri Tuononen
 *
 * TODO: Layout for the Gui component panels.
 * TODO: Place every component to layout.
 */
public class Gui extends JFrame implements Runnable {
	
	private static final long serialVersionUID = -8877116975203133901L;

	public static JFrame frame;
	
	private static Gui gui;
	
	private static JMenuBar menuBar = new JMenuBar();
	
	/**
	 * Constructor.
	 */
	public Gui() {
		//create a Gui instance.
		gui = new Gui();
	}

	/**
	 * Get gui instance.
	 * @return
	 */
	public static Gui getGui() {
		return gui;
	}

	/**
	 * Set gui instance.
	 * @param gui
	 */
	public static void setGui(Gui gui) {
		Gui.gui = gui;
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

	@Override
	public void run() {
		//create new frame
		frame = new JFrame("Sink a Ship");
		//set frame
//		setFrame(frame);
		//close frame when pressing close button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//add content pane to frame
		getContentPane().add(new BoardPanel());
		//add menubar to the frame
		setJMenuBar(getMenubar());
		//load icon image
		loadIconImage("./graphics/icon.jpg");
		//make frame visible
		setVisible(true);
		/*
		 * create frame same size same as panel and take menubar height
		 * into an account
		 */
		Dimension d = new Dimension(
				Board.getBlockSize().getWidth(),
				Board.getBlockSize().getHeight()
				);
		//set the frame size
		setSize(d);
		//don't allow to change the frame size to keep it fixed
		setResizable(false);
		//center frame to the screen
		centerPanelToScreen();
		//pack frame
		pack();
	}
	
	/**
	 * Main method.
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Gui());
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
	 * Centers the panel to the center of the screen.
	 */
	public void centerPanelToScreen() {
		//TODO: Center Gui to the screen
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
	
}
