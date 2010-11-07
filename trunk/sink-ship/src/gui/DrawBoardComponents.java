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

import java.awt.Color;
import java.awt.Graphics;

import types.Coordinates;

/**
 * 
 * @author Petri Tuononen
 *
 * TODO: Deploy ships
 * TODO: Pass Ship objects
 */
public class DrawBoardComponents {

	/**
	 * @uml.property  name="g1"
	 */
	private static Graphics g1;

	/**
	 * @uml.property  name="menuHeight"
	 */
	int menuHeight;

	/**
	 * Draws the board.
	 * 
	 * @param g Graphics
	 */
	public void drawBoard(Graphics g) {
		//get menubar height
		menuHeight = 0; //Gui.getMenubar().getHeight();

		//draw the background sea color
		BoardPanel.setBoardWidth(BoardPanel.getBoard().getMatrixSize().getWidth()*
				BoardPanel.getBoard().getBlockSize().getWidth());
		BoardPanel.setBoardHeight(BoardPanel.getBoard().getMatrixSize().getHeight()*
				BoardPanel.getBoard().getBlockSize().getHeight());
		g.setColor(ColorSettings.getSeaColor());
		int x=0, y=menuHeight; //take into an account the height of the menubar
		g.fillRect(x, y, BoardPanel.getBoardWidth(), BoardPanel.getBoardHeight());

		//draw the horizontal lines
		g.setColor(ColorSettings.getLineColor());
		for (int i=1; i<=BoardPanel.getBoard().getMatrixSize().getWidth(); i++) {
			g.fillRect(x, i*BoardPanel.getBoard().getBlockSize().getHeight()-BoardPanel.getLineWidth(),
					BoardPanel.getBoardWidth(), BoardPanel.getLineWidth());
		}

		//draw the vertical lines
		for (int i=1; i<=BoardPanel.getBoard().getMatrixSize().getHeight(); i++) {
			g.fillRect(i*BoardPanel.getBoard().getBlockSize().getWidth()-BoardPanel.getLineWidth(), x,
					BoardPanel.getLineWidth(), BoardPanel.getBoardWidth());
		}
	}

	/**
	 * Draws an x on top of the selected square.
	 * @param g Graphics
	 */
	public void drawX() {
		//get the coordinates of the upper left corner of the clicked square
		Coordinates coords = Calculations.getUpperLeftCornerCoordinates(
				Square.getClickedSquare().getX(), Square.getClickedSquare().getY()
		);
		//paint diagonal line starting from upper-left corner to bottom-right corner
		getG1().drawLine(
				coords.getX(),
				coords.getY(),
				coords.getX()+BoardPanel.getBoard().getBlockSize().getWidth()-BoardPanel.getLineWidth(),
				coords.getY()+BoardPanel.getBoard().getBlockSize().getHeight()-BoardPanel.getLineWidth()
		);
		//paint diagonal line starting from upper-right corner to bottom-left corner
		getG1().drawLine(
				coords.getX()-BoardPanel.getLineWidth()+BoardPanel.getBoard().getBlockSize().getWidth()-BoardPanel.getLineWidth(),
				coords.getY(),
				coords.getX()-BoardPanel.getLineWidth(),
				coords.getY()+BoardPanel.getBoard().getBlockSize().getHeight()-BoardPanel.getLineWidth()
		);
	}

	/** Draws ships.
	 * @param g Graphics
	 */
	public void drawShips(Graphics g) {
		//TODO: Implement drawShips()
	}

	/**
	 * Draws a horizontal aligned ship.
	 * @param startX
	 * @param endX
	 * @param color
	 */
	public void drawHorizontalShip(int startX, int endX, Color color) {
		//TODO: Implement draw horizontal ship
		//		paintSquare(startX, endX, color);
		//		Coordinates coords = getUpperLeftCornerCoordinates(startX, endX);
		//		paintSquare(coords.getX(), coords.getY(), color);
	}	

	/**
	 * Draws a vertical aligned ship.
	 * @param startY
	 * @param endY
	 * @param color Color
	 */
	public void drawVerticalShip(int startY, int endY, Color color) {
		//TODO: Implement draw vertical ship
		//		paintSquare(startY, endY, color);
	}	

	/**
	 * Getter of the property <tt>g1</tt>
	 * @return  Returns the g1.
	 * @uml.property  name="g1"
	 */
	public static Graphics getG1() {
		return g1;
	}

	/**
	 * Setter of the property <tt>g1</tt>
	 * @param g1  The g1 to set.
	 * @uml.property  name="g1"
	 */
	public void setG1(Graphics g1) {
		DrawBoardComponents.g1 = g1;
	}

	/**
	 * Paint the selected square on the board.
	 */
	public void paintSelectedSquare() {
		//get the coordinates of the upper left corner of the clicked square
		Coordinates coords = Calculations.getUpperLeftCornerCoordinates(
				Square.getClickedSquare().getX(),
				Square.getClickedSquare().getY());
		//paint the clicked square
		paintSquare(
				coords.getX(), coords.getY(),
				ColorSettings.getSelectedSquareColor()
		);
	}

	/**
	 * Paint the defined square on the board.
	 */
	public void paintSquare(int x, int y, Color color) {
		//set color
		getG1().setColor(color);
		//redraw square color
		getG1().fillRect(
				x,
				y, 
				BoardPanel.getBoard().getBlockSize().getWidth()-BoardPanel.getLineWidth(),
				BoardPanel.getBoard().getBlockSize().getHeight()-BoardPanel.getLineWidth()
		);
	}
	
}
