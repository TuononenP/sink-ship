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
package gui.windows;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import javax.swing.*;

/**
 * Help window. Contents are loaded from a html file.
 *
 * @author Petri Tuononen
 */
public class Help extends JFrame {

	private static final long serialVersionUID = 1704781190146407589L;

	/**
	 * Constructor.
	 */
	public Help() {
		initComponents();
	}

	//Variables declaration
	private JScrollPane scrollPane;
	private JEditorPane editorPane;
	private JButton button;

	ClassLoader cl = Thread.currentThread().getContextClassLoader();
	URL urlHelp = cl.getResource("Help.html");

	/**
	 * Initializes graphical user interface components.
	 */
	private void initComponents() {
		if (urlHelp == null) {
			//Help file not found
			System.out.println("NULL");
		}
		scrollPane = new JScrollPane();
		editorPane = new JEditorPane();
		button = new JButton();

		//======== container ========
		setVisible(true);
		setTitle("Help - Sink a Ship");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container contentPane = getContentPane();
		//set layout
		contentPane.setLayout(new GridBagLayout());
		((GridBagLayout)contentPane.getLayout()).columnWidths =
			new int[] {10, 0, 65, 5, 0};
		((GridBagLayout)contentPane.getLayout()).rowHeights = 
			new int[] {10, 0, 30, 5, 0};
		((GridBagLayout)contentPane.getLayout()).columnWeights = 
			new double[] {0.0, 1.0, 0.0, 0.0, 1.0E-4};
		((GridBagLayout)contentPane.getLayout()).rowWeights = 
			new double[] {0.0, 1.0, 0.0, 0.0, 1.0E-4};

		//======== scrollPane ========
		{
			//---- editorPane ----
			editorPane.setEditable(false);
			editorPane.setContentType("text/html");
			scrollPane.setViewportView(editorPane);

			try {
				editorPane.setPage(urlHelp);

			} catch (IOException e) {
				editorPane.setText("Help file not found");
			}
		}
		//add scrollPane
		contentPane.add(scrollPane, new GridBagConstraints(1, 1, 2, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

		//---- button ----
		button.setText("Close");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				closeButtonActionPerformed(e);
			}
		});
		//add button
		contentPane.add(button, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

		//set size of the dialog
		setSize(900, 650);
		//set the dialog to center of the screen
		setLocationRelativeTo(null); 
	}

	/**
	 * Closes frame.
	 * @param e
	 */
	private void closeButtonActionPerformed(ActionEvent e) {
		this.dispose();
	}

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame.setDefaultLookAndFeelDecorated(false);
				new Help();
			}
		});
	}

}