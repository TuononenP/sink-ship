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

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

/**
 * Abstract representation of the GUI.
 * Contains all the common parts for all windows.
 * 
 * @author Petri Tuononen
 *
 */
public abstract class Gui extends JFrame implements Runnable {
	
	private static final long serialVersionUID = 4122243646246419246L;

	public static JFrame frame;
	
	private static Gui gui;
	
	//instantiate the menubar
	private static JMenuBar menuBar = new JMenuBar();
	
	//default location for the application icon
	private static String iconImg = "./graphics/icon.jpg";
	
	/**
	 * Constructor.
	 */
	public Gui() {
		//create and set the menubar
		setMenubar(new Menubar().getMenuBar());	

		//add a window listener
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
	 * Get icon image.
	 * @return
	 */
	public static String getIconImg() {
		return iconImg;
	}

	/**
	 * Set icon image.
	 * @param iconImg
	 */
	public static void setIconImg(String iconImg) {
		Gui.iconImg = iconImg;
	}

	@Override
	abstract public void run();
	
	/**
	 * Initializes the frame.
	 * @param d Dimension
	 */
	public void init(Dimension d) {
		//create a new frame
		frame = new JFrame("Sink a Ship");
		//close frame when pressing the close button
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set look based on the OS settings
		JFrame.setDefaultLookAndFeelDecorated(false);
		//set layout
		frame.setLayout(new BorderLayout()); //TODO: Change this later to GridBadLayout
		//add menubar to the frame
		frame.setJMenuBar(getMenubar());
		//set icon image
		try {
			setIconImage(new ImageIcon(getIconImage()).getImage());
		}catch (Exception e) {
			//icon load error
		}
		frame.setSize(d);
		//don't allow to change the frame size to keep it fixed
		frame.setResizable(false);
		//center frame to the screen
		centerPanelToScreen();
		//pack frame
		frame.pack();
		//make frame visible
		frame.setVisible(true);
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
