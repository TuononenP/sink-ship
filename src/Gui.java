import java.awt.Color;
import java.awt.Graphics;

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
public class Gui {

	//global variables
	private static Board board;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Create new Board 30x30 matrix
//		board = new Board(30, 30);
		System.out.println("Hello");
	}

	/**
	 * Draws board.
	 * @param g
	 */
	public void drawBoard(Graphics g) {
		int width = board.getWidth();
		int height = board.getHeight();
		
		Color color1 = Color.lightGray;
//		Color color2 = Color.darkGray;
		g.setColor(color1);
		int x=0, y=0, w=20, h=20;
		g.fillRect(x, y, w, h);
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

}
