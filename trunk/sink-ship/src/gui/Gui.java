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

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

/**
 * Contains all the common parts for all windows.
 * 
 * @author Petri Tuononen
 * 
 */
public class Gui extends JFrame {
	
	private static final long serialVersionUID = 4122243646246419246L;

	public static JFrame frame;
	
	private static Gui gui;
	
	//instantiate the menubar
	private static JMenuBar menuBar = new JMenuBar();
	
	//default location for the application icon
	private static String iconImg = "./graphics/icon.jpg";
	
	private static Graphics g1;
	
	private static Dimension d;
	
	private static LayoutManager layout;
	
	/**
	 * Constructor.
	 */
	public Gui(Dimension d, LayoutManager layout) {
		//initialize
		init(d, layout);
		
		//set dimension
		Gui.d=d;
		
		//set layout
		Gui.layout=layout;

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

	/**
	 * Get Graphics object.
	 * @return Graphics
	 */
	public static Graphics getG1() {
		return g1;
	}

	/**
	 * Set Graphics object.
	 * 
	 * @param g1
	 */
	public static void setG1(Graphics g1) {
		Gui.g1 = g1;
	}

	/**
	 * get Dimension object.
	 * @return Dimension
	 */
	public static Dimension getDimension() {
		return d;
	}

	/**
	 * Set Dimension object.
	 * @param d Dimension
	 */
	public static void setDimension(Dimension d) {
		Gui.d = d;
	}

	/**
	 * Get Layout.
	 * @return layout
	 */
	public LayoutManager getLayout() {
		return layout;
	}

	/**
	 * Set Layout.
	 * @param LayoutManager
	 */
	public void setLayout(LayoutManager layout) {
		Gui.layout = layout;
	}

	/**
	 * Initializes the frame.
	 * @param d Dimension
	 */
	public void init(Dimension d, LayoutManager layout) {
		//create a new frame
		setFrame(new JFrame("Sink a Ship"));
		//close frame when pressing the close button
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set look based on the OS settings
		JFrame.setDefaultLookAndFeelDecorated(false);
		//set layout
		getFrame().setLayout(layout);
		//add menubar to the frame
		getFrame().setJMenuBar(new Menubar().getMenuBar());
		//set icon image
		try {
			setIconImage(new ImageIcon(getIconImage()).getImage());
		}catch (Exception e) {
			//icon load error
		}
		getFrame().setSize(d);
		//don't allow to change the frame size to keep it fixed
		getFrame().setResizable(false);
		//center frame to the screen
		centerPanelToScreen();
		//make frame visible
		getFrame().setVisible(true);
	}
	
	/**
	 * Centers the panel to the center of the screen.
	 */
	public static void centerPanelToScreen() {
		// Get the size of the screen
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		//Determine the new location of the frame
		int w = getFrame().getSize().width;
		int h = getFrame().getSize().height;
		int x = (dim.width-w)/2;
		int y = (dim.height-h)/2;

		// Move the frame to the center of the screen
		Gui.getFrame().setLocation(x, y);
	}
	
//	/**
//	 * Main method.
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		 new Gui(new Dimension(800, 800), new BorderLayout());
//	}
	
}
