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

import gui.panels.BoardPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

/**
 * The main GUI component that contains the whole layout
 * for every panel.
 * 
 * @author Petri Tuononen
 *
 * TODO: Make Gui class abstract.
 * TODO: Layout for the Gui component panels.
 * TODO: Place every component to layout.
 * TODO: 	-Add Chat window to the layout
 */
public class Gui extends JFrame {
	
	private static final long serialVersionUID = -8877116975203133901L;

	public static JFrame frame;
	
	private static Gui gui;
	
	private static JMenuBar menuBar = new JMenuBar();
	
	private static Dimension dim = new Dimension();
	
	/**
	 * Constructor.
	 */
	public Gui(Dimension d, LayoutManager layout) {
		//create and set the menubar
		setMenubar(new Menubar().getMenuBar());	

		setDim(d);
		init(d, layout);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosed(WindowEvent e) {
				System.exit(0);
			}

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
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
	 * Get JFrame.
	 * @return
	 */
	public static JFrame getFrame() {
		return frame;
	}

	/**
	 * Set JFrame.
	 * @param frame
	 */
	public void setFrame(JFrame frame) {
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

	public static Dimension getDim() {
		return dim;
	}

	public static void setDim(Dimension dim) {
		Gui.dim = dim;
	}

	public void init(Dimension d, LayoutManager layout) {
		//create a new frame
		frame = new JFrame("Sink a Ship");
		//close frame when pressing the close button
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set look based on the OS settings
		JFrame.setDefaultLookAndFeelDecorated(false);
		//set layout
		frame.setLayout(layout);
		//add menubar to the frame
		frame.setJMenuBar(getMenubar());
		//load icon image
		loadIconImage("./graphics/icon.jpg");
		//set the frame size
		frame.setSize(d);
		//don't allow to change the frame size to keep it fixed
		frame.setResizable(false);
		//center frame to the screen
		centerPanelToScreen();
		//make frame visible
		frame.setVisible(true);
	}
	
	/**
	 * Loads an image to menubar.
	 * 
	 * @param loc Destination of the image.
	 */
	public void loadIconImage(String loc) {
		//TODO: try to load an icon image
//		try {
//			setIconImage(new ImageIcon(loc).getImage());
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
//		int w = getSize().width;
//		int h = getSize().height;
//		int x = (dim.width-w)/2;
//		int y = (dim.height-h)/2;
//
//		// Move the frame to the center of the screen
//		frame.setLocation(x, y);
	}
	
}
