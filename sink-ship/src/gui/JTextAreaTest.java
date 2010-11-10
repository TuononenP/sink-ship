package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextAreaTest {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("JTextArea Test");
		JFrame.setDefaultLookAndFeelDecorated(false);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String text = "A JTextArea object represents a multiline area for displaying text. "
			+ "You can change the number of lines that can be displayed at a time, "
			+ "as well as the number of columns. You can wrap lines and words too. "
			+ "You can also put your JTextArea in a JScrollPane to make it scrollable.";
		JTextArea textArea = new JTextArea(text, 20, 40);
		textArea.setPreferredSize(new Dimension(100, 100));
		JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		textArea.setLineWrap(true);
		//wraps lines that are too long for the display area
		textArea.setLineWrap(true);
		//wrap line after a word
		textArea.setWrapStyleWord(true);
		frame.setResizable(false);
		frame.add(scrollPane);
		frame.pack();
		frame.setVisible(true);
	}
}